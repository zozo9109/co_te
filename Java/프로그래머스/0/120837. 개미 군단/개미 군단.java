class Solution {
    public int solution(int hp) {
        // 장군개미 5의 공격력 : a 
        // 병정개미 3의 공격력 : b
        // 일개미 1의 공격력 : c
        // 가장 적은 병력으로 사냥 할 수 있게!!!! 체력에 딱 맞게 최소한의 병력
        // 사냥감의 체력 hp 매개변수
        int OAnt = hp/5; // 장군개미
        int remain = hp%5; // 장군개미 하고 남은 값
        int SAnt = remain/3; //병정개미
        int TAnt = remain%3; // 일개미
        
      
        return OAnt + SAnt + TAnt;
    }
}