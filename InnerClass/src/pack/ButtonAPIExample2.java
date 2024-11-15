package pack;

class Button {
    OnClickListener ocl;
    void setOnClickListener(OnClickListener ocl) {
        this.ocl = ocl;
    }
    interface OnClickListener {
        public abstract void onClick();
    }
    void onClick() {
        ocl.onClick();
    }
}
// 개발자1 : 음악재생을 위한 pack.Button 자식 클래스
class MusicButtonListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("개발자1 : 음악재생");
    }
}

// 개발자2 : 네이버 접속을 위한 pack.Button 자식 클래스
class NaverButtonListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("개발자2 : 네이버접속");
    }
}

public class ButtonAPIExample2 {
    public static void main(String[] args) {
        // #1. 개발자 1. 클릭했을 때 음악 재생
        Button btn1 = new Button();
        btn1.setOnClickListener(new MusicButtonListener());
        btn1.onClick(); // 개발자1 : 음악재생

        // #2. 개발자 2. 클릭했을 때 네이버 접속
        Button btn2 = new Button();
        btn2.setOnClickListener(new NaverButtonListener());
        btn2.onClick(); // 개발자2 : 네이버접속
    }
}
