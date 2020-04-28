package com.soft1851.music.admin.service;

import com.soft1851.music.admin.entity.Song;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zeng
 * @since 2020-04-21
 */
public interface SongService extends IService<Song> {

    /**
     * 查询所有
     * @return
     */
    List<Song> selectAll();

    /**
     * 模糊查
     * @return
     */
    List<Song> getSongBy(String filed);

    /**
     * 通过时间查询
     * @param flag
     * @return
     */
    List<Song> getSongByDate(String flag);
}
