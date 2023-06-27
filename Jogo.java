import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    ArrayList<Pergunta> perguntas =  Leitor.ler();
    boolean errou = false;
    Map alternativas = Map.of(
        'A', 1,
        'B', 2,
        'C', 3,
        'D', 4
);

    
    public Jogo() {
        while(!errou){
            Random random = new Random();
            int a = random.nextInt(perguntas.size());
            Scanner l2 = new Scanner(System.in);

            Pergunta p = perguntas.get(a);
            p.LerPergunta();

            int resposta = l2.nextInt();
            if(resposta == p.respostaCerta){
                System.out.println("Acerto miseravi");
            }else{
                System.out.println("Errou");
            }
        }
    }
}
