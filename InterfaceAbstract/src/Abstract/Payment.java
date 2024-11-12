package Abstract;
// 결제 시스템 클래스
public abstract class Payment {
    protected double amount; // 금액
    protected String id; // 상점아이디
    public Payment() {
    }
    public Payment(double amount, String id) {
        this.amount = amount;
        this.id = id;
    }
    // 추상메서드
    abstract boolean processPayment(); // 결제진행 메서드
    abstract String getReceipt(); // 영수증 발행
}
// 신용카드 결제
class CreditCard extends Payment {
    private String cardNumber; // 신용카드번호
    private String expiryDate; // 만료일
    // 자식클래스의 생성자에는 부모의 필드도 추가할 수 있음(권장)
    public CreditCard(double amount, String id, String cardNumber, String expiryDate) {
        super(amount, id);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }
    @Override
    boolean processPayment() {
        System.out.println("신용카드로 결제 진행");
        return true;
    }
    @Override
    String getReceipt() {
        return "신용카드 결제금액 : " + amount + "원";
    }
}
// 모바일 결제
class Mobile extends Payment {
    private String paymentType; // 결제타입(카카오페이, 네이버페이 등등)
    private boolean usePoint; // 결제타입 포인트 유무
    public Mobile(double amount, String id, String paymentType, boolean usePoint) {
        super(amount, id);
        this.paymentType = paymentType;
        this.usePoint = usePoint;
    }
    @Override
    boolean processPayment() {
        if (usePoint) {
            System.out.println("모바일결제 진행(포인트 사용)");
        }else {
            System.out.println("모바일결제 진행");
        }
        return true;
    }
    @Override
    String getReceipt() {
        if (usePoint) {
            return "모바일결제금액 : " + amount + "원 (포인트사용)";
        }else {
            return "모바일결제금액 : " + amount + "원";
        }
    }
}
// 현금결제 (연습문제)
class Cach extends Payment {
    private double receivedAmount; // 고객으로부터 받은 현금

    public Cach(double amount, String id, double receivedAmount) {
        super(amount, id);
        this.receivedAmount = receivedAmount;

    }
    @Override
    boolean processPayment() {
        if (receivedAmount>= amount){
            System.out.println("현금결제 진행");
            return true;
        }else {
            System.out.println("현금결제 중단 : 현금부족");
            return false;
        }
    }
    @Override
    String getReceipt() {
        double change = receivedAmount - amount;
        return "현금결제 금액 : " + amount + "원, 거스름돈 : " + change + "원";
    }
}
