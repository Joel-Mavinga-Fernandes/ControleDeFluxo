public class ControleDeFluxo {
    public static void main(String[] args) {
//Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        //porem as parcelas não podem ser menores do que 1000

        double valortotal = 30000 ;
                for (int parcela = 1; parcela <= valortotal; parcela++) {
                    double valorParcela = valortotal / parcela;
                    if (valorParcela < 1000) {
                        break;
                    }

                        System.out.println("parccelas " + parcela + " R$" + valorParcela);

                }
    }
}
