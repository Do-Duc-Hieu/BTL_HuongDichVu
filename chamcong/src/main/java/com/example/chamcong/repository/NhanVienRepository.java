package com.example.chamcong.repository;

import com.example.chamcong.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository  extends JpaRepository<NhanVien, Long> {
}
