package io.goorm.youtubemy.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Video {

    private Long videoSeq;

    private String video;
    private String videoThumnail;

    private int publishYn;
    private String deleteYn;

    private String memberSeq;
    private String regDate;


}
