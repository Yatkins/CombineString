package com.example.RestTemplateB.service;

import com.example.RestTemplateB.model.MyString;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StringService
{

    public String returnString(MyString myString){
        return myString.getString() + " is the String";
    }

}