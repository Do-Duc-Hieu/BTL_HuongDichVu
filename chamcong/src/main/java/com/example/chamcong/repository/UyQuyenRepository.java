package com.example.chamcong.repository;

import com.example.chamcong.entity.ThoiGianBieu;
import com.example.chamcong.entity.UyQuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UyQuyenRepository extends JpaRepository<UyQuyen, Long> {
}
