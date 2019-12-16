package com.sian.app.breed.component;

import com.sian.app.breed.config.DataSourceConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @ResponseBody
    @RequestMapping("/test")
    public String login() {

        return dataSourceConfig.toString();
    }

}