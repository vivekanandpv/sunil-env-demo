package io.anviksha.sunilenvdemo.apis;

import io.anviksha.sunilenvdemo.services.ConfigService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {

    private final ConfigService configService;

    public SampleApi(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> get() {
        return ResponseEntity.ok(
                Map.of(
                        configService.getKey(),
                        configService.getValue()
                )
        );
    }

}
