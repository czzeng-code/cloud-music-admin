package com.soft1851.music.admin.service;

import com.soft1851.music.admin.entity.SongList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zeng
 * @since 2020-04-21
 */
public interface SongListService extends IService<SongList> {

    /**
     * 查询所有歌单
     * @return
     */
    List<Map<String, Object>> selectAll();

    /**
     * 分页查询
     * @param current
     * @param size
     * @return
     */
    List<SongList> getByPage(int current, int size);

    /**
     * 根据类型分组
     * @return
     */
    List<Map<String, Object>> getByType();

    /**
     * 模糊查询
     * @param filed
     * @return
     */
    List<SongList> blurSelect(String filed);
}
