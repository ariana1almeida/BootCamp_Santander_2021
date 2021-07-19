package Exercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os juros sejam cobrados.
Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte.
Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.*/

public class Vencimento {

    public static void main(String[] args){

        Calendar dataVencimento = new GregorianCalendar(2021, Calendar.JULY, 20);

        System.out.println("A data de vencimento da sua conta é:");
        System.out.printf("%tF\n", dataVencimento.getTime());

        dataVencimento.add(Calendar.DATE,10);

        System.out.println("Você tem 10 dias para pagar sua conta depois do vencimento, ou seja, o prazo máximo é:");
        System.out.printf("%tF\n", dataVencimento.getTime());
        System.out.println("Caso a data final caia em um final de semana ou feriado, será possível realizar o pagamento até o próximo dia útil!");


    }


}
