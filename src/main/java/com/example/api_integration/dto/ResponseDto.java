package com.example.api_integration.dto;


import com.example.api_integration.client.Forecast;
import com.example.api_integration.client.Location;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    @JsonProperty("location")
    private Location location=null;

    @JsonProperty("forecast")
    private Forecast forecast=null;

    @Override
    public String toString() {
        return "ResponseDto{" +
                "location=" + location +
                ", forecast=" + forecast +
                '}';
    }
}
