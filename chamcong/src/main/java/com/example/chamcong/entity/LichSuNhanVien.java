package com.example.chamcong.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lichsunhanvien")
public class LichSuNhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String binhLuan;

    @ManyToOne
    @JoinColumn(name = "idNhanVien")
    private NhanVien nhanVien;
}