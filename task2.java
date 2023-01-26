public class task2 {
    public static void main(String[] args) {
    
        int maxCheck = 1000;
        String results = "";

        for (int i = 2; i <= maxCheck; i++) {
            if (isPrime(i)){
                results = results + i + " ";
            }
        }
        System.out.println("Простые числа от 1 до " + maxCheck + " это:");
        System.out.println(results);
    }

    public static boolean isPrime(int u_num) {
        int j;
        for(int i = 2; i <= u_num / 2; i++){
            j = u_num % i;
            if (j == 0) {
                return false;
            }
        }
        return true;
    }
}
