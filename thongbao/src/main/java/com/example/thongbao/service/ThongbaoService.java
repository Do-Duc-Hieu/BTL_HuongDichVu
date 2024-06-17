package com.example.thongbao.service;

import com.example.thongbao.entity.ThongBao;
import com.example.thongbao.repository.ThongBaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThongbaoService {
    @Autowired
    private ThongBaoRepository thongBaoRepository;

    public void addThongbao(ThongBao thongBao){
        thongBaoRepository.save(thongBao);
    }

    public List<ThongBao> getThongBao(Long id){
        return thongBaoRepository.findByIdgui(id);
    }
}
