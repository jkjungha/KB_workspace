package com.kb.spring_ex.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class) //Junit5 spring-test 설정
@ContextConfiguration(locations = "file:/webapp/WEB-INF/spring/root-context.xml")//spring 설정 정보 로딩
public class TimeMapperTests {
    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Autowired(required = false)
    private TimeMapper2 timeMapper2;

    @Test
    public void testGetTime(){
        log.info(timeMapper.getTime());
    }

    @Test
    public void testNow(){
        log.info(timeMapper2.getTimeNow());
    }
}
