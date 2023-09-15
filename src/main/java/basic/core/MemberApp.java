package basic.core;

import basic.core.member.Grade;
import basic.core.member.Member;
import basic.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        // spring은 ApplicationContext에서 전부 관리: container
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class); // appconfig 환경설정 정보를 호출

        // 기본적으로 메서드 명으로 이름이 등록, 타입.class
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.joinMember(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
