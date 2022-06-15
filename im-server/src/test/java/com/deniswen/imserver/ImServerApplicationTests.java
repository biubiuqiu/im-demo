package com.deniswen.imserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImServerApplicationTests {

    @Test
    void contextLoads() {

        Integer i = 10;

        test(10,"s");
    }


    public void test(double i,String s){

        System.out.println(i);
        System.out.println(s);
    }

}
