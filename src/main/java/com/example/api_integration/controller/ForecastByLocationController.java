package com.example.api_integration.controller;



import com.example.api_integration.dto.ResponseDto;
import com.example.api_integration.dto.ResponsePayload;
import com.example.api_integration.service.ForecastByLocationServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ForecastByLocationController {
    @Autowired
    ForecastByLocationServiceImpl forecastByLocationService;
    @GetMapping(value="v1/forecastSummary/location/{location}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponsePayload<ResponseDto> getForecastSumaryByLocation(@PathVariable ("location") String location){
        final ResponseDto responsePayload=forecastByLocationService.fetchForecastByLocation(location);
        return new ResponsePayload<>("Fetched Forecast Summary By Location",responsePayload);
    }
}
