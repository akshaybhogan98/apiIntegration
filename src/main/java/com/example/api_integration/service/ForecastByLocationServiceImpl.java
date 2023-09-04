package com.example.api_integration.service;


import com.example.api_integration.dto.ResponseDto;
import com.example.api_integration.exception.InvalidRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ForecastByLocationServiceImpl implements ForecastByLocation {
    @Value("${host.url}")
    private String apiHost;

    @Value("${host.forecastEndpoint}")
    private String endpoint;

    @Value("${host.hourlyEndpoint}")
    private String hourlyEndpoint;

    @Value("${apiKeyAndValue.key}")
    private String rapidApiKey;

    @Value("${apiKeyAndValue.value}")
    private String rapidApiValue;

    @Value("${hostKeyAndValue.key}")
    private String hostKey;

    @Value("${hostKeyAndValue.value}")
    private String hostValue;

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public ResponseDto fetchForecastByLocation(String location) {
        String url= apiHost+location+endpoint;
        ResponseEntity<ResponseDto> responseEntity;
        HttpHeaders headers=new HttpHeaders();
        headers.set(rapidApiKey,rapidApiValue);
        headers.set(hostKey,hostValue);
        HttpEntity<String> request=new HttpEntity<>("",headers);
        try{
            responseEntity=restTemplate.exchange(url,HttpMethod.GET,request,ResponseDto.class);
            log.info("Response from API:{}",responseEntity);
        }
        catch (HttpServerErrorException | HttpClientErrorException exception){
            throw new InvalidRequestException("Incorrect Header Key/Value Passed or Limit Reached",exception.getStatusCode());
        }

        return responseEntity.getBody();
    }

    @Override
    public ResponseDto fetchHourlyForecastByLocation(String location) {
        String url= apiHost+location+hourlyEndpoint;
        ResponseEntity<ResponseDto> responseEntity;
        HttpHeaders headers=new HttpHeaders();
        headers.set(rapidApiKey,rapidApiValue);
        headers.set(hostKey,hostValue);
        HttpEntity<String> request=new HttpEntity<>("",headers);
        try{
            responseEntity=restTemplate.exchange(url,HttpMethod.GET,request,ResponseDto.class);
            log.info("Response from API:{}",responseEntity);
        }
        catch (HttpServerErrorException | HttpClientErrorException exception){
            throw new InvalidRequestException("Incorrect Header Key/Value Passed or Limit Reached",exception.getStatusCode());
        }
        return responseEntity.getBody();
    }

}
