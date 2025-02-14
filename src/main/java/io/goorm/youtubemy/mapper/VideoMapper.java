package io.goorm.youtubemy.mapper;

import io.goorm.youtubemy.vo.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VideoMapper {

    List<Video> selectIndex();

    Video selectById(@Param("seq") Long seq);

    int insert(@Param("board") Video board);

    int update(@Param("board") Video board);

    int delete(@Param("seq") Long seq);
}
