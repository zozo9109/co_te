class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
         
        if(direction.equals("right")){ // 문자열 값 같은지 확인하려면 equals!
            int temp = numbers[len-1];
            for(int i = len-1; i > 0; i--){
                numbers[i] = numbers[i-1];
            }
            numbers[0] = temp;
        }
        
        else if(direction.equals("left")){ 
            int temp = numbers[0];
            for(int i = 0; i < len-1; i++){
                numbers[i] = numbers[i+1];
            }
            numbers[len-1] = temp;
        }


        return numbers;
    }
}