package com.termometro.util;

import org.springframework.stereotype.Component;

@Component
public class Convertir {

    public double convierteFarenheitCelsius (double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }

    public double convierteCelsiusFarenheit (double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
