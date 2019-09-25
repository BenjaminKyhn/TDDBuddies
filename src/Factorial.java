import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }

    static int factorialBeregningHeltTal(int n){
        int product = 1;
        for (int count = 1; count <= n; count++) {
            product = product * count;
        }

        return product;
    }
}
