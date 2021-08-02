package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteAtendido = filaBanco.poll(); //exibe primeiro elemento e remove

        System.out.println(clienteAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); //exibe primeiro elemento, mantém ele na array

        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element(); //mostra e se não tiver dá erro

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        for (String client: filaBanco) {
            System.out.println(client);
        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("---->"+ iteratorFilaBanco.next());

        }
        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");

        System.out.println(filaBanco);

    }
}
