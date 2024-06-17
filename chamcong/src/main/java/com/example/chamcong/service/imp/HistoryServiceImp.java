package com.example.chamcong.service.imp;

import com.example.chamcong.entity.LichSuNhanVien;
import com.example.chamcong.repository.LichSuNhanVienRepository;
import com.example.chamcong.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HistoryServiceImp implements HistoryService {
    @Autowired
    LichSuNhanVienRepository lichSuNhanVienRepository;
    @Override
    public List<LichSuNhanVien> getLichSu(Long idLichSu) {
        return lichSuNhanVienRepository.findByNhanVienId(idLichSu);
    }
}
