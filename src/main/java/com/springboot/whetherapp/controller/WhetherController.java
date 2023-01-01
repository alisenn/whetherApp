package com.springboot.whetherapp.controller;

import com.springboot.whetherapp.output.WhetherResponseBean;
import com.springboot.whetherapp.service.WhetherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/whether")
public class WhetherController {

    @Autowired
    WhetherService whetherServiceimpl;
    @RequestMapping(value = "/data", method = RequestMethod.GET,
    consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

    public WhetherResponseBean getWhetherData(@RequestParam String city){
        WhetherResponseBean whetherResponseBean;

        whetherResponseBean = whetherServiceimpl.fetchWhetherDataByCity(city);

        return whetherResponseBean;
    }
}
