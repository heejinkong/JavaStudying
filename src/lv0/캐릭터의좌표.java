package lv0;

public class 캐릭터의좌표 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("up")) {
                answer[1]++;
                if( answer[1] > (int)(board[1] / 2)) {
                    answer[1] = (int)(board[1] / 2);
                }
            } else if(keyinput[i].equals("down")) {
                answer[1]--;
                if(answer[1] < -(int)(board[1] / 2)) {
                    answer[1] = -(int)(board[1] / 2);
                }
            }
            else if(keyinput[i].equals("left")) {
                answer[0]--;
                if(answer[0] < -(int)(board[0] / 2)) {
                    answer[0] = -(int)(board[0] / 2);
                }
            } else {
                answer[0]++;
                if(answer[0] > (int)(board[0] / 2)) {
                    answer[0] = (int)(board[0] / 2);
                }
            }
        }
        return answer;
    }
}
