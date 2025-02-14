package io.goorm.youtubemy.controller;

import io.goorm.youtubemy.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
public class IndexController {

    private VideoService videoService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("video", videoService.getBoards());
        return "index";
    }
}
