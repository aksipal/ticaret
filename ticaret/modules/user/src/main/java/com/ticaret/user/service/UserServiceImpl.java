package com.ticaret.user.service;

import com.ticaret.user.dto.UserDto;
import com.ticaret.user.entity.UserEntity;
import com.ticaret.user.exception.SaveException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserService userService;


    @Override
    public UserDto userSave(UserDto userDto) throws SaveException {
        try {
           UserEntity user = new UserEntity();
            user.setFirstName(user.getFirstName().trim());
            user.setLastName(user.getLastName().trim());
            user.seteMail(user.geteMail().trim());
            user.setPhoneNumber(user.getPhoneNumber().trim());
            return userService.userSave(userDto);
        }catch (SaveException e){
            throw e;
        }


    }
}
