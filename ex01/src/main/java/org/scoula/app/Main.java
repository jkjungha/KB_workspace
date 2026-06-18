package org.scoula.app;

import org.scoula.config.ProjectConfig;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /* 스프링 사용하지 않았을 때 기존 방식
               Parrot p = new Parrot();
         */

        /* 새로 생성된 클래스로 스프링이 컨텍스트를 초기화 */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //동일한 타입에 대해서는 1개의 Bean만 추출할 수 있음
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        String s = context.getBean(String.class);
        System.out.println(s);
        Integer n = context.getBean(Integer.class);
        System.out.println(n);


    }
}
