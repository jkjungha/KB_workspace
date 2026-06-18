package com.kb.spring_ex.controller;

import com.kb.spring_ex.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Log4j2
@Controller
@RequestMapping("/todo")
public class TodoController {
    @RequestMapping("/list")
    public void list(){
        log.info("/todo/list....");
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void register(){
        log.info("/todo/register....");
    }

    @PostMapping("/register")
    public void registerPost(TodoDTO todoDTO){
        log.info("Post /todo/registerPost");
        log.info(todoDTO);
    }
}
