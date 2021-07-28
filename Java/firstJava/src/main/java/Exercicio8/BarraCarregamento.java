package Exercicio8;

public class BarraCarregamento {
    public static void main(String[] args) {
       GeradorPDF iniciarGerarPdf = new GeradorPDF();
       BarraCarregamento iniciarBarraDeCarregamento = new BarraCarregamento();

       iniciarGerarPdf.start();
       iniciarBarraDeCarregamento.start();

    }

    private void start() {
    }

    private static class GeradorPDF {
        public void start() {
        }
    }
}

class GerarPDF extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable {
    @Override
    public void run() {
        try {

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Loading...");
    }

}
