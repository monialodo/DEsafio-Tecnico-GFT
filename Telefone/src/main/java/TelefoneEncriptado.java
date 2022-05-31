import java.util.Scanner;

public class TelefoneEncriptado {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o telefone encriptado");
        String phoneNumber = scan.next();

            String normal = "";
            foreach (char c : phoneNumber.toCharArray());
            normal += getKeypadNumber(c);
    }

        public static char getKeypadNumber(char characterToConvert) {
            if (Character.isDigit(characterToConvert))
                return characterToConvert;
            else {
                switch (characterToConvert) {
                    case 'A' : case 'B' : case 'C' : return '2';
                    case 'D' : case 'E' : case 'F' : return '3';
                    case 'G' : case 'H' : case 'I' : return '4';
                    case 'J' : case 'K' : case 'L' : return '5';
                    case 'M' : case 'N' : case 'O' : return '6';
                    case 'P' : case 'Q' : case 'R' : case 'S' : return '7';
                    case 'T' : case 'U' : case 'V' : retrun '8';
                    case 'W' : case 'X' : case 'Y' : case 'Z' : return '9';
                    default return '?';
                }
            }
        }
    }



}
