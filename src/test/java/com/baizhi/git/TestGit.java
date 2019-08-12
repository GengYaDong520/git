package com.baizhi.git;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootApplication
public class TestGit {

    @Test
    public void testGit() {
        System.out.println("~~~~~~~~~测试~~~~~~~~~");
    }
}
