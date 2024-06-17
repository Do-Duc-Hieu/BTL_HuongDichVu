package com.example.xacthuc.repository;

import com.example.xacthuc.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository  extends JpaRepository<NhanVien, Long> {
}
