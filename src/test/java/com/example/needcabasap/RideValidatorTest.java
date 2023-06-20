package com.example.needcabasap;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RideValidatorTest {

    @Test

    public void shouldReturnSuccesValidationWhenUserGaveCorrectRequest() {
//        given
        RideValidator rideValidator = new RideValidator();
        LocalDateTime bookdate = LocalDateTime.of(2023, 6, 12, 20, 0);
        RideRequest request = new RideRequest(
                "VivaldiStr",
                "BachStr",
                "Zakynthos",
                bookdate
        );
//        when
        String result = rideValidator.validate(request);
//        then
        assertThat(result).isEqualTo("success");
    }

}