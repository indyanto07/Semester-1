package laprakpemdas5;
import java.util.*;;
public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int b = in.nextInt();

        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int n = in.nextInt();

        System.out.println("Deret Fibonacci dengan nilai awal " + a + " dan " + b + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i, a, b) + " ");
        }
        in.close();
    }   
    private static int fibonacci(int n, int a, int b) {
        if (n == 0)
            return a;       
        else if (n == 1)
            return b;       
        else
            return fibonacci(n - 1, a, b) + fibonacci(n - 2, a, b);
    }
}
