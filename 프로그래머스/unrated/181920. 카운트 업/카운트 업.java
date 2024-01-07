import java.util.*;

class Solution {
    public List solution(int start_num, int end_num) {
        //int[] answer = {};
        List<Integer> answer = new ArrayList<>();
        while(end_num >= start_num){
            answer.add(start_num);
            start_num ++;
        }
        return answer;
    }
}