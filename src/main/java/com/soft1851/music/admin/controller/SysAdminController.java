package com.soft1851.music.admin.controller;


import com.alibaba.fastjson.JSONObject;
import com.soft1851.music.admin.annotation.ControllerWebLog;
import com.soft1851.music.admin.common.ResponseResult;
import com.soft1851.music.admin.common.ResultCode;
import com.soft1851.music.admin.dto.LoginDto;
import com.soft1851.music.admin.entity.SysAdmin;
import com.soft1851.music.admin.entity.SysRole;
import com.soft1851.music.admin.service.SysAdminService;
import com.soft1851.music.admin.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zeng
 * @since 2020-04-21
 */
@RestController
@RequestMapping("/sysAdmin")
@Slf4j
public class SysAdminController {
    @Resource
    private SysAdminService sysAdminService;

    /**
     * 登录
     *
     * @return String
     */
    @PostMapping("/login")
//    @ControllerWebLog(name = "login", isSaved = true)
    public Map login(@RequestBody LoginDto loginDto) {
        log.info(loginDto.toString());
        log.info(loginDto.toString());
        return sysAdminService.login(loginDto);
    }

    @PostMapping("/updateInfo")
    public ResponseResult updateInfo(@RequestBody SysAdmin sysAdmin) {
        sysAdminService.updateInfo(sysAdmin);
        return ResponseResult.success();
    }
}
