import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        
        boolean answer = true; // 변수 true 초기화
        
        answer = testValid(phone_book);
        return answer;
    }
    
    public boolean testValid(String[] phone_book){
        
        String[] data= phone_book;
        Arrays.sort(data);
        
        boolean answer = true; // 변수 true 초기화

         for (int i = 0; i < data.length-1; i++) {
            if(data[i + 1].startsWith(data[i]) == true){
                answer = false;
            }
          
         }
          return answer;
    }

}

