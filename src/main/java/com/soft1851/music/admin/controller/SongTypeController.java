package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.entity.Song;
import com.soft1851.music.admin.entity.SongType;
import com.soft1851.music.admin.service.SongTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zeng
 * @since 2020-04-21
 */
@RestController
@RequestMapping("/songType")
public class SongTypeController {

    @Resource
    private SongTypeService songTypeService;

    @GetMapping("/all")
    public List<SongType> selectAll() {
        return songTypeService.getAllType();
    }

    @PostMapping("/add")
    public int addType(@RequestBody SongType songType) {
        return songTypeService.addType(songType);
    }


}
