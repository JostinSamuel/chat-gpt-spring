package com.martinez.pe.chatgptspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> ResponseDto<T> success(T data) {
        return new ResponseDto<>(200, "success", data);
    }

    public static <T> ResponseDto<T> fail(T data) {
        return new ResponseDto<>(0, "failed", data);
    }
}
