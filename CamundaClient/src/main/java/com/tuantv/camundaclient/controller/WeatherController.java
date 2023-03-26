package com.tuantv.camundaclient.controller;

import com.tuantv.camundaclient.dto.response.WeatherStatusResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weathers")
public class WeatherController {

    @GetMapping()
    public ResponseEntity<WeatherStatusResponse> getWeatherStatus() {
        return ResponseEntity.ok(new WeatherStatusResponse("BAD"));
    }
}
