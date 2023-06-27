import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Leitor {
    public static ArrayList<Pergunta> ler() {
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
        String caminhoArquivo = "./teste.txt";
        File arquivo = new File(caminhoArquivo);

        try {
            Scanner scanner = new Scanner(arquivo);
            ArrayList<String> r = new ArrayList<String>();
            String texto = "";
            String certa = "";
            int count = 0;

            while (scanner.hasNextLine()) {
                count+=1;
                String linha = scanner.nextLine();
                if(count == 1){
                    texto = linha;
                }else if(count < 6){
                    r.add(linha);
                }else if(count == 6){
                    certa = linha;
                }else{
                    perguntas.add(new Pergunta(texto, r, certa));
                    r.clear();
                    count = 0;
                }
            }

            scanner.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

            return perguntas;
    }
}
