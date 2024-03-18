package basic.core;

import basic.core.discount.FixDiscountPolicy;
import basic.core.member.MemberService;
import basic.core.member.MemberServiceImpl;
import basic.core.member.MemoryMemberRepository;
import basic.core.order.OrderService;
import basic.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig의 등장ㅇ로 애플리케이션이 크게 사용 영역과 객체를 생성하고 수엏하는 영역으로 분리
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
        return new OrderServiceImpl(memberRepository(), fixDiscountPolicy());
    }

    @Bean
    public FixDiscountPolicy fixDiscountPolicy() {
        return new FixDiscountPolicy();
    }
}
