package com.ubistart.springdemo.controller;

import com.ubistart.springdemo.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ImageController")
@RequestMapping("/text")
public class ImageController {
    @Autowired
    private TextService textService;

    @RequestMapping("/save")
    public String saveText(){
       return textService.save("Test");
    }

}
