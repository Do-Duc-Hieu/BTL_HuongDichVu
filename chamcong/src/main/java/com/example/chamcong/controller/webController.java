package com.example.chamcong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {

    @GetMapping(value = {"/", "/login"})
    public String login(){
        return "login";
    }

    @GetMapping("/menuNhanVien")
    public String getMenuNhanVien() {
        return "menuNhanVien"; // Trả về tên của template hoặc view tương ứng
    }

    @GetMapping("/menuQuanLi")
    public String getMenuQuanLi() {
        return "menuQuanLi"; // Trả về tên của template hoặc view tương ứng
    }

    @GetMapping("/hoSo")
    public String getHoSo(){
        return "hoSo";
    }

    @GetMapping("/backHoSo")
    public String backHoSo(){
        return "/menuNhanVien";
    }
}
