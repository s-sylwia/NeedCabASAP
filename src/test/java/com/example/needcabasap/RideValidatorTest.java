package com.example.needcabasap;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RideValidatorTest {

    @Test

    public void shouldReturnSuccesValidationWhenUserGaveCorrectRequest() {
//        given
        RideValidator rideValidator = new RideValidator(new BookDateValidator());
        LocalDateTime now = LocalDateTime.of(2023, 6, 12, 18, 15);
        LocalDateTime bookdate = LocalDateTime.of(2023, 6, 12, 18, 40);
        RideRequest request = new RideRequest(
                "VivaldiStr",
                "BachStr",
                "Zakynthos",
                now,
                now
        );
//        when
        String result = rideValidator.validate(request);
//        then
        assertThat(result).isEqualTo("success");
    }

    @Test
    public void should_return_failed_validation_when_user_wanted_book_ride_in_past() {
        // given
        RideValidator rideValidator = new RideValidator(
                new BookDateValidator());
        LocalDateTime now = LocalDateTime.of(2023, 6, 19, 19, 33);
        LocalDateTime bookDate = LocalDateTime.of(2023, 6, 18, 20, 0);
        RideRequest request = new RideRequest(
                "VivaldiStr",
                "BachStr",
                "Zakynthos",
                now,
                bookDate
        );
        // when
        String result = rideValidator.validate(request);
        // then
        assertThat(result).isEqualTo("failed");
    }

}