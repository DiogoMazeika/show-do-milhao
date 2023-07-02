import java.util.ArrayList;

public class Pergunta {
    String texto;
    ArrayList<String> respostas = new ArrayList<String>();
    int respostaCerta;

    public Pergunta(String texto, ArrayList<String> respostas, String respostaCerta) {
        this.texto = texto;
        this.respostaCerta = AlternativaConversor.toInt(respostaCerta);

        for (String t : respostas) {
            this.respostas.add(t);
        }
    }

    public void LerPergunta(boolean rmv) {
        int count = 1;
        int removidas = 0;

        System.out.println(texto);
        System.out.println();

        for (String t : respostas) {
            int mostrar = 1;
            if (rmv && removidas < 2 && respostaCerta != count) {
                mostrar = 0;
            }

            if (mostrar == 1) {
                System.out.print(AlternativaConversor.toString(count) + ") ");
                System.out.println(t);
            } else {
                removidas += 1;
            }

            count += 1;
        }
    }
}
