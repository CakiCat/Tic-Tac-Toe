import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];
        int asc = 1;
        int longest = 1;


        for (int i = 0; i < array.length; i++){
            int n = scanner.nextInt();
            array[i] = n;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                asc++;
            } else {
                if (asc > longest){
                    longest = asc;
                    asc = 1;
                }
            }
        }
        if (asc > longest){
            longest = asc;
        }
        System.out.println(longest);
    }
}