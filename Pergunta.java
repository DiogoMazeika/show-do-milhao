import java.util.ArrayList;
import java.util.HashMap;

public class Pergunta {
    String texto;
    ArrayList<String> respostas = new ArrayList<String>();
    int respostaCerta;

    public Pergunta(String texto, ArrayList<String> respostas, String respostaCerta){
        HashMap<String, Integer> alternativas = new HashMap<>();
        alternativas.put("a", 1);
        alternativas.put("b", 2);
        alternativas.put("c", 3);
        alternativas.put("d", 4);

        System.out.println(alternativas.get(respostaCerta));

        this.texto = texto;
        // this.respostaCerta = respostaCerta;
        this.respostaCerta = 1;

        for (String t : respostas) {
            this.respostas.add(t);
        }
    }

    public void LerPergunta(){
        System.out.println(texto);
        System.out.println("");
        for (String t : respostas) {
            System.out.println(t);
        }
    }
}
