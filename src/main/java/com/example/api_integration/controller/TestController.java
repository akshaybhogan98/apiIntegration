package com.example.api_integration.controller;


import com.example.api_integration.dto.ResponseDto;
import com.example.api_integration.dto.ResponsePayload;
import com.example.api_integration.service.ForecastByLocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    ForecastByLocationServiceImpl apiService;

    @GetMapping("/weather")
    public ResponsePayload<ResponseDto> getWeatherDetails(@PathVariable ("location") String location){
        final ResponseDto fetchForecastByLocation=apiService.fetchForecastByLocation(location);
        return new ResponsePayload<>("Fetched Forecast Summary By Location",fetchForecastByLocation);
    }
}

