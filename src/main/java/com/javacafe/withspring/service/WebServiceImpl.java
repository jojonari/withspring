package com.javacafe.withspring.service;

import org.springframework.stereotype.Service;

/**
 * Created by jojonari on 2017. 6. 9..
 */
@Service
public class WebServiceImpl {

    public String getBody(){
        String body = "스프링프레임워크 오버뷰";
        // 비지니스 로직 처리 및 DB 조회결과 리턴
        return body;
    }
}
