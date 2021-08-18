package com.song_yu.ctroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:
 * @date:
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello, SpringBoot";
    }
}
