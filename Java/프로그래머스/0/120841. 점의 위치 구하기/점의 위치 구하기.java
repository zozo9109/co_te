class Solution {
    public int solution(int[] dot) {
        int a = dot[0];
        int b = dot[1];
        int answer = 0;
        
        if(a > 0 && b > 0){
            answer = 1;
        }
        else if(a < 0 && b > 0){
            answer = 2;
        }
        else if(a < 0 && b < 0){
            answer = 3;
        }
        else if(a > 0 && b < 0){
            answer = 4;
        }        
        return answer;
    }
}