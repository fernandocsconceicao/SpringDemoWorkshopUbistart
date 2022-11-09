package com.ubistart.springdemo.controller;

import com.ubistart.springdemo.dto.TextDto;
import com.ubistart.springdemo.entity.Text;
import com.ubistart.springdemo.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ImageController")
@RequestMapping("/text")
public class TextController {
    @Autowired
    private TextService textService;

    @RequestMapping("/save")
    public String saveText(@RequestBody TextDto dto){
        Text text = textService.save(dto);
       return text.getText();
    }

}
