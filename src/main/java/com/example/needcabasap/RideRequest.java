package com.example.needcabasap;

import java.time.LocalDateTime;

public record RideRequest(String sourceAddress,
                          String destinationAddress,
                          String city,
                          LocalDateTime bookingDate) {
}
