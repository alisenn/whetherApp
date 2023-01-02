package com.springboot.whetherapp.controller;

import com.springboot.whetherapp.output.WhetherResponseBean;
import com.springboot.whetherapp.service.WhetherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:3000"})

@RestController
@RequestMapping("/whether")
public class WhetherController {
    @Value("$(app.city)")
    private String cityParam;
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
