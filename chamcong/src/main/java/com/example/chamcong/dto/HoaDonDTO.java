package com.example.chamcong.dto;

import lombok.*;

import java.sql.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HoaDonDTO {
    private Long id;
    private String khachHang;
    private int soGioTinhPhi;
    private Date thoiGianThanhToan;
}
