package io.goorm.youtubemy.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/admin")
public class MemberController {

    @GetMapping("/members")
    public String list(Model model) {

        return "admin/members/list";
    }

    @GetMapping("/members/{membersId}")
    public String view(Model model) {
        return "admin/members/view";
    }
}
