package io.goorm.youtubemy.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Video {
    private Long video_seq;
    private String video;

    private String video_thunail;
    private Long member_seq;

    @JsonProperty("reguser")
    private String regUser;

    @JsonProperty("regdate")
    private LocalDateTime regDate;

    private int publishYn;
    private String deleteYn;
}
