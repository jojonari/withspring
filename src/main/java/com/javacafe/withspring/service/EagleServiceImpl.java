package com.javacafe.withspring.service;

import org.springframework.stereotype.Service;

/**
 * Created by jojonari on 2017. 6. 9..
 */
@Service(value = "eagleService")
public class EagleServiceImpl implements AnimalService {
    @Override
    public String walking(){
        String walk = "두발로 걷습니다";
        // 비지니스 로직 처리 및 DB 조회결과 리턴
        return walk;
    }

    @Override
    public String flying() {
        return "멋지게 날아오릅니다";
    }
}