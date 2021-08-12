import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            nums[i] = m;
        }
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] * nums[i - 1]) > temp) {
                temp = nums[i] * nums[i - 1];
            }
        }
        System.out.println(temp);
    }
}
