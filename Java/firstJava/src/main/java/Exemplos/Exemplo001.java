package Exemplos;

import java.time.LocalDate;
import java.time.Period;

public class Exemplo001 {
    public static void main(String[] args){
        Pessoa eu = new Pessoa ("Ariana", 18, 04, 2002);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Ariana Almeida"); //altera o nome mais tarde

        System.out.println(eu.getNome());
    }

    public static class Pessoa {
        private String nome;
        private LocalDate dataNascimento;

        public Pessoa(String nome, int dia, int mes, int ano) {
            this.nome = nome;
            this.dataNascimento = LocalDate.of(ano,mes,dia);

        }
        public int calculaIdade(){
            return Period.between(dataNascimento, LocalDate.now()).getYears();
        }

        public String getNome() {
            return nome;
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

    }
}
