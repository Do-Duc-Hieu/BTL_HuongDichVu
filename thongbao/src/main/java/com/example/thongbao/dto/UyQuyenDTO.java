package com.example.thongbao.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UyQuyenDTO {
    private Long id;
    private Integer xacnhan;
    private NhanVienDTO nhanVien;
    private QuanLiDTO quanLi;
}
