public class WhileLoop {
    public static void main(String[] args) {
        // while 반복문
        // 증감식이 실행코드의 일부이기 때문에 잘못 작성하거나 잊고 작성하지 않는 경우가 많음. 주의!!
        // For문에 비해 구조가 안정적이지 못해 많이 사용되지 않음
        int i = 0;
        while(i<10) {
            System.out.println(i);
            i++;
        }

        // do~while 반복문
        int a = 0;
        do {
            System.out.println(a);
            a++; // 증감식
        }while(a<10);

        // while문과 do~while문의 차이점
        // 조건식이 처음부터 false인 경우, while문은 코드가 실행되지 않으나,
        // do~while문은 1회 실행됨. 실행코드가 더 위에 잇기 때문!!
        a = 0;
        do {
            System.out.println(a);
            a++; // 증감식
        }while(false);
    }
}
