package com.springboot.whetherapp.service;

import com.springboot.whetherapp.output.WhetherResponseBean;

public interface WhetherService {
    public WhetherResponseBean fetchWhetherDataByCity(String city);
}
