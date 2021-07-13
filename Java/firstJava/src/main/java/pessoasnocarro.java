//não concluido ainda
public class pessoasnocarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Há " + carro.getPessoascarro() + " pessoas no carro!");
        System.out.println("Você permite que a pessoa possa entrar no carro? Y/N");
            new nocarro;
        Scanner(System.in).nextInt();

       /* switch( nocarro )
        {
            case 'Y':
                if (carro.getPessoascarro() < 5){
            System.out.println("Entraram no carro 1 pessoa, agora há " + (carro.getPessoascarro()+1));}
                break;

            case 'N':
                System.out.println("Não entrou mais ninguém no carro, então há " + (carro.getPessoascarro()));}
                break;

            case opção3:
                comandos caso a opção 3 tenha sido escolhida
                break;

            default:
                comandos caso nenhuma das opções anteriores tenha sido escolhida
        }*/

        if (carro.getPessoascarro() < 5){
            System.out.println("Entraram no carro 1 pessoa, agora há " + (carro.getPessoascarro()+1));}
        if (carro.getPessoascarro() >=5){
            System.out.println("Saíram do carro, pois está cheio, agora há " + (carro.getPessoascarro()-1));
        }
    }
}