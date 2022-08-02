package spring.core;

import spring.core.member.Grade;
import spring.core.member.Member;
import spring.core.member.MemberService;
import spring.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findmember = memberService.findMember(1L);

        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findmember.getName());
    }
}
