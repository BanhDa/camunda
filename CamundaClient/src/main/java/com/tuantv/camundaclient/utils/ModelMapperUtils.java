package com.tuantv.camundaclient.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ModelMapperUtils {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public static final <T> T map(Object input, Class<T> classType) {
        if (input == null) {
            return null;
        }

        return MODEL_MAPPER.map(input, classType);
    }

}
