package com.example.xacthuc.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "thanhvien")
@Inheritance(strategy = InheritanceType.JOINED)
public class ThanhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ten;
    private String email;
    private String taiKhoan;
    private String matKhau;
    private String viTri;
}

