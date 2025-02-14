package io.goorm.youtubemy.service;


import io.goorm.youtubemy.mapper.VideoMapper;
import io.goorm.youtubemy.vo.Video;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class VideoService {
    @Autowired
    private VideoMapper videoMapper;

    public List<Video> getBoards (){
        return videoMapper.selectIndex();
    }

    public Video getBoardById(Long seq){ return videoMapper.selectById(seq); }

    public int createBoard(Video board){
        int result = 5;
        try{
            result = videoMapper.insert(board);
            log.debug(result + "");
        }catch (Exception e){
            log.error(e.toString());
        }
        return result;
    }


    public Video updateBoard(Video board){
        int result = videoMapper.update(board);
        log.debug(result + "");

        return board;
    }

    public boolean deleteBoard(Long seq){
        try{
            int result = videoMapper.delete(seq);

            log.debug(result + "");
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
