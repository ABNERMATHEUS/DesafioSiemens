import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        /**
         * Calcular tamanho da string
         */


        Scanner s = new Scanner(System.in);
        System.out.print("Digite uma texto = ");
        String texto = s.next();
        int cont=0;

        for(int i=0; i<texto.length(); i++){
            cont++;
        }

        System.out.println("O tamanho da string é de "+cont);

    }
}
