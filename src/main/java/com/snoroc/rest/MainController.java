package com.snoroc.rest;

import com.snoroc.bean.MyBean;
import io.micrometer.core.instrument.binder.system.UptimeMetrics;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping()
public class MainController {
    private final MyBean myBean;
    private final RestTemplate restTemplate;


    public MainController(MyBean myBean, RestTemplate restTemplate) {
        this.myBean = myBean;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/")
    public MyBean index() {
        return myBean;
    }

}
