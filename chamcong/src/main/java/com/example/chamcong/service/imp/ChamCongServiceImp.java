package com.example.chamcong.service.imp;

import com.example.chamcong.dto.ThoiGianBieuDTO;
import com.example.chamcong.repository.HoaDonRepository;
import com.example.chamcong.repository.LichSuNhanVienRepository;
import com.example.chamcong.repository.NhanVienRepository;
import com.example.chamcong.repository.UyQuyenRepository;
import com.example.chamcong.service.ChamCongService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Component
public class ChamCongServiceImp implements ChamCongService {
    private final WebClient webClient;

    final Logger logger = LoggerFactory.getLogger(ChamCongServiceImp.class);

    public ChamCongServiceImp(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public String xacThuc(ThoiGianBieuDTO[] thoiGianBieuDTOS) {
        String noidung = webClient.post()
                .uri("http://localhost:8081/api/xacthuc")
                .bodyValue(thoiGianBieuDTOS)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return noidung;
    }
}
