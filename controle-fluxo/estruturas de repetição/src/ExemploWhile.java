import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada =50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();
             //If abaixo usado para o valor não ficar negativo quando acabar a mesada do João
            if(valorDoce > mesada)
                valorDoce = mesada;

        
            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
    }
        private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(2,13);
        }
}


