package Week4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week4_Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBookList("클린코드(CleanCode)");
        library.addBookList("객체지향의 사실과 오해");
        library.addBookList("테스트 주도 개발(TDD)");



        while(true) {

            System.out.println("대여할 책의 번호를 입력하세요 ");

            library.printBookList();

            Scanner sc = new Scanner(System.in);

            int selectBookNum = sc.nextInt();

            library.borrowingBook(selectBookNum);

        }

    }
}
