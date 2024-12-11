package CodingTest_2;

public class Main {
    public static void main(String[] args) {
        // 도서관 생성
        Library library = new Library("Central Library");

        // 책 추가
        library.addBook(new PrintedBook("1984", "George Orwell", 328));
        library.addBook(new EBook("Digital Minimalism", "Cal Newport", 1.5));
        library.addBook(new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 180));

        System.out.println();

        // 도서 목록 출력
        library.displayBooks();

        System.out.println();

        // 책 대출 / 접근
        library.lendBook("1984");
        library.lendBook("Digital Minimalism");
        library.lendBook("Digital Minimalism");
        library.lendBook("The Great Gatsby");
        library.lendBook("The Great Gatsby");

        System.out.println();

        // 도서 목록 출력
        library.displayBooks();

        System.out.println();

        // 책 반납
        library.returnBook("1984");
        library.returnBook("Digital Minimalism"); // 전자책 반납 불가 메시지 없음
        library.returnBook("The Great Gatsby");

        System.out.println();

        // 도서 목록 출력
        library.displayBooks();
    }
}
