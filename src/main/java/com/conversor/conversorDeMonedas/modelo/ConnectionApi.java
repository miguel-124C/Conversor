package com.conversor.conversorDeMonedas.modelo;

import java.io.IOException;
import java.math.BigDecimal;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;


public class ConnectionApi {
    
    public BigDecimal conectarApi(String to, String from,BigDecimal amount){
        try{
            OkHttpClient client = new OkHttpClient().newBuilder().build();

            Request request = new Request.Builder()
              .url("https://api.apilayer.com/fixer/convert?to="+to+"&from="+from+"&amount="+amount)
              .addHeader("apikey", "a4IDXG11G6M4VPQMOJEYXyneM1ZNOgm1")
              .build();
            Response response = client.newCall(request).execute();
            
            JSONObject json = new JSONObject(response.body().string());
            
            return json.getBigDecimal("result");
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
