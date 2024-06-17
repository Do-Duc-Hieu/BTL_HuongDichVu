package com.example.xacthuc.repository;

import com.example.xacthuc.entity.LichSuNhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LichSuNhanVienRepository extends JpaRepository<LichSuNhanVien, Long> {
    List<LichSuNhanVien> findByNhanVienId(Long idNhanVien);
}