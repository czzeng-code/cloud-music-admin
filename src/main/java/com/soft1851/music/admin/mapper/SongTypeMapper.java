package com.soft1851.music.admin.mapper;

import com.soft1851.music.admin.entity.SongType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zeng
 * @since 2020-04-21
 */
public interface SongTypeMapper extends BaseMapper<SongType> {

    /**
     * 获取所有歌曲类型
     * @return List<SongType>
     */
    @Select("SELECT * FROM song_type ORDER BY song_count DESC")
    List<SongType> getAllType();

    /**
     * 新增一个类型
     * @param songType
     * @return
     */
    @Insert("INSERT INTO song_type (type_id,type_name,type) VALUES(#{typeId},#{typeName},#{type})")
    int addType(SongType songType);

    /**
     * 删除类型，将delete_flag改为1
     * @param typeName
     * @return
     */
    @Update("UPDATE song_type SET delete_flag = 1 WHERE type_name = #{typeName}")
    int deleteType(String typeName);
}
