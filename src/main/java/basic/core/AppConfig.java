package basic.core;

import basic.core.discount.FixDiscountPolicy;
import basic.core.member.MemberService;
import basic.core.member.MemberServiceImpl;
import basic.core.member.MemoryMemberRepository;
import basic.core.order.OrderService;
import basic.core.order.OrderServiceImpl;

/**
 * packageName    : basic.core
 * fileName       : AppConfig
 * author         : janghyoseong
 * date           : 2023/07/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/07/22        janghyoseong       최초 생성
 */
public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), fixDiscountPolicy());
    }

    private FixDiscountPolicy fixDiscountPolicy() {
        return new FixDiscountPolicy();
    }
}
