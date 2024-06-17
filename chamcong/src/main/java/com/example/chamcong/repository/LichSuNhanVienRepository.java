package com.example.chamcong.repository;

import com.example.chamcong.entity.LichSuNhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface LichSuNhanVienRepository extends JpaRepository<LichSuNhanVien, Long> {
    List<LichSuNhanVien> findByNhanVienId(Long idNhanVien);
}
