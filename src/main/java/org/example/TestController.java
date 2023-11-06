package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.YearMonth;

@RestController
public class TestController {
    @GetMapping("/test")
    public TestDto testDto() {
        TestDto testDto = new TestDto();
        testDto.setTest1(Instant.now());
        testDto.setTest2(YearMonth.now());
        return testDto;
    }
}
