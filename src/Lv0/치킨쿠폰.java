package Lv0;

public class 치킨쿠폰 { public int solution(int chicken) {
    int coupon = chicken; //1081
    int answer = 0;
    while(coupon >= 10) {
        int leftCoupon = coupon % 10;
        answer += coupon / 10;
        coupon = leftCoupon + coupon / 10;
    }
    return answer;
}
}
