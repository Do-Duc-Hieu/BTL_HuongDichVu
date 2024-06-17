package com.example.thongbao.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LichSuNhanVienDTO {
    private Long id;
    private String binhLuan;
    private NhanVienDTO nhanVien;

}
