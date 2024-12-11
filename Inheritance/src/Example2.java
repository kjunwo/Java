/*
음악앨범을 관리하는 클래스
요구사항:
 앨범제목 (title) - 문자열
 발매연도 (releaseYear) - 정수
 앨범내 곡들의 제목 배열 (tracks) - 문자열 배열

다음 메소드들을 구현하세요:
생성자(기본생성자, 모든 필드를 매개변수로 가지는 생성자)
각 필드의 getter/setter 메서드
toString 오버라이딩 메서드
tracks 배열에 곡의 제목을 한개 추가하는 메서드 (addTracks)
*/

import javax.sound.midi.Track;
import java.util.Arrays;

class Album {
    private String title;
    private int releaseYear;
    private String[] tracks = new String[5];

    public Album() {
        // this.tracks = new String[5];
    }

    public Album(String title, int releaseYear, String[] tracks) {
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

    public String[] getTracks() {
        return tracks;
    }

    public void setTracks(String[] tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "앨범제목:" + this.title + ", 발매연도:" + this.releaseYear;
    }
    public void addTracks(String track) {
        for (int i=0; i<this.tracks.length; i++) {
            if (this.tracks[i] == null){ // 비었으면
                this.tracks[i] = track; // 매개변수로 받은 곡제목을 저장
                return;
            }
        }
        System.out.println("더 이상 추가할 수가 없어요: " + track );
    }
}

    public class Example2 {
        public static void main(String[] args) {
            Album album1 = new Album();
            album1.setTitle("Java");
            album1.setReleaseYear(2024);
            System.out.println(album1.toString());

            album1.addTracks("AAA");
            album1.addTracks("BBB");
            album1.addTracks("CCC");
            album1.addTracks("DDD");
            album1.addTracks("EEE");
            album1.addTracks("FFF");
            album1.addTracks("GGG");
            System.out.println(Arrays.toString(album1.getTracks()));
        }
    }


