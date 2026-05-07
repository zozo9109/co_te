public class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
		int food = 12000*n; 
        int drink = 2000*k; 
        int service = n/10 * 2000; 
        
        return answer = food + drink - service;
    }
}