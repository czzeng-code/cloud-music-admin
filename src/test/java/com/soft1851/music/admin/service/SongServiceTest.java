package com.soft1851.music.admin.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SongServiceTest {
    @Resource
    private SongService songService;

    @Test
    void exportData() {
        songService.exportData();
    }
}