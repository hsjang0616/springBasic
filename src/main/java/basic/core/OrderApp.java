package basic.core;

import basic.core.member.Grade;
import basic.core.member.Member;
import basic.core.member.MemberService;
import basic.core.order.Order;
import basic.core.order.OrderService;

/**
 * packageName    : basic.core
 * fileName       : OrderApp
 * author         : janghyoseong
 * date           : 2023/05/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/05/14        janghyoseong       최초 생성
 */
public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.joinMember(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("odeer: " + order);
        System.out.println("odeer.calculatePrice: " + order.calculatePrice());

    }
}
