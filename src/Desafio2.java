import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2 {
    static Integer fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Digite o valor: ");
        int numberChoosed = sc.nextInt();

        for (int i = 0; i <= numberChoosed + 1; i++) {
            list.add(fibo(i));
        }

        System.out.print(list.contains(numberChoosed) ? numberChoosed + " está na sequência" : numberChoosed + " não está na sequência");
    }
}
