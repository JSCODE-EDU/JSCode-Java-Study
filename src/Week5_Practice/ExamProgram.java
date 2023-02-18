package Week5_Practice;

import java.util.Scanner;

public class ExamProgram {

    Scanner sc = new Scanner(System.in);
    Info info = new Info();

    public void execute() {
        setInfoDataByRetrivingDatas(); // INFO 객체에 데이터 설정
        printIfPassOrNot();
        printMaxMinAvgScore();
    }

    public void generationDataRetrival() {
        System.out.println("몇 기인지 입력해주세요");
        info.setGeneration(sc.nextInt());
    }

    public void scoreDataRetrival() {
        System.out.println("HTML 과목 점수를 입력해주세요");
        info.setHtmlScore(sc.nextInt());
        System.out.println("CSS 과목 점수를 입력해주세요");
        info.setCssScore(sc.nextInt());
        System.out.println("Javascript 점수를 입력해주세요");
        info.setJsScore(sc.nextInt());
    }

    public void setInfoDataByRetrivingDatas() {
        generationDataRetrival();
        scoreDataRetrival();
    }

    public void printIfPassOrNot() {
        if ((info.getGeneration() < 3 && info.getAverageScore() > 60) || (info.getGeneration() == 3
            && info.getAverageScore() > 70)) {
            System.out.println("합격입니다");
        } else {
            System.out.println("불합격입니다");
        }
    }

    public void printMaxMinAvgScore() {
        System.out.println("전체과목 중 최고점은 " + info.getHighestScore() + " 입니다");
        System.out.println("전체과목 중 최저점은 " + info.getLowestScore() + " 입니다");
        System.out.println("전체 과목의 평균은 " + info.getAverageScore() + " 입니다");
    }


}
