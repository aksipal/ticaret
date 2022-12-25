package com.ticaret.user.data;

import com.ticaret.user.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@Data
@AllArgsConstructor
public class Response <T> implements Serializable {

    private T body;
    private ErrorCode errorCode;

}
