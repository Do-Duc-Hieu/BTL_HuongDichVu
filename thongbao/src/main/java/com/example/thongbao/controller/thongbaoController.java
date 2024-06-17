package com.example.thongbao.controller;

import com.example.thongbao.dto.*;
import com.example.thongbao.entity.*;
import com.example.thongbao.service.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

@RestController
@RequestMapping("/api/thongbao")
public class thongbaoController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpSession session;
    final Logger logger = LoggerFactory.getLogger(thongbaoController.class);
    @Autowired
    private ThongbaoService thongbaoService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Boolean xacThuc(@RequestBody ThongBao thongBao) {
        thongbaoService.addThongbao(thongBao);
        return true;
    }

    @PostMapping("/getThongbao")
    @ResponseStatus(HttpStatus.OK)
    public List<ThongBao> xacThuc(@RequestBody Long id) {
        return thongbaoService.getThongBao(id);
    }

}
