import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.nextLine();
		
		StringBuilder sb = new StringBuilder(); 
		
		for(int x=0; x<a;x++) {
			String b = sc.nextLine();
			char[] inputStr = b.toCharArray();
			Stack<Character> stackStr = new Stack();
			
			for(int y = 0; y<inputStr.length; y++) {
				if(inputStr[y] == ')' && stackStr.size()==0) {
					stackStr.push(inputStr[y]);
					break;
				}else {
					if(inputStr[y] == '(') {
						stackStr.push(inputStr[y]);
					}else {
						stackStr.pop();
					}
				}
			}
			
			if(stackStr.isEmpty()) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
			
			
		}

		System.out.println(sb);
	}

}