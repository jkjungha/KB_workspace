package com.kb.spring_ex.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
@ExtendWith(SpringExtension.class) //Junit5 spring-test 설정
@ContextConfiguration(locations = "file:/webapp/WEB-INF/spring/root-context.xml")//spring 설정 정보 로딩
public class SampleTests {
    @Autowired
    //의존성 주입
    private SampleService sampleService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testService(){
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

    @Test
    public void testConnection() throws Exception{
        Connection conn = dataSource.getConnection();
        log.info(conn);
        Assertions.assertNotNull(conn);

        conn.close();
    }
}
