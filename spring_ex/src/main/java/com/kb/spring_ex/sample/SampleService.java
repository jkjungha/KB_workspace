package com.kb.spring_ex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor//생성자 주입 방식(권장 방식)
public class SampleService {
    //@Autowired
    //필드 주입 방식
    @Qualifier("normal")
    private final SampleDAO sampleDAO;
}


