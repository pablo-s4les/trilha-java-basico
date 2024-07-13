public class ExemploForContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero++) {
            if(numero == 3)
                continue;
            
            System.out.println(numero);

        }
        //QUANDO ELE VALIDAR QUE É 3, ELE VAI EXECUTAR O CONTINUE E EXECUTAR O CÓDIGO DO COMEÇO, POIS A ISTRUÇÃO DE PRINT ESTÁ ABAIXO DO CONTINUE 
        
    }
}
