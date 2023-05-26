package com.conversor.conversorDeNumeros.logica;

import java.text.DecimalFormat;

public class Operaciones {
    private String num;

    public Operaciones(String string){
        this.num = string;
    }

    public String transformarDecimalBin(){
        String resultado = "";
        Integer cociente = Integer.valueOf(this.num);
        Integer resto;
        do{ 
            resto = cociente % 2;
            resultado = resto + resultado;
            cociente /= 2;
        }while (cociente > 0);

        return resultado;
    }

    public String transformarDecimalHexa() {
        String resultado = "";
        Integer cociente = Integer.valueOf(this.num);
        Integer resto;
        do{ 
            resto = cociente % 16;
            if(resto == 10)resultado+= "A";
            if(resto == 11)resultado+= "B";
            if(resto == 12)resultado+= "C";
            if(resto == 13)resultado+= "D";
            if(resto == 14)resultado+= "E";
            if(resto == 15)resultado+= "F";
            else if(resto < 10){
                resultado = resto + resultado;
            }
            cociente /= 16;
        }while (cociente > 0);

        return resultado;
    }

    public String transformarDecimalOctal() {
        String resultado = "";
        Integer cociente = Integer.valueOf(this.num);
        Integer resto;
        do{ 
            resto = cociente % 8;
            resultado = resto + resultado;
            cociente /= 8;
        }while (cociente > 0);

        return resultado;
    }
//48 -> 0   49 -> 1
    public String transformarBinDecimal() {
        String numBin =this.num.toString();
        Double resultado = (double) 0;
        for(int i = numBin.length()-1;i>=0;i--)
            if(numBin.charAt(i) == 49)
                resultado += (Math.pow(2, (numBin.length()-1)-i));

        DecimalFormat df = new DecimalFormat("#");
        return df.format(resultado);
    }

    public String transformarHexDecimal() {
        Integer resultado = 0;
        String cociente = (this.num).toUpperCase();
        String digitos = "0123456789ABCDEF";

        for (int i = 0; i < cociente.length(); i++) {
            char caracter = cociente.charAt(i);
            int dig = digitos.indexOf(caracter);

            resultado = 16 * resultado + dig;
        }

        return resultado.toString();
    }

    public String transformarOctalDecimal() {
        Integer resultado = 0;
        Integer cociente = Integer.valueOf(this.num);
        for(int i=0;cociente>0;i++){
            resultado += (int) (cociente%10 * Math.pow(8, i));
            System.out.println(resultado);
            cociente /= 10;
        }

        return resultado.toString();
    }

    public String transformarBinHexa() {
        this.num = this.transformarBinDecimal();
        return this.transformarDecimalHexa();
    }

    public String transformarBinOctal() {
        this.num =this.transformarBinDecimal();
        return this.transformarDecimalOctal();
    }

    public String transformarHexaBin() {
        this.num = this.transformarHexDecimal();
        return this.transformarDecimalBin();
    }

    public String transformarOctalBin() {
        this.num = this.transformarOctalDecimal();
        return this.transformarDecimalBin();
    }

    public String transformarHexaOctal() {
        this.num = this.transformarHexDecimal();
        return this.transformarDecimalOctal();
    }

    public String transformarOctalHexa() {
        this.num = this.transformarOctalDecimal();
        return this.transformarDecimalHexa();
    }
}
