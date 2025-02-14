package io.goorm.youtubemy.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/mgr")
public class MemberController { 

    @GetMapping("/members")
    public String list(Model model) {

        return "mgr/members/list";
    }

    @GetMapping("/members/{memberSeq}")
    public String view(@PathVariable Long memberSeq, Model model) {

        return "mgr/members/view";
    }
}
