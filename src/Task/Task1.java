package Task;

import java.util.Scanner;

public class Task1 {
    public static void triangle() {
        int sum = 0;
        int sum1 = 1;
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.next();
        int n = Integer.parseInt(enter);
        for(int i = 1; i!=n+1; i++){
            sum+=i;
            sum1*=i;
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}
