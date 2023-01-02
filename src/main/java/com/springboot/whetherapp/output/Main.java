package com.springboot.whetherapp.output;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonProperty;
@Getter
@Setter
@Data
public class Main {

    private double temp;
    @JsonProperty("feels_like")
    private double feels_like;
    @JsonProperty("temp_min")
    private double temp_min;
    @JsonProperty("temp_max")
    private double temp_max;
    private int pressure;
    private int humidity;


}