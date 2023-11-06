package org.example;

import lombok.Data;

import java.time.Instant;
import java.time.YearMonth;

@Data
public class TestDto {
    private Instant test1;
    private YearMonth test2;
}
