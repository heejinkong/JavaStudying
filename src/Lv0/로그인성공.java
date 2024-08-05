package Lv0;

public class 로그인성공 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i = 0; i < db.length; i++) {
            for(int j = 0; j < db[0].length; j++) {
                if(db[i][0].equals(id_pw[0])) {
                    if(db[i][1].equals(id_pw[1])) {
                        return "login";
                    } else {
                       return "wrong pw";
                    }
                }
            }
        }
        return "fail";
    }
}
