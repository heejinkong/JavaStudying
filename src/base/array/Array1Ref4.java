package base.array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //배열 생성과 초기화

        System.out.println(students); //참조값 확안
        System.out.println(students.length);

        //변수 값 대입
//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+ (i+1) + " 점수: " + students[i]);
        }
//        System.out.println("학생1 점수: " + students[0]);
//        System.out.println("학생2 점수: " + students[1]);
//        System.out.println("학생3 점수: " + students[2]);
//        System.out.println("학생4 점수: " + students[3]);
//        System.out.println("학생5 점수: " + students[4]);

    }
}
