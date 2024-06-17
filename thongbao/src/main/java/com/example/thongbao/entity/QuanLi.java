package com.example.thongbao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "quanli")
public class QuanLi extends ThanhVien {

}