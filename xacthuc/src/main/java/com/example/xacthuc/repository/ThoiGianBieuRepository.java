package com.example.xacthuc.repository;

import com.example.xacthuc.entity.ThoiGianBieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThoiGianBieuRepository extends JpaRepository<ThoiGianBieu, Long> {
}
