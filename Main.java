import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("1- Jogar");
        System.out.println("2- Sair");
        Scanner l = new Scanner(System.in);

        int a = l.nextInt();

        System.out.println();
        if (a == 1) {
            new Jogo();
        }

        l.close();
    }
}