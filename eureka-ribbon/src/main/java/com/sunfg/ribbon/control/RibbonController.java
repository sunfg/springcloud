package com.sunfg.ribbon.control;

import com.sunfg.ribbon.service.RibbonTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonTest ribbonTest;
    @GetMapping
    public  String sayHi(@RequestParam(required = false,defaultValue = "sunfg") String name ){
       return ribbonTest.sayHi(name);
    }
}
