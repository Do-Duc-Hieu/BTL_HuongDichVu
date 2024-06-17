package com.example.chamcong.controller;

import com.example.chamcong.dto.ThanhVienDTO;
import com.example.chamcong.dto.ThoiGianBieuDTO;
import com.example.chamcong.entity.LichSuNhanVien;
import com.example.chamcong.entity.ThanhVien;
import com.example.chamcong.entity.ThongBao;
import com.example.chamcong.entity.UyQuyen;
import com.example.chamcong.service.AuthService;
import com.example.chamcong.service.ChamCongService;
import com.example.chamcong.service.HistoryService;
import com.example.chamcong.service.adduyquyenService;
import com.example.chamcong.service.thongbaoService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class restController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpSession session;
    final Logger logger = LoggerFactory.getLogger(restController.class);
    @Autowired
    private AuthService authService;

    @Autowired
    private ChamCongService chamCongService;

    @Autowired
    private HistoryService historyService;

    @Autowired
    private adduyquyenService adduyquyenService;

    @Autowired
    private thongbaoService thongbaoService;

    public restController() {
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String taiKhoan, @RequestParam String matKhau) {

        // Kiểm tra thông tin đăng nhập và lấy thông tin về vai trò
        ThanhVien thanhVien = authService.login(taiKhoan, matKhau);
        session.setAttribute("thanhVien", thanhVien);
        String viTri = thanhVien.getViTri();
        // Trả về thông tin vai trò
        if (viTri != null) {
            return ResponseEntity.ok(viTri);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

    @PostMapping("/thoiGianBieu")
    public String xacThuc(@RequestBody ThoiGianBieuDTO[] thoiGianBieuDTOs){
        String xacThuc = chamCongService.xacThuc(thoiGianBieuDTOs);
        thongbaoService.thongbaoService(thoiGianBieuDTOs[0].getNhanVien().getId(), thoiGianBieuDTOs[0].getQuanLi().getId(), xacThuc);
        thongbaoService.thongbaoService(thoiGianBieuDTOs[0].getQuanLi().getId(), thoiGianBieuDTOs[0].getNhanVien().getId(), xacThuc);
       // logger.info("ThoiGianBieuDTO received: {}", xacThuc);
        return xacThuc;
    }

    @GetMapping("/employee")
    public ResponseEntity<ThanhVien> getEmployeeFromSession() {
        // Lấy thông tin nhân viên từ session
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        ThanhVien employee = (ThanhVien) request.getSession().getAttribute("thanhVien");
        logger.info("thanhvien received: {}", employee);
        if(employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/employee/history")
    public List<LichSuNhanVien> getEmployeeHistory() {
        // Lấy lịch sử nhận dạng của nhân viên từ cơ sở dữ liệu
        ThanhVien employee = (ThanhVien) session.getAttribute("thanhVien");
        // Thực hiện truy vấn hoặc lấy lịch sử nhận dạng từ service của bạn
        List<LichSuNhanVien> history = historyService.getLichSu(employee.getId());
        return history;
    }



    @PostMapping("/uyquyen")
    public  List<ThongBao> addUyQuyen(@RequestParam long idnhanvien, @RequestParam long idquanli){
        adduyquyenService.adduyquyenSevice(idnhanvien, idquanli);
        thongbaoService.thongbaoService(idquanli, idnhanvien, "da them uy quyen");
        thongbaoService.thongbaoService(idnhanvien, idquanli,"da them uy quyen");
        List<ThongBao> thongBaos = thongbaoService.getByIdQuanLi(idquanli);
        return  thongBaos;
    }

    @GetMapping("/notifications/{quanLiId}")
    public List<ThongBao> getNotificationsForQuanLi(@PathVariable Long quanLiId) {
        // Sử dụng ID quản lí để lấy danh sách thông báo từ cơ sở dữ liệu
        List<ThongBao> notifications = thongbaoService.getByIdQuanLi(quanLiId);
        Collections.reverse(notifications);
        return notifications;
    }
}
