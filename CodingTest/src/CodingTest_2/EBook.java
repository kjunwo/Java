package CodingTest_2;

public class EBook extends Book{
    double fileSize;
    int accessCount;

    public EBook(String title, String author, double fileSize){
        super(title,author);
        this.fileSize = fileSize;
    }
    void access() {
        System.out.println("title access : " + accessCount);
    }

    @Override
    void displayDetails() {
        "Ebbok" + "-" + "title : " + title +  "author : " + author +
                "fileSize : " + fileSize + "accessCount : " + accessCount;
    }
}
