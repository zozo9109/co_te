class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        StringBuilder sb = new StringBuilder();
        //문자열 letter을 공백 기준으로 분리해서 배열 저장
        String[] letters = letter.split(" ");
        
        for(String L : letters){
            for(int i = 0; i <  morse.length; i++){
                if(L.equals(morse[i])){ // equals 문자열이 같은지 비교하기 위한 메서드
                    sb.append((char)(i + 'a'));   //morse의 키값을 이어붙여야돼, 인덱스를 알파벳으로!
                    break;
                }
            }      
        } 
        return sb.toString();
    }
}