package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos"); //adicionar elementos
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa"); //alterar o elemento n para outro

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4); //removido o indice 4

        System.out.println(nomes);

        nomes.remove("Wesley"); // removido o elemento

        System.out.println(nomes);

        String nome = nomes.get(3); //retorna o nome da posicao

        System.out.println(nome);

        int posicao = nomes.indexOf("Carlos"); //qnd nao encontra retorna -1

        System.out.println(posicao);

        int tamanho = nomes.size(); //qnt elemento tem

        System.out.println(tamanho);

        nomes.remove("Larissa"); //remove

        tamanho = nomes.size(); //qnt elemento tem

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson"); //verificar se tem

        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        boolean listaEstaVazia = nome.isEmpty(); //verifica se ta vazia
        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes) { // inteirar
            System.out.println("---> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println("-----> "+ iterator.next());
        }

        nomes.clear(); //limpa lista

        listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

    }
}
