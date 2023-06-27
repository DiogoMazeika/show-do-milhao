import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
    
    public Jogo() {
        Scanner l2 = new Scanner(System.in);
        ArrayList<String> r = new ArrayList<String>();
        r.add("Trolha");
        r.add("Trento");
        Pergunta p = new Pergunta("é trento ou trolha??", r, "a");

        p.LerPergunta();
        
        String resposta = l2.next();
        
        System.out.println(resposta == p.respostaCerta);
        if(resposta == p.respostaCerta){
            System.out.println("Acerto miseravi");
        }else{
            System.out.println("Errou");
        }
    }
}
