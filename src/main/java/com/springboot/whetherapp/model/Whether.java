package com.springboot.whetherapp.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonProperty;

import java.sql.Timestamp;
@Getter
@Setter
@Data
public class Whether {
    @JsonProperty("dt")
    private Timestamp timestamp;
    @JsonProperty("country")
    private String country;
    @JsonProperty("name")
    private String city;
    @JsonProperty("temp")
    private String temperature;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("feels_like")
    private String feelsLike;
    @JsonProperty("speed")
    private String windSpeed;



}
