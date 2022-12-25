package com.ticaret.user.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@Data
@AllArgsConstructor

public class ErrorCode implements Serializable {
    private String errorDetail;
}
