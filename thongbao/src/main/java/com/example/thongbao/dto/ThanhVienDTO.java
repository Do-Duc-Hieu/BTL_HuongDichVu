package com.example.thongbao.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ThanhVienDTO {
    private Long id;
    private String ten;
    private String email;
    private String taiKhoan;
    private String viTri;

}
