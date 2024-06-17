package com.example.chamcong.service;

import com.example.chamcong.dto.UyQuyenDTO;
import com.example.chamcong.entity.NhanVien;
import com.example.chamcong.entity.UyQuyen;
import com.example.chamcong.repository.NhanVienRepository;
import com.example.chamcong.repository.QuanLiRepository;
import com.example.chamcong.repository.ThanhVienRepository;
import com.example.chamcong.repository.UyQuyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adduyquyenService {
    @Autowired
    UyQuyenRepository uyQuyenRepository;

    @Autowired
    NhanVienRepository nhanVienRepository;
    @Autowired
    QuanLiRepository quanLiRepository;

    public void adduyquyenSevice(long a, long b){
        UyQuyen uyQuyen = new UyQuyen();
        uyQuyen.setXacnhan(1);
        uyQuyen.setNhanVien(nhanVienRepository.findById(a).get());
        uyQuyen.setQuanLi(quanLiRepository.findById(b).get());
        uyQuyenRepository.save(uyQuyen);
    }
}
