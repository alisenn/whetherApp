package com.springboot.whetherapp.output;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Wind {

    private double speed;
    private int deg;
    private double gust;

}