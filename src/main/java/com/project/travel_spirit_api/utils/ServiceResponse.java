package com.project.travel_spirit_api.utils;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceResponse<T> {
    protected boolean success;
    protected List<String> messages;
    protected T result; //generic type

    public static ServiceResponse success() {
        return ServiceResponse.builder().success(true).build();
    }

    public static ServiceResponse error(String message) {
        return ServiceResponse.builder().success(false).messages(Arrays.asList(message)).build();
    }
}
