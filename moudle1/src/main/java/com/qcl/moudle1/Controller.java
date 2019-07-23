package com.qcl.moudle1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qcl on 2019-07-23
 * 微信：2501902696
 * desc:
 */
@RestController
public class Controller {


    @GetMapping("/hello1")
    public String hello1(){
        return "我是moudle1";
    }
}
