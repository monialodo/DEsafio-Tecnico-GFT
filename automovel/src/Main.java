import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao();
        Esportivo esportivo = new Esportivo();


        Scanner scan = new Scanner(System.in);


        System.out.println("Insira o modelo escolhido: ");
        System.out.println("1 - Caminhão");
        System.out.println("2 - Esportivo");
        int resp = scan.nextInt();

        if (resp == 1 ) {
            System.out.println("O modelo eslhido é Caminhão e o combustivel é: ");
            System.out.println(caminhao.getCombustivel());
        } else if (resp == 2 ){
            System.out.println("O modelo eslhido é Esportivo e o combustivel é: ");
            System.out.println(esportivo.getCombustivel());
        } else {
            System.out.println("Modelo inválido");
        }

    }

}
