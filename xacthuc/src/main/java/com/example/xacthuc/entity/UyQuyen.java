package com.example.xacthuc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "uyquyen")
public class UyQuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer xacnhan;
    @ManyToOne
    @JoinColumn(name = "idNhanVien")
    private NhanVien nhanVien;
    @ManyToOne
    @JoinColumn(name = "idQuanLi")
    private QuanLi quanLi;
}
