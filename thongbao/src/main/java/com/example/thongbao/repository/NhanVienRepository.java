package com.example.thongbao.repository;

import com.example.thongbao.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository  extends JpaRepository<NhanVien, Long> {
}
