import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Leitor {
    public static ArrayList<Pergunta> ler() {
        String caminhoArquivo = "./teste.txt";
        File arquivo = new File(caminhoArquivo);

        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();

        try {
            Scanner scanner = new Scanner(arquivo);
            ArrayList<String> r = new ArrayList<String>();
            String texto = "";
            String certa = "";
            int count = 0;

            while (scanner.hasNextLine()) {
                count += 1;
                String linha = scanner.nextLine();
                if (count == 1) {
                    texto = linha;
                } else if (count < 6) {
                    r.add(linha);
                } else {
                    count = 0;
                    certa = linha;
                    perguntas.add(new Pergunta(texto, r, certa));
                    r.clear();
                }
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return perguntas;
    }

    public static boolean testeLer() {
        ArrayList<Pergunta> perguntas = ler();

        // Verifica se a lista de perguntas tem o tamanho esperado
        if (perguntas.size() != 30) {
            return false;
        }

        // Verifica os valores das perguntas individuais
        Pergunta pergunta1 = perguntas.get(0);
        Pergunta pergunta2 = perguntas.get(1);
        Pergunta pergunta3 = perguntas.get(2);

        if (pergunta1.respostaCerta == 1 &&
                pergunta2.respostaCerta == 3 &&
                pergunta3.respostaCerta == 3) {
            return true;
        }

        return false;
    }
}
