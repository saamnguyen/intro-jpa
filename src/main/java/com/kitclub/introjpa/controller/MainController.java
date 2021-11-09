package com.kitclub.introjpa.controller;

import com.kitclub.introjpa.entity.Hang;
import com.kitclub.introjpa.responsitory.HangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private HangRepository hangRepository;

    @PostMapping("hang")
    public ResponseEntity<Object> createHang(@RequestBody Hang hang){
        return ResponseEntity.ok(hangRepository.save(hang));
    }
}
