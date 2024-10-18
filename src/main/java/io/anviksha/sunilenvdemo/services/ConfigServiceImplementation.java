package io.anviksha.sunilenvdemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImplementation implements ConfigService {
    private final String key;
    private final String value;

    public ConfigServiceImplementation(
            @Value("${app.key}") String key,
            @Value("${app.value}") String value
    ) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }
}
