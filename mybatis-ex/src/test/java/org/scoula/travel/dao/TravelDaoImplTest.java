package org.scoula.travel.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TravelDaoImplTest {
    TravelDao dao = new TravelDaoImpl();

    @Test
    void getTotalCount(){
        int count = dao.getTotalCount();
        Assertions.assertTrue(count > 0, "Total count should be greater than 0");
        System.out.printf("Total count: %d%n", count);
    }

}