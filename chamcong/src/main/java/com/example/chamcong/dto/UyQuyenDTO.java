package com.example.chamcong.dto;
import com.example.chamcong.entity.NhanVien;
import com.example.chamcong.entity.QuanLi;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

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
