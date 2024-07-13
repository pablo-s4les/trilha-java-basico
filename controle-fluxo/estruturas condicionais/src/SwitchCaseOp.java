public class SwitchCaseOp {
    public static void main(String[] args) {
        String plano = "M"; //M /T

        switch (plano) {
            case "B":{
                System.out.println("100 minutos de ligação");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "T":{
                System.out.println("5GB Youtube");
            }
        }
    }
}
