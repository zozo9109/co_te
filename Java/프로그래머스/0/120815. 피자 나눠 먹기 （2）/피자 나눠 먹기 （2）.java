class Solution {
    public int gcd(int a, int b){
    //최대공약수 계산로직
    // a = 12, b = 8, r = 4
        while(b != 0){ //나머지가 0이 될때까지 반복
            int remainder = a%b; 
            a = b;
            b = remainder;
        }
        return a;
        
        // 최소공약수 : 두 수의 배수 중 가장 작은 거
        // 유클리드 호제법 사용 시, 유클리드 호제법으로 최대공약수를 구하고 이를 통해
        // 최소 공배수를 구하기
    }
    public int solution(int n) {
        return (n * 6 / gcd(n, 6)) / 6;
        //(a * b / gcd(a, b)) -> 최소공배수 구하는 로직
        // ex) a = 10, b = 5 -> (50 / 5) -> 10 최대공약수
        // ex) n = 4, (24 / 2) / 6 -> 2!
    }


}