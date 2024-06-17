package com.example.chamcong.repository;

import com.example.chamcong.entity.ThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThanhVienRepository extends JpaRepository<ThanhVien, Long> {
    ThanhVien findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);
}
