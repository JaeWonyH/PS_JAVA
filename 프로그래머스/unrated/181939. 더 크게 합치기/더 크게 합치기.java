class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(Integer.toString(a)+ Integer.toString(b));
        int ba = Integer.parseInt(Integer.toString(b)+ Integer.toString(a));
        
        if(ba > ab){
            answer = ba;
        }else{
            answer =ab;
        }
        
        return answer;
    }
}