package com.guilherdrk.logica;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {

    public static void main(String[] args) throws ParseException {
//        Integer number = 3;
//        numeroPar(number);
//        String frase = "Hoje é segunda feira seis da tarde";
//        stringIgual(frase);
        datas();
    }

    private static void numeroPar(Integer number) {
        if(number % 2 == 0){
            System.out.println("par");
        }else {
            System.out.println("impar");
        }
    }

    private static void stringIgual(String frase) {
        if(frase.contains("segunda feira")){
            if(frase.contains("seis da tarde")){
                System.out.println("hora da alegria");
            }else {
                System.out.println("tristeza");
            }

        }else if(frase.contains("sexta feira") || frase.contains("sabado") ||
                frase.contains("domingo")
        ){
            System.out.println("dia de alegria");
        }
        else {
            System.out.println("dia normal");
        }
    }

    private static void datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2003");

    if (data.before(new Date())){
        System.out.println("esse dia já passou");
    }else {
        System.out.println("esse dia está por vir");
    }

    }
}
