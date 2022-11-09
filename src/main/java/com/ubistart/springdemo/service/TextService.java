package com.ubistart.springdemo.service;

import com.ubistart.springdemo.dto.TextDto;
import com.ubistart.springdemo.entity.Text;
import com.ubistart.springdemo.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextService {
    @Autowired
    private TextRepository textRepository;

    public Text save(TextDto dto) {
        if(dto.getText().contains("*")){
            return null;
        }
        Text text =  new Text(null, dto.getText());
        return textRepository.save(text);
    }
}
