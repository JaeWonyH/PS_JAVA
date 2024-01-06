import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        
		int T = sc.nextInt();
		while(T > 0) {
            String str2 = sc.next();
            String result = Character.toString(str2.charAt(0)) + Character.toString(str2.charAt(str2.length() - 1));
            System.out.println(result);
            T--;
        }
		
		
	}
}