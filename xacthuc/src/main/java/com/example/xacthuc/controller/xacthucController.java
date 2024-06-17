package com.example.xacthuc.controller;

import com.example.xacthuc.dto.*;
import com.example.xacthuc.entity.*;
import com.example.xacthuc.service.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
@RequestMapping("/api/xacthuc")
@RequiredArgsConstructor
public class xacthucController {
    private final xacthucService xacthucService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String xacThuc(@RequestBody ThoiGianBieuDTO[] thoiGianBieuDTOs) {
        String xacThuc = xacthucService.xacThuc(thoiGianBieuDTOs);
        return xacThuc;
    }
}
