package com.example.thongbao.repository;

import com.example.thongbao.entity.ThongBao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThongBaoRepository extends JpaRepository<ThongBao, Long> {
    List<ThongBao> findByIdgui(Long idgui);
}
