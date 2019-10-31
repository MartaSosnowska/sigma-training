package com.sigma.training.listservice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rest/list")
public class ListController {

    @GetMapping("/time")
    public ResponseEntity<String> getTime(){
        return  ResponseEntity.ok((new Date()).toString());
    }

}
