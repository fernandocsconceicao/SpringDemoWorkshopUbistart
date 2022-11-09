package com.ubistart.springdemo.service;

import com.ubistart.springdemo.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextService {
    @Autowired
    private TextRepository textRepository;

    public String save(String text) {
        if(text.contains("*")){
            return null;
        }
        return textRepository.save(text);
    }
}
