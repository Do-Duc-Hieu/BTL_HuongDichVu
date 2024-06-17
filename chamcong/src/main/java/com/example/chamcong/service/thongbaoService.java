package com.example.chamcong.service;

import com.example.chamcong.dto.ThoiGianBieuDTO;
import com.example.chamcong.entity.ThongBao;
import com.example.chamcong.service.imp.ChamCongServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class thongbaoService {
    private final WebClient webClient;

    final Logger logger = LoggerFactory.getLogger(ChamCongServiceImp.class);

    public thongbaoService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Boolean thongbaoService(Long gui, Long nhan, String noidung) {
        ThongBao thongBao = new ThongBao();
        thongBao.setIdgui(gui);
        thongBao.setIdnhan(nhan);
        thongBao.setNoiDung(noidung);

        Boolean xacnhan = webClient.post()
                .uri("http://localhost:8082/api/thongbao")
                .bodyValue(thongBao)
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        return xacnhan;
    }

    public List<ThongBao> getByIdQuanLi(Long id) {

        List <ThongBao> thongBaos = webClient.post()
                .uri("http://localhost:8082/api/thongbao/getThongbao")
                .bodyValue(id)
                .retrieve()
                .bodyToMono(List.class)
                .block();

        return thongBaos;
    }
}
