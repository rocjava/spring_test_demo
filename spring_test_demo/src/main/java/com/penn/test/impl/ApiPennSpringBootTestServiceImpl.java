package com.penn.test.impl;

import com.penn.test.service.IApiPennSpringBootTestService;
import org.springframework.stereotype.Service;

@Service("apiPennSpringBootTestServiceImpl")
public class ApiPennSpringBootTestServiceImpl implements IApiPennSpringBootTestService {
    @Override
    public void testCase() {
        System.out.println("===================springboot service write a log=============");
    }
}
