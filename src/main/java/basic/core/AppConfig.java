package basic.core;

import basic.core.discount.DiscountPolicy;
import basic.core.discount.FixDiscountPolicy;
import basic.core.discount.RateDiscountPolicy;
import basic.core.member.MemberService;
import basic.core.member.MemberServiceImpl;
import basic.core.member.MemoryMemberRepository;
import basic.core.order.OrderService;
import basic.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
