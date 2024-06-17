package com.example.thongbao.repository;

import com.example.thongbao.entity.ThoiGianBieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThoiGianBieuRepository extends JpaRepository<ThoiGianBieu, Long> {
}
