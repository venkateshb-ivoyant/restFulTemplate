package com.ivoyant.userservice.controller;

import com.ivoyant.userservice.dto.ResponseDto;
import com.ivoyant.userservice.entity.User;
import com.ivoyant.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users/")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("create")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId){
        ResponseDto responseDto = userService.getUser(userId);
        return ResponseEntity.ok(responseDto);
    }
}