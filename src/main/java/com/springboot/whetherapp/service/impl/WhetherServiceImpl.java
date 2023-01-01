package com.springboot.whetherapp.service.impl;

import com.springboot.whetherapp.output.WhetherResponseBean;
import com.springboot.whetherapp.service.WhetherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("WhetherServiceImpl")
public class WhetherServiceImpl implements WhetherService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public WhetherResponseBean fetchWhetherDataByCity(String cityValue) {

        String url = "https://api.openweathermap.org/data/2.5/weather?appid=75d3fed3e01b594461d91f78d933dbba&q={city}";
        url = url.replace("{city}", cityValue);
        System.out.println("Url is: " + url);

        ResponseEntity<WhetherResponseBean> whetherResponseEntity = null;
        restTemplate.getForEntity(url, WhetherResponseBean.class);
        System.out.println("Response status code is: " + whetherResponseEntity.getStatusCode());
        WhetherResponseBean whetherResponseBean = whetherResponseEntity.getBody();


        return whetherResponseBean;
    }
}
