package com.soft1851.music.admin.service;

import com.soft1851.music.admin.entity.SongType;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zeng
 * @since 2020-04-21
 */
public interface SongTypeService extends IService<SongType> {
    /**
     * 获取所有歌曲类型
     * @return List<SongType>
     */
    List<SongType> getAllType();

    /**
     * 新增一个类型
     * @param songType
     * @return
     */
    int addType(SongType songType);

    /**
     * 删除类型，将delete_flag改为1
     * @param typeName
     * @return
     */
    int deleteType(String typeName);

}
