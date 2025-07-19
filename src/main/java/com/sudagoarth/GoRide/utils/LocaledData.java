package com.sudagoarth.GoRide.utils;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocaledData {
    private String english;
    private String arabic;


    public static LocaledData fromString(String data) {
        return LocaledData.builder().english(data).arabic(data).build();
    }

    public static LocaledData fromString(String english, String arabic) {
        return LocaledData.builder().english(english).arabic(arabic).build();
    }
}
