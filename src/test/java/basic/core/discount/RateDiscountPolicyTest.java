package basic.core.discount;

import basic.core.member.Grade;
import basic.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * packageName    : basic.core.discount
 * fileName       : RateDiscountPolicyTest
 * author         : janghyoseong
 * date           : 2023/06/11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/06/11        janghyoseong       최초 생성
 */
class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();


    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다")
    void vip_o() {
        // given
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);
        // when
        int discount = discountPolicy.discount(memberVIP, 10000);
        // then
        assertThat(discount).isEqualTo(1000);

    }


    @Test
    @DisplayName("VIP 아니면 할인이 적용되지 않아야 한다")
    void vip_x() {
        // given
        Member member = new Member(1L, "memberBasic", Grade.BASIC);
        // when
        int discount = discountPolicy.discount(member, 10000);
        // then
        assertThat(discount).isEqualTo(0);
    }

}
