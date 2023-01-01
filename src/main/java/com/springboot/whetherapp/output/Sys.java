package com.springboot.whetherapp.output;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Sys {

    private int type;
    private int id;
    private String country;
    private int sunrise;
    private int sunset;


}