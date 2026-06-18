package com.kb.spring_ex.mapper;

import org.apache.ibatis.annotations.Select;

//데이터베이스의 현재 시각을 문자열로 처리하도록 매퍼 인터페이스 구성함
public interface TimeMapper {
    @Select("select now()")
    String getTime();
}
