package io.goorm.youtubemy.admin.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/admins")
    public String list(Model model) {

        return "admin/admin/list";
    }

    @GetMapping("/admins/{adminSeq}")
    public String view(@PathVariable Long adminSeq, Model model) {

        return "admin/admin/view";
    }

    @GetMapping("admins/create")
    public String create(Model model) {

        return "admin/admin/create";
    }

    @GetMapping("/modify")
    public String modify(Model model) {

        return "admin/admin/modify";
    }

}
