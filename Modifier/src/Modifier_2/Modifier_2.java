package Modifier_2;

import Modifier_2.pack.AA;
// import Modifier_2.pack.BB; // default 클래스 : 동일패키지가 아니므로 임포트 불가
import Modifier_2.pack.CC;

public class Modifier_2 {
    public static void main(String[] args) {
        // AA, BB, CC 클래스 인스턴스화
        AA a = new AA();
        // BB b = new BB(); // 임포트가 안되므로 인스턴스화할 수 없음
        // CC c = new CC(); // 정의한 기본생성자(자동아님)가 default이므로 외부패키지에서 호출할 수 없음. 인스턴스화 불가!
    }
}
