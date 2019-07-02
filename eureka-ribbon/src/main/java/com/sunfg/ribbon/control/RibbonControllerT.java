package com.sunfg.ribbon.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonControllerT {
    @Autowired
    private LoadBalancerClient balancerClient;
@GetMapping("/test")
    public String testRibbon(){
        ServiceInstance instance = balancerClient.choose("eureka-client");
        return instance.getHost()+":"+instance.getPort()
                ;
    }
}
