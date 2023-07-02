import java.util.ArrayList;
import java.util.Random;

public class Universitario {
    public static void ajuda(ArrayList<String> alternativas) {
        Random random = new Random();
        int a = random.nextInt(3);
        int count = 0;

        System.out.print("Eu acho que é a alternativa ");
        System.out.print(AlternativaConversor.toString(a + 1) + ", ");

        for (String t : alternativas) {
            if (count == a) {
                System.out.println(t);
            }
            count += 1;
        }
    }
}
