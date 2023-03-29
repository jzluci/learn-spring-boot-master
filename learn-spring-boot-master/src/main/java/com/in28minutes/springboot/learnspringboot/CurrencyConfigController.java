package com.in28minutes.springboot.learnspringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.module.Configuration;
import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigController {

    //when a request is made for a course or set of courses, return back course id, name, and author
    //map a url to the course controller class - /courses - do that with @RequestMapping()

    @Autowired
    private CurrencyServiceConfig config;

    @RequestMapping("/currency-config")
    public CurrencyServiceConfig retrieveAllCourses(){
        return config;
    }

}
