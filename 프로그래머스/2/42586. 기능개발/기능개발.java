import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    
            int temp = 0;
            int cnt = 0;
            int result = 0;
        
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> answer = new LinkedList<>();

            for(int i = 0; i<progresses.length ; i++){
                if((100 - progresses[i]) % speeds[i] == 0) {
                    result = (100 - progresses[i]) / speeds[i];
                }else{
                    result = (100 - progresses[i]) / speeds[i] + 1;
                }
                queue.offer(result);
            }

            while (!queue.isEmpty()) {
                if (temp >= queue.peek()) {
                    queue.poll();
                } else {
                    temp = queue.poll();
                }
                cnt++;

                if (queue.isEmpty()) { // 마지막 값이라면
                    answer.offer(cnt);
                } else if (queue.peek() > temp) {
                    // 뒷 값이 더 큰 경우
                    answer.offer(cnt);
                    cnt = 0;
                    temp = 0;
                }

            }
        return answer.stream().mapToInt(i->i).toArray();
    }
}