package com.could.feign.service;

import com.could.feign.client.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public  String sayHi(String name){
       return eurekaClientFeign.sayHiClientEureka(name);
    }

}
