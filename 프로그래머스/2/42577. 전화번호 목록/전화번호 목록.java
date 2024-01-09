import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        
        boolean answer = true;
        answer = testValid(phone_book);
        return answer;
    }
    
    public boolean testValid(String[] phone_book){
        
        String[] data= phone_book;
        Arrays.sort(data);
        
        boolean answer = true;

         for (int i = 0; i < data.length-1; i++) {
           System.out.println(data[i + 1].startsWith(data[i]));
        }
    
        /*
        for (int i = 0; i < data.length-1; i++) {
            System.out.println(data[i + 1].startsWith(data[i]));
        }
        */
        
        return answer;
    }
}

