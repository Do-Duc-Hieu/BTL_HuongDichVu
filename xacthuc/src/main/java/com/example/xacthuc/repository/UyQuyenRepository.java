package com.example.xacthuc.repository;

import com.example.xacthuc.entity.UyQuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UyQuyenRepository extends JpaRepository<UyQuyen, Long> {
}
