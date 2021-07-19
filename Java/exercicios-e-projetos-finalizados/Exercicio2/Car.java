package Exercicio2;

public class Car {
    String marca;
    String modelo;
    String variante;
    int ano;

    public static void main (String[] args) {
        Car carro = new Car("Hyundai", "Hb20", "Premium", 2011);
        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.variante);
        System.out.println(carro.ano);
    }

    public Car (String marca, String modelo, String variante, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.variante = variante;
        this.ano = ano;
    }
}

