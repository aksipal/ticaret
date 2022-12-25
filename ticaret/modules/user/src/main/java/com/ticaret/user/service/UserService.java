package com.ticaret.user.service;

import com.ticaret.user.data.Response;
import com.ticaret.user.dto.UserDto;
import com.ticaret.user.exception.SaveException;
import org.springframework.validation.annotation.Validated;

@Validated
public interface UserService {
    UserDto userSave(@Validated UserDto userDto) throws SaveException;
}
