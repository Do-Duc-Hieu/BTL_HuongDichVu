package com.example.xacthuc.service;

import com.example.xacthuc.dto.ThoiGianBieuDTO;
import com.example.xacthuc.entity.HoaDon;
import com.example.xacthuc.entity.LichSuNhanVien;
import com.example.xacthuc.entity.NhanVien;
import com.example.xacthuc.entity.UyQuyen;
import com.example.xacthuc.repository.HoaDonRepository;
import com.example.xacthuc.repository.LichSuNhanVienRepository;
import com.example.xacthuc.repository.NhanVienRepository;
import com.example.xacthuc.repository.UyQuyenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;
@Service
@Component
public class xacthucService{
    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Autowired
    private UyQuyenRepository uyQuyenRepository;

    @Autowired
    private LichSuNhanVienRepository lichSuNhanVienRepository;

    @Autowired
    private NhanVienRepository nhanVienRepository;

    final Logger logger = LoggerFactory.getLogger(xacthucService.class);


    public String xacThuc(ThoiGianBieuDTO[] thoiGianBieuDTOS) {
        int tong =0;
        LichSuNhanVien lichSuNhanVien = new LichSuNhanVien();
        Optional<NhanVien> nhanVien = nhanVienRepository.findById(thoiGianBieuDTOS[0].getNhanVien().getId());
        lichSuNhanVien.setNhanVien(nhanVien.get());
        for (ThoiGianBieuDTO thoiGianBieuDTO : thoiGianBieuDTOS) {
            Long idHoaDon = thoiGianBieuDTO.getHoaDon().getId();
            Optional<HoaDon> optionalHoaDon = hoaDonRepository.findById(idHoaDon);

            if (optionalHoaDon.isPresent()) {
                HoaDon hoaDon = optionalHoaDon.get();
                int gioDaGhi = thoiGianBieuDTO.getGioDaGhi();
                int gioThanhToan = hoaDon.getSoGioTinhPhi();
                if (gioDaGhi != gioThanhToan) {
                    lichSuNhanVien.setBinhLuan("Khong khop voi gio thanh toan");
                    lichSuNhanVienRepository.save(lichSuNhanVien);
                    return "Khong khop voi gio thanh toan";
                }else{
                    tong+=gioThanhToan;
                }
            } else {
                lichSuNhanVien.setBinhLuan("Khong tim duoc hoa don");
                lichSuNhanVienRepository.save(lichSuNhanVien);
                return "Khong tim duoc hoa don";
            }

            Long idUyQuyen = thoiGianBieuDTO.getUyQuyen().getId();
            logger.info("idUyQuyen: {}", idUyQuyen);
            if(idUyQuyen !=null){
                Optional<UyQuyen> optionalUyQuyen = uyQuyenRepository.findById(idUyQuyen);
                if (optionalUyQuyen.isPresent()) {
                    UyQuyen uyQuyen = optionalUyQuyen.get();
                    if (uyQuyen.getXacnhan() != 1) {
                        lichSuNhanVien.setBinhLuan("Khong duoc xac nhan uy quyen");
                        lichSuNhanVienRepository.save(lichSuNhanVien);
                        return "Khong duoc xac nhan uy quyen";
                    }else{
                        tong += thoiGianBieuDTO.getGioTangCa();
                    }
                } else {
                    lichSuNhanVien.setBinhLuan("Khong tim duoc uy quyen");
                    lichSuNhanVienRepository.save(lichSuNhanVien);
                    return "Khong tim duoc uy quyen";
                }
            } else if (idUyQuyen == null && thoiGianBieuDTO.getGioTangCa() >0) {
                lichSuNhanVien.setBinhLuan("Khong duoc uy quyen");
                lichSuNhanVienRepository.save(lichSuNhanVien);
                return "Khong duoc uy quyen";
            }

        }

        if(tong>50){
            lichSuNhanVien.setBinhLuan("Vuot qua gio toi da");
            lichSuNhanVienRepository.save(lichSuNhanVien);
            return "Vuot qua gio toi da";
        }
        return "Nop thanh cong";
    }
}
