package com.conversor.conversorDeMonedas.logica;

import com.conversor.conversorDeMonedas.modelo.ConnectionApi;
import java.math.BigDecimal;

public class ControlConversorMonedas {
    private String countryTo;
    private String countryFrom;
    private BigDecimal amount;
    
    public ControlConversorMonedas(String to, String from,BigDecimal amount) {
        this.countryTo = to;
        this.countryFrom = from;
        this.amount = amount;
    }
    
    public BigDecimal peticiones(){
        ConnectionApi api = new ConnectionApi();
        return api.conectarApi(this.countryTo,this.countryFrom,this.amount);
    }
}
