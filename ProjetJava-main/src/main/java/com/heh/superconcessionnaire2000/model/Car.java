package com.heh.superconcessionnaire2000.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@RequiredArgsConstructor
public class Car
{
    @Getter
    private final Integer carId;

    @Getter
    private final String brand;

    @Getter
    private final String model;

    @Getter
    private final Integer year;

    @Getter
    private final String trim;

    @Getter
    private final Integer kms;

    @Getter
    private final Integer price;

    public String carToString()
    {
        return getBrand() + " "
                + getModel() + " "
                + getTrim() + " de "
                + getYear();
    }

    public Integer getAge()
    {
        LocalDate today = LocalDate.now();
        return today.getYear() - this.getYear();
    }
}
