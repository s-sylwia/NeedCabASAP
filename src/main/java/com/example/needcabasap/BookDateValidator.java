package com.example.needcabasap;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class BookDateValidator {

//    private final DateService dateService;
//
//    BookDateValidator(DateService dateService) {
//        this.dateService = dateService;
//    }

    String validateBookDate(RideRequest request) {
        LocalDateTime now = request.now();
        LocalDateTime bookDate = request.bookDate();
        if(now.isAfter(bookDate)){
            return "failed";
        }
        return "success";
    }
}
