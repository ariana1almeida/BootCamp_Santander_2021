package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        //adicionar nomes
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //navegar na lista, exibir cada nome
        for (String nomeDoItem: nomes) { // inteirar
            System.out.println("---> " + nomeDoItem);
        }

        //subtituir nome carlos por roberto
        nomes.set(2,"Roberto");
        System.out.println("nomes editados com sucesso: "+nomes);

        //retornar nome da posição 1
        String nome = nomes.get(1);
        System.out.println("O nome da posição 1 é: "+nome);

        //remover nome da posição 4
        nomes.remove(4);
        System.out.println("Nome removido com sucesso: "+nomes);

        //remover nome joão
        nomes.remove("Larissa");
        System.out.println("Nome removido com sucesso. Nova lista: "+nomes);

        //retornar quantidade de itens na lista
        int tamanho = nomes.size();
        System.out.println("tamanho da lista: "+tamanho);

        //verificar se nome Juliano existe na lista
        boolean temJuliano = nome.contains("Juliano");
        System.out.println("Tem o nome Juliano na lista? "+temJuliano);

        //Nova lista com nomes: Ismael e Rodrigo, add pra primeira lista
        List<String> names = new ArrayList<>();
        names.add("Ismael");
        names.add("Rodrigo");
        nomes.addAll(names);

        System.out.println("Listas unidas com sucesso: "+nomes);

        //Ordenar por ordem alfabética
        Collections.sort(nomes);
        System.out.println("Lista ordenada com sucesso: "+nomes);

        //Verificar se lista está vazia
        boolean listaVazia = nomes.isEmpty();
        System.out.println("A lista está vazia? "+listaVazia);


    }
}
