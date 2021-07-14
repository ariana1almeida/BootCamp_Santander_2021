/*Crie uma classe Carro.
 Nessa classe você deverá ter a quantidade de pessoas que estão dentro do carro.
E também é preciso que tenha uma forma de adicionar e remover pessoas de dentro do carro.*/

import javax.swing.*;
import java.util.*;

public class ProgramaCarro {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String deseja;

        Carro carro = new Carro();
        carro.name = "Fiesta";
        carro.placa = "FWH1934";

        int i = 0;

        System.out.println("O nome do carro é: " + carro.name);
        System.out.println("A placa do carro é: " + carro.placa);


        do{
            i++;
           deseja = JOptionPane.showInputDialog("Deseja fazer com que a pessoa número 1 entre no carro? S/N");
                if(deseja.equals("S")) {
                    System.out.println("Pessoa 1 entrou no carro e deu a partida");
                    System.out.println("Viajando...");
                    for(int j = 2;j<6;j++){

                        deseja = JOptionPane.showInputDialog(null,"Pessoa 1 encontrou pessoa "+j+", deseja fazer com que a pessoa "+j+" entre no carro? S/N");
                        if(deseja.equals("S")) {
                            System.out.println("Pessoa "+j+ " entrou no carro.");
                            System.out.println("Viajando...");
                        }
                        else{
                            System.out.println("Pessoa "+j+" decidiu não entrar no carro.");
                            System.out.println("Viajando...");
                        }
                    }
                    break;
                }
                else{
                    System.out.println("Ninguém entrou no carro, ele continua desligado.");

                }
        } while(i<5);


    }

    private static class Carro{
        public String name;
        public String placa;

    }

    private static class Pessoa{

    }

}
