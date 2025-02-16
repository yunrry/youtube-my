package io.goorm.youtubemy.service;


import io.goorm.youtubemy.mapper.VideoMapper;
import io.goorm.youtubemy.domain.Video;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@org.springframework.stereotype.Service
public class VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    public VideoService(VideoMapper videoMapper) {
        this.videoMapper = videoMapper;
    }

    public List<Video> selectIndex() {

        return videoMapper.selectIndex();
    }

    public List<Video> findAll() {

        return videoMapper.selectAll();
    }

    public Video find(Long videoSeq) {

        return videoMapper.selectById(videoSeq);
    }

    public int save(Video video) {

        return videoMapper.insert(video);
    }

    public int update(Video video) {

        return videoMapper.update(video);
    }

    public int updatePublishYn(Video video) {

        return videoMapper.updatePublishYn(video);
    }

    public int updateDeleteYn(Video video) {

        return videoMapper.updateDeleteYn(video);
    }

}
