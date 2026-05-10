class Solution {
    public int solution(int[] numbers, int k) {
        
        int len = numbers.length;
        int index = 0;
        int count = 1; // 던진 횟수! 처음 사람 던졌으니 1번부터 시작
        
        while(count < k){
            index+=2;
            if(index >= len){
                index -= len; 
                // index가 배열크기 같거나 커지면 다시 처음으로 돌아가게!
            }
            count++;
        }
        
        return numbers[index];
    }
}