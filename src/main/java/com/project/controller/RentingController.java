package com.project.controller;

import com.project.controller.dto.RentRequest;
import com.project.manager.RentingManager;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentingController {
    private final RentingManager  rentingManager;

    public RentingController(RentingManager rentingManager) {
        this.rentingManager = rentingManager;
    }

    @GetMapping("/ping")
    public String pingPong(){
        return "pong";
    }

    @PostMapping("/rent")
    public String rent(@RequestBody RentRequest rentRequest){
        throw new NotImplementedException("not implemented yet");
    }
}
