import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		Stack<Long> stackLong = new Stack<>();
		long answer = 0;
		
		while(a > 0) {
			long b= sc.nextLong();
			if(stackLong.isEmpty()) {
				stackLong.push(b);
			}else {
				if(b == 0) {
					stackLong.pop();
				}else {
					stackLong.push(b);
				}
			}
			a--;
		}
		
		for(int x= 0; x<stackLong.size();x++) {
			answer += stackLong.get(x);
		}
		System.out.println(answer);

	}

}