package basic.core;

import basic.core.member.Grade;
import basic.core.member.Member;
import basic.core.member.MemberService;
import basic.core.member.MemberServiceImpl;

/**
 * packageName    : basic.core
 * fileName       : MemberApp
 * author         : janghyoseong
 * date           : 2023/03/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/18        janghyoseong       최초 생성
 */
public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.joinMember(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
