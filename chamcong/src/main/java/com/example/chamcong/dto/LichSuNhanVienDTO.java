package com.example.chamcong.dto;

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
