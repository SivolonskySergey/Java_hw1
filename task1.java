import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        boolean flag = iScanner.hasNextInt();
        int u_value = iScanner.nextInt();
        iScanner.close();

        int summ_count = 0;
        int factorial_count = 1;
        for(int i = summ_count; i <= u_value; i++) {
            summ_count += i;
        }
        System.out.println("Сумма чисел от 1 до " + u_value + " = " + summ_count);

        for(int i = factorial_count; i <= u_value; i++) {
            factorial_count *= i;
        }
        System.out.println("n! = " + factorial_count);
    }
    
}