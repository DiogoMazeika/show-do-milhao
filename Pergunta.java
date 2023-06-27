import java.util.ArrayList;

public class Pergunta {
    String texto;
    ArrayList<String> respostas = new ArrayList<String>();
    String respostaCerta;

    public Pergunta(String texto, ArrayList<String> respostas, String respostaCerta){
        this.texto = texto;
        this.respostas = respostas;
        this.respostaCerta = respostaCerta;
    }

    public void LerPergunta(){
        System.out.println(texto);
        for (String t : respostas) {
            System.out.println(t);
        }
    }
}
