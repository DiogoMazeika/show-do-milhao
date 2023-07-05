import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    ArrayList<Pergunta> perguntas = Leitor.ler();
    boolean errou = false;
    Pergunta last;
    boolean usandoAjuda = false;
    int acertos = 0;

    public Jogo() {
        boolean rmv = false;

        while (!errou && acertos < 30) {
            Pergunta p = last;
            if (!usandoAjuda) {
                Random random = new Random();
                int a = random.nextInt(perguntas.size());
                p = perguntas.get(a);
            }
            int resposta = lerPergunta(p, rmv, usandoAjuda);

            if (resposta == p.respostaCerta) {
                System.out.println("Correto");
                acertos += 1;
                usandoAjuda = false;
                rmv = false;
            } else if (resposta == 5 && !usandoAjuda) {
                Universitario.ajuda(p.respostas);
                usandoAjuda = true;
                last = p;
            } else if (resposta == 6 && !usandoAjuda) {
                rmv = true;
                usandoAjuda = true;
                last = p;
            } else {
                System.out.println("Errou");
                errou = true;
                usandoAjuda = false;
                rmv = false;
            }

            if (!usandoAjuda) {
                perguntas.remove(p);
                System.out.println();
            } else {
                System.out.println("-------");
            }
        }

        System.out.println("--------------");
        if (errou) {
            System.out.println("Perdeu tudo !!!");
            System.out.println("Você teria ficado com " + (33333.3333 * acertos)
                    + " barras de ouro que valem mais do que dinheiro, mas perdeu ao errar a pergunta!!!!");
        } else {
            System.out.println("Parabéns, você ganhou 1 milhão de doláres!!!!");
        }

    }

    private int lerPergunta(Pergunta p, boolean rmv, boolean ajuda) {
        Scanner l2 = new Scanner(System.in);
        if (!ajuda) {
            System.out.print("// 1: Pedir ajuda a universitarios");
            System.out.println(" // 2: Remover duas respostas erradas");
        } else {
            System.out.println("// Sem mais ajudas para essa pergunta");
        }
        p.LerPergunta(rmv);

        System.out.println();
        System.out.print("Sua resposta: ");

        int resposta = AlternativaConversor.toInt(l2.next());

        // l2.close();
        return resposta;
    }
}
