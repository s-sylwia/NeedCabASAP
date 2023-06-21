package com.example.needcabasap;

import java.time.LocalDateTime;

public record RideRequest(String sourceAddress,
                          String destAddress,
                          String city,
                          LocalDateTime now,
                          LocalDateTime bookDate) {
        }
