package com.cos.BLOG.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {

    // 글 목록 페이지 이동
    @GetMapping("/board")
    public String list() {
        return "borad/list";
    }

    // 글 상세보기 페이지 이동
    @GetMapping("/board/{id}")
    public String detail(@PathVariable int id) {
        return "board/detail";
    }

    // 글 쓰기 페이지로 이동
    @GetMapping("/board/saveForm")
    public String boardSaveForm() {
        return "borad/saveForm";
    }
}
