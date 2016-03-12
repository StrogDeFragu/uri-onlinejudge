import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = new int[3];
        int cp[] = new int[3];
        
        for (int i =0; i < 3; i++) {
            nums[i] = input.nextInt();
            cp[i] = nums[i];
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(cp[i]);
        }
        
        
    }
}