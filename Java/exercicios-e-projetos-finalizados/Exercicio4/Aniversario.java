package Exercicio4;

import java.util.Date;

/*descubra o timeInMillis do dia que você nasceu;

Converta em um objeto Date;

Verifique se ele é anterior ou posterior a 15 de maio de 2010;*/

public class Aniversario {
    public static void main (String[] args){
        Date meuAniversario = new Date(1019098800000L);
        System.out.println("Meu aniversário é: " + meuAniversario);

        Date dataDada = new Date(1273892400000L);
        System.out.println("E a data dada é: " + dataDada);

        boolean isBefore = meuAniversario.before(dataDada);
        System.out.println(isBefore);

        int compareCase = meuAniversario.compareTo(dataDada);
        System.out.println(compareCase);
    }
}
