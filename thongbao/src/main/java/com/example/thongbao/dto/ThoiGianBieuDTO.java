package com.example.thongbao.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ThoiGianBieuDTO {
    private Long id;
    private Date ngay;
    private int gioDaGhi;
    private int gioTangCa;
    private NhanVienDTO nhanVien;

    private QuanLiDTO quanLi;
    private HoaDonDTO hoaDon;

    private UyQuyenDTO uyQuyen;
}
