package com.kitclub.introjpa.controller;

import com.kitclub.introjpa.entity.CaPhe;
import com.kitclub.introjpa.entity.Hang;
import com.kitclub.introjpa.responsitory.CaPheRepository;
import com.kitclub.introjpa.responsitory.HangRepository;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private HangRepository hangRepository;

    @Autowired
    private CaPheRepository caPheRepository;

    @PostMapping("hang")
    public ResponseEntity<Object> createHang(@RequestBody Hang hang){
        return ResponseEntity.ok(hangRepository.save(hang));
    }

    @GetMapping("hang")
    public ResponseEntity<Object> allHang(){
        return ResponseEntity.ok(hangRepository.findAll());
    }

    @GetMapping("hang/search")
    public ResponseEntity<Object> getHangById(@RequestParam(value = "id", required = true) Integer id,
                                              @RequestParam(value = "name") String name){
        return ResponseEntity.ok(hangRepository.findHangByIdOrNameLike(id, name));
    }

    @PostMapping("caphe")
    public ResponseEntity<Object> createCaPhe(@RequestBody CaPhe caPhe){
        return ResponseEntity.ok(caPheRepository.save(caPhe));
    }

    @GetMapping("caphe/hang")
    public ResponseEntity<Object> getCaPheTheoHang(){
        return ResponseEntity.ok(caPheRepository.customQuery());
    }

    @GetMapping("caphe/hang/search")
    public ResponseEntity<Object> getCaPheTheoHangKemTen(@RequestParam String caPheName){
        return ResponseEntity.ok(caPheRepository.customQueryKemTen(caPheName));
    }
}
