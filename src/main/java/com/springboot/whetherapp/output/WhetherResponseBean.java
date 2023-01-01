package com.springboot.whetherapp.output;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonProperty;
@Getter
@Setter
@Data
public class WhetherResponseBean {

    @JsonProperty("weather")
    private String weather;
    @JsonProperty("main")
    private String main;
    @JsonProperty("dt")
    private String dt;
    @JsonProperty("sys")
    private String sys;
    @JsonProperty("wind")
    private String wind;
    @JsonProperty("name")
    private String name;

}
