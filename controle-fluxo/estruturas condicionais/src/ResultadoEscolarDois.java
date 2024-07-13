public class ResultadoEscolarDois {
    public static void main(String[] args) {
          int nota = 10;
          
        if(nota >= 7 && nota < 10)// sempre true ou false
         System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7)// sempre true ou false
         System.out.println("Recuperação");
         
        else if(nota == 10)
         System.out.println("Parabéns, você é um ótimo aluno!"); 

        else
         System.out.println("Reprovado");

        
    }
}
