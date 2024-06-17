package com.example.thongbao.repository;

import com.example.thongbao.entity.ThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThanhVienRepository extends JpaRepository<ThanhVien, Long> {
    ThanhVien findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);
}
