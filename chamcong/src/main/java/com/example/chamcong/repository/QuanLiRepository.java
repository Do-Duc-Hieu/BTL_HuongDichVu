package com.example.chamcong.repository;

import com.example.chamcong.entity.QuanLi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuanLiRepository  extends JpaRepository<QuanLi, Long> {
}
