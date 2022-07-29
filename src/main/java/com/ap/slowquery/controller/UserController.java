package com.ap.slowquery.controller;

import com.ap.slowquery.entity.DemoUser;
import com.ap.slowquery.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UseService useService;

    @GetMapping("/all")
    public ResponseEntity<List<DemoUser>> getAllUser() {
        return new ResponseEntity(useService.getAllUser(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DemoUser> saveUser(@RequestBody DemoUser demoUser) {
        return new ResponseEntity(useService.save(demoUser), HttpStatus.OK);
    }
}
