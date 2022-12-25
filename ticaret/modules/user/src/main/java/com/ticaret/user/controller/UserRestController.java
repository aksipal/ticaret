package com.ticaret.user.controller;

import com.ticaret.user.dto.UserDto;
import com.ticaret.user.exception.SaveException;
import com.ticaret.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserRestController implements UserService {

    @Autowired
    UserService userService;

    @PostMapping
    public UserDto save (@RequestHeader("Authorization") String autHeader, @Validated @RequestBody UserDto dto ) throws SaveException {
        return userService.userSave(save(autHeader,dto));
    }

    @Override
    public UserDto userSave(UserDto userDto) throws SaveException {
        return null;
    }


//    @RequestMapping(method = RequestMethod.POST, path = "/save/user",
//            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    UserDto userSave(@Validated UserDto userDto) throws SaveException;


}
