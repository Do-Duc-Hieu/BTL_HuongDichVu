package com.example.chamcong.service.imp;

import com.example.chamcong.entity.ThanhVien;
import com.example.chamcong.repository.ThanhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceImp implements com.example.chamcong.service.AuthService {
    @Autowired
    private ThanhVienRepository thanhVienRepository;
    @Override
    public ThanhVien login(String taiKhoan, String matKhau) {
        return thanhVienRepository.findByTaiKhoanAndMatKhau(taiKhoan, matKhau);
    }
}
