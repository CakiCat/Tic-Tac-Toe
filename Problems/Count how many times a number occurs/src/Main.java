import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        for (int a : nums){
            if (a == m){
                count++;
            }
        }
        System.out.println(count);
    }
}