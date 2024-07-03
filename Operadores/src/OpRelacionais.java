public class OpRelacionais {
    public static void main(String[] args){
        //COMPARANDO SE AS VARIAVEIS STRINGS POSSUEM VALORES IGUAIS:
        String nomeUm = "Pablo";
        String nomeDois = "Pablo";
            System.out.println(nomeUm == nomeDois);

        
        //COMPARANDO O CONTEÚDO DOS OBJETOS COM EQUALS JÁ QUE FOI CRIADO UM NOVO OBJETO COM New String:    
        nomeDois = new String("Pablo");
            System.out.println(nomeUm.equals(nomeDois));
    
        
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        
        if (numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }
                
            
        


            System.out.println("O número 1 é igual ao número 2 ? " + simNao);

        simNao = numero1 != numero2;
            System.out.println("Os números são diferentes um do outro ? " + simNao);

        simNao = numero1 > numero2;
            System.out.println("O número 1 é maior que o número 2? " + simNao);

        simNao = numero1 < numero2;
            System.out.println("O número 1 é menor que o número 2? " + simNao);

        

    }
    
}
