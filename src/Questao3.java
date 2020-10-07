public class Questao3 {
    public static void main(String[] args) {

        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(pesquisa_linear(vetor,10,5));


    }

    /**
     *
     * Pesquisa linear
     *
     */

    public static int pesquisa_linear(int[]array,int tamanhoArray,int chave){

        int valorRetorno;
        if(chave<=tamanhoArray-1 && chave>=0){
            valorRetorno = array[chave];
        }
        else{
            return -1;
        }

        return valorRetorno;
    }

}
