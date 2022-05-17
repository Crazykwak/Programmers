import level1.*;
import practice.Member;
import practice.MyComparator;


import java.util.*;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member(3, "김왕건"));
        memberList.add(new Member(1, "이성계"));
        memberList.add(new Member(6, "박수달"));

        Collections.sort(memberList);

        for (Member member : memberList) {
            System.out.println("Id = " + member.getId() + " Name = " + member.getName());
        }

        System.out.println("-".repeat(20));

        MyComparator myComparator = new MyComparator();
        Collections.sort(memberList, myComparator);

        for (Member member : memberList) {
            System.out.println("Id = " + member.getId() + " Name = " + member.getName());
        }

    }
}
