package Task;

public class Task2 {
    public static void primeNumbers() {
        int sum = 0;
        for(int i = 3 ;i <= 1000; i++) {
            if (sum <= 1)
                System.out.println(i-1);
            sum = 0;
            for (int j = 2; i >= j; j++) {
                if (i % j == 0)
                    sum++;

            }
        }
    }
}
