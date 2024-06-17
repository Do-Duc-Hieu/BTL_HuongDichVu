package com.example.xacthuc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "thoigianbieu")
public class ThoiGianBieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date ngay;
    private int gioDaGhi;
    private int gioTangCa;

    @ManyToOne
    @JoinColumn(name = "idNhanVien")
    private NhanVien nhanVien;
    @ManyToOne
    @JoinColumn(name = "idQuanLi")
    private QuanLi quanLi;
    @ManyToOne
    @JoinColumn(name = "idHoaDon")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "idUyQuyen")
    private UyQuyen uyQuyen;
}