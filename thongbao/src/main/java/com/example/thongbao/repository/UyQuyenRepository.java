package com.example.thongbao.repository;

import com.example.thongbao.entity.UyQuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UyQuyenRepository extends JpaRepository<UyQuyen, Long> {
}
