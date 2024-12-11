package CodingTest_2;

public class PrintedBook extends Book{
    int pageCount;
    boolean isLent;

    public PrintedBook (String title, String author, int pageCount) {
        super(title,author);
        this.pageCount = pageCount;
    }
    boolean isLent() {
        return isLent;
    }
    void lend() {
        if(isLent) {
            System.out.println("title"+"은 이미 대출중입니다.");
        }else {
            System.out.println("title"+"은 성공적으로 대출 처리되었습니다.");
            returnBook();
        }

    }
    public void returnBook(){
        if (isLent) {
            System.out.println("title"+ "은 대출중이 아닙니다.");
            returnBook();
        }else {
            System.out.println("title" + "은 성공적으로 반납되었습니다.");
        }

    }
    @Override
    void displayDetails() {
        System.out.println("Printed Book" + "-" + "title : " + title  +  "," +
                "author : " + author + "," +
                "pageCount : " + pageCount + "," + "isLent : " + isLent);
    }
}
