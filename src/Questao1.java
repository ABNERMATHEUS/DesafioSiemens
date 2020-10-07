import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        /**
         * Calcular o termo de Fibonacci
         */

        int anterior = 0;
        int proximo = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número para fazer o calculo = ");


        int n = s.nextInt();

        while(proximo <= n){
            System.out.println(proximo);
            proximo = proximo + anterior;
            anterior = proximo - anterior;
            if(proximo == 0) proximo = proximo + 1;
        }


    }
}
