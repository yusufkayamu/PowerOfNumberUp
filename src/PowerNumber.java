import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int L,U ,total=1;

        System.out.print("Give a number for lower =");
        L = input.nextInt();

        System.out.print("Give a number for Upper =");
        U = input.nextInt();

        for (int i=1; i<=U ; i++){
            total*=L;
        }
        System.out.println(L + "^" + U +"=" + total);

    }
}
