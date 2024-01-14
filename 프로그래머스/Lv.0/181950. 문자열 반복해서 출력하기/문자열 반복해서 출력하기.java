import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        String answer = "";
        for(int x = 0; x < n; x++){
            answer = answer + str;
        }
        System.out.println(answer);
    }
}