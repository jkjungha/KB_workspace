package com.kb.spring_ex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
@Qualifier("normal")
public class SampleDaoImpl implements SampleDAO{

}
