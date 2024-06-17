package com.example.chamcong.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class QuanLiDTO extends ThanhVienDTO {
    // You can add specific fields for QuanLi if needed

    public QuanLiDTO(Long id, String ten, String email, String taiKhoan, String viTri) {
        super(id, ten, email, taiKhoan, viTri);
    }
}

