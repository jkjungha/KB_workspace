package com.example.jdbc.domain;

import lombok.*;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private int id;
    private String name;

    @Override
    public String toString(){
        return "Person{"+"id="+id+", name="+name+'\''+"}";
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }
}
