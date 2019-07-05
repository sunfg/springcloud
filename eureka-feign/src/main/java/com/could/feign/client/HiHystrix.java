package com.could.feign.client;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign{

    @Override
    public String sayHiClientEureka(String name) {
        return "hi,"+name+",sorry,error";
    }
}
