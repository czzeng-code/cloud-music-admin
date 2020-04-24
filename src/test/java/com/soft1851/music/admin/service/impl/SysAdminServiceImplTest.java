package com.soft1851.music.admin.service.impl;

import com.soft1851.music.admin.dto.LoginDto;
import com.soft1851.music.admin.service.SysAdminService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SysAdminServiceImplTest {
    @Resource
    private SysAdminService sysAdminService;

    @Test
    void login() {
        LoginDto loginDto = LoginDto.builder()
                .name("mqxu")
                .password("123456")
                .build();
        sysAdminService.login(loginDto);
    }
}