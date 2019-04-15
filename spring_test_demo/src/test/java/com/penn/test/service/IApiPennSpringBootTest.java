package com.penn.test.service;

import com.penn.test.SpringTestDemoApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2019/4/15.
 */
public class IApiPennSpringBootTest extends SpringTestDemoApplicationTests {

    @Autowired
    private IApiPennSpringBootTestService apiPennSpringBootTestService;


    @Test
    public void testService(){
        apiPennSpringBootTestService.testCase();
    }

}
