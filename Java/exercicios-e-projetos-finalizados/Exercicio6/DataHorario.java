package Exercicio6;

import java.text.SimpleDateFormat;
import java.util.Date;
//Converta a Data atual no formato DD/MM/YYYY HH:MM:SS:MMM

public class DataHorario {
    public static void main(String[] args) {
        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");

        String dateFormatada = formatter.format(agora);

        System.out.println(dateFormatada);
    }
}
