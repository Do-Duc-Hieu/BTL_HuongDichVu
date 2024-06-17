package com.example.chamcong.repository;

import com.example.chamcong.entity.ThanhVien;
import com.example.chamcong.entity.ThoiGianBieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThoiGianBieuRepository extends JpaRepository<ThoiGianBieu, Long> {
}
