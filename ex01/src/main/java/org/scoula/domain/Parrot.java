package org.scoula.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//Bean : 인스턴스 생성 후 후처리 가능
//Component : 생성 후 후처리 불가

//스프링이 컨텍스트에 인스턴스를 추가할 때
@Component
public class Parrot {
    private String name;

    @PostConstruct//라이브러리 추가해야함
    //인스턴스 생성 후 관리가능하게 함
    public void init(){
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
