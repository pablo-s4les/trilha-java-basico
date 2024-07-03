public class OpTernario {
    public static void main(String[] args) {
        int a,b;

        a = 6;
        b = 6;
        
        
    /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE:
        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

            System.out.println(resultado);
    */
        
    //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNARIO:    
        String resultado = (a==b) ? "verdadeiro" : "false";
            System.out.println(resultado);
            
    }
    
}
