package org.scoula.app;

import org.scoula.config.ProjectConfig2;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        /* 타입 중복
            Parrot p = context.getBean(Parrot.class);
            System.out.println(p.getName());
         */

        Parrot p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());
    }
}
