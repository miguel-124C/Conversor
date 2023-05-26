package com.conversor.conversorDeTemperatura.modelo;

public class ConversorTempFunction {
    private Float grado;

    public ConversorTempFunction(Float grado){
        this.grado = grado;
    }

    // Celsius a Fahrenheit	° f = 9/5 (° c) + 32
    public Float celciusToFahrenheit() {
        return (9*(this.grado)/5)+32;
    }
    // Fahrenheit a Celsius	° c = 5/9 (° f - 32)
    public Float fahrenheitToCelcius() {
        return 5*(this.grado-32)/9;
    }
    // Kelvin a Fahrenheit	° f = 9/5 (k - 273) + 32
    public Float kelvinToFahrenheit() {
        return (9*(this.grado-273)/5)+32;
    }
    // Fahrenheit a Kelvin	k = 5/9 (° f - 32) + 273    
    public Float fahrenheitToKelvin() {
        return (5*(this.grado-32)/9)+273;
    }
    // celsius a kelvin	k = ° c + 273
    public Float celciusToKelvin() {
        return this.grado+273;
    }
    // Kelvin a Celsius	° c = k - 273
    public Float kelvinToCelcius() {
        return this.grado-273;
    }
}
