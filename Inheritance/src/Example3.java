import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        Album2 a2 = new Album2();
        a2.setTitle("Spring");
        a2.setReleaseYear(2024);
        a2.addTracks("AAA");
        a2.addTracks("BBB");
        a2.addTracks("CCC");
        List<String> temp = a2.getTracks();
        System.out.println(temp.size()); // List의 length는 size()로 확인
        System.out.println(temp); // List는 바로 출력 가능
    }
}
// 배열대신 컬렉션중에 하나인 ArrayList를 사용하는 예제
class Album2 {
    private String title;
    private int releaseYear;
    private List<String> tracks; // 원래 문자열의 배열이었던것을 List로 변경

    public Album2() {
        // List 클래스의 생성자는 ArrayList<>()를 사용함!!
        // List의 초기화
        this.tracks = new ArrayList<>();
    }

    public Album2(String title, int releaseYear, List<String> tracks) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
    @Override
    public String toString() {
        return "앨범제목:" + this.title + ", 발매연도:" + this.releaseYear;
    }
    public void addTracks(String track) {
        tracks.add(track); // 매개변수의 데이터타입이 문자열이여야 함!!
    }

    public void removeTracks(String track) {
        if (tracks.remove(track)) {
            // 해당 곡이 존재하면 삭제후 true 리턴
            System.out.println("곡이 삭제되었습니다: " + track);
        }else {
            // 해당 곡이 존재하지 않으면 그대로 false 리턴
            System.out.println("곡을 찾을 수 없습니다: " + track);
        }
    }
}
