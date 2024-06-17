package com.example.thongbao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "nhanvien")
public class NhanVien extends ThanhVien {

}
