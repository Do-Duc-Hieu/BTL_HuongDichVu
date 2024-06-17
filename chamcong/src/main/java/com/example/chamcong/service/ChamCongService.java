package com.example.chamcong.service;

import com.example.chamcong.dto.ThoiGianBieuDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public interface ChamCongService {
    public String xacThuc(ThoiGianBieuDTO[] thoiGianBieuDTOS);
}
