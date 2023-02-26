package Week7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MemberRepository memberRepository = new MemberRepository();

        Scanner sc = new Scanner(System.in);

        int menuSelection;
        String email = "";
        String name = "";
        int age = 0;

        while (true) {

            System.out.println("원하시는 번호를 입력해주세요");
            System.out.println("1. 회원 등록");

            menuSelection = sc.nextInt();

            if (menuSelection == 1) {
                sc.nextLine();
                System.out.println("이메일을 입력해주세요");
                email = sc.nextLine();

                System.out.println("이름을 입력해주세요");
                name = sc.nextLine();

                System.out.println("나이를 입력해주세요");
                age = sc.nextInt();

                Member member = new Member(name, age, email);
                if (memberRepository.addMemberList(member) == true) {
                    System.out.println("회원 등록이 성공적으로 완료되었습니다");
                } else {
                    System.out.println("이미 등록된 이메일이어서 회원 등록에 실패했습니다");
                }
            }


        }


    }

}
