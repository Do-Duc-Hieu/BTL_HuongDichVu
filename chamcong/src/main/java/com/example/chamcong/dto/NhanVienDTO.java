package com.example.chamcong.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class NhanVienDTO extends ThanhVienDTO {
    // You can add specific fields for NhanVien if needed

    public NhanVienDTO(Long id, String ten, String email, String taiKhoan, String viTri) {
        super(id, ten, email, taiKhoan, viTri);
    }
}
