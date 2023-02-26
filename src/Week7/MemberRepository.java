package Week7;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private static List<Member> memberList = new ArrayList<>();

    public List<Member> getMemberList() {
        return memberList;
    }

    public boolean addMemberList(Member member) {

        if (sameEmailValidation(member.getEmailAddress()) == true) {
            memberList.add(member);
            return true;
        } else {
            return false;
        }
    }

    public Member findByEmail(String email) {

        for (Member member : memberList) {
            if (member.getEmailAddress().equals(email)) {
                return member;
            }
        }

        return null;

    }

    public boolean findByName(String name) {
        for (Member member : memberList) {
            if (member.getName().equals(name)) {
                System.out.println(name + "의 이메일은 " + member.getEmailAddress() + "이고 "
                    + "나이는 " + member.getAge() + "입니다");
                return true;
            }
        }

        return false;
    }

    private boolean sameEmailValidation(String email) {
        if (findByEmail(email) != null) {
            return false;
        }
        return true;
    }


}
