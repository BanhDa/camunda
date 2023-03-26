package com.tuantv.camundaclient.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import java.io.IOException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
    }

    public static final <T> T parse(String json, Class<T> classType) {
        if (!StringUtils.hasText(json)) {
            return null;
        }

        try {
            return OBJECT_MAPPER.readValue(json, classType);
        } catch (IOException e) {
            return null;
        }
    }

    public static final String toString(Object input) {
        if (input == null) {
            return "";
        }

        try {
            return OBJECT_MAPPER.writeValueAsString(input);
        } catch (JsonProcessingException e) {
            return "";
        }
    }
}
