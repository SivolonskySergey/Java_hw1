import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        String operations[] = new String[] {"+", "-", "/", "*" };

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        boolean flag = iScanner.hasNextInt();
        float first_value = iScanner.nextFloat();
        iScanner.nextLine();

        System.out.println("Введите число: ");
        flag = iScanner.hasNextInt();
        float second_value = iScanner.nextFloat();
        iScanner.nextLine();

        System.out.printf("Выберите операцию (+, -, /, *): ");
        String u_str = iScanner.nextLine();
        List operationsList = Arrays.asList(operations);
        String checking = (operationsList.contains(u_str)) ? u_str : "нет такой операции";
        System.out.println(checking);
        makeCount(checking, first_value, second_value);
        
    }
    static public void makeCount(String u_op, float u_val_1, float u_val_2) {
        switch (u_op) {
            case "+":
                System.out.println("Результат: " + (u_val_1 + u_val_2));
                break;
            case "-":
                System.out.println("Результат: " + (u_val_1 - u_val_2));
                break;
            case "/":
                if (u_val_2 == 0) {
                    System.out.println("Делить на ноль нельзя");
                } else{
                System.out.println("Результат: " + (u_val_1 / u_val_2));
                }
                break;
            case "*":
                System.out.println("Результат: " + (u_val_1 * u_val_2));
                break;
        }
    }


}
