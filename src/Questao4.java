import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        /**
         * Inverter caracteres
         */

        Scanner s = new Scanner(System.in);
        System.out.print("Digite um texto = ");
        String texto = s.next();
        char[] c = texto.toCharArray();

        for(int i= c.length-1; i>=0; i--){
            System.out.print(c[i]);
        }
    }
}
