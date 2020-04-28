package com.soft1851.music.admin.service.impl;

import com.soft1851.music.admin.entity.SongType;
import com.soft1851.music.admin.mapper.SongTypeMapper;
import com.soft1851.music.admin.service.SongTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zeng
 * @since 2020-04-21
 */
@Service
public class SongTypeServiceImpl extends ServiceImpl<SongTypeMapper, SongType> implements SongTypeService {

    @Resource
    private SongTypeMapper songTypeMapper;

    @Override
    public List<SongType> getAllType() {
        return songTypeMapper.getAllType();
    }

    @Override
    public int addType(SongType songType) {
        return songTypeMapper.addType(songType);
    }

    @Override
    public int deleteType(String typeName) {
        return songTypeMapper.deleteType(typeName);
    }
}
