package com.example.chamcong.service;

import com.example.chamcong.entity.ThanhVien;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    public ThanhVien login(String taiKhoan, String matKhau);
}
