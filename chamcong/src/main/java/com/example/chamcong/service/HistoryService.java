package com.example.chamcong.service;

import com.example.chamcong.entity.LichSuNhanVien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HistoryService {
    public List<LichSuNhanVien> getLichSu(Long idLichSu);
}
