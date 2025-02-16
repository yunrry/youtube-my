package io.goorm.youtubemy.controller;

import io.goorm.youtubemy.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private VideoService videoService;

    //리스트
    @GetMapping("/")
    public String  list(Model model) {

        model.addAttribute("videos", videoService.selectIndex());
        model.addAttribute("title", "home title");

        return "test/home";
    }

}
