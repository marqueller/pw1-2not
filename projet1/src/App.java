public class App {
    public static void main(String[] args) throws Exception {
        //declaracao de variaveis//

        String sMsg1 = "tecnico de infor.matica";
        String sMsg2 = "semestre";
        int iValor1 = 2; // %d
        int iValor2 = 1; // %d
        float fValor2 = 58.700001f; // %f
        char cValror1 = '%'; // %c
        boolean bExlencia = true; // %b

        //Usando multiplas String:
        // ddeclarando:
        String sMsg3 = "Duvidas??";
        String sMsg4 = "por favor chamem!! ";
        String sMsg5 = "muito obrigado pela atenção!!";
        String sMsg6 = String.format("%s \n %s. \n \n %s", sMsg3, sMsg4, sMsg5);
        
        //saida de dados para usuario
        System.err.println(sMsg6);
    }
}
