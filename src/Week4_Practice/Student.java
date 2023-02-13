package Week4_Practice;

public class Student {

    private String name;
    private int koreanScore;
    private int engScore;

    public Student(String name, int koreanScore, int engScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.engScore = engScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }


    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }
}
