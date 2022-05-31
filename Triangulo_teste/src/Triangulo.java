import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int l1;
        int l2;
        int l3;

        System.out.println("Digite o valor do lado l1");
        l1 = scan.nextInt();
        System.out.println("Digite o valor do lado l2");
        l2 = scan.nextInt();
        System.out.println("Digite o valor do lado l3");
        l3 = scan.nextInt();

        Boolean isTriangle = null;

        if (l1 > Math.abs(l2 - l3) && l1 < Math.abs(l2 + l3)
                || l2 > Math.abs(l1 - l3) && l2 < Math.abs(l1 + l3)
                || l3 > Math.abs(l2 - l1) && l3 < Math.abs(l2 + l1)) {

            isTriangle = true;
        } else {
            System.out.println("Não é triangulo");
            isTriangle = false;
        }

        if (isTriangle) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triângulo equilátero");
            } else if (l1 == l2 || l2 == l3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }

        }
    }

}
