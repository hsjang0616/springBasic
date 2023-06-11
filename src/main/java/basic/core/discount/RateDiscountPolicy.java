package basic.core.discount;

import basic.core.member.Grade;
import basic.core.member.Member;

/**
 * packageName    : basic.core.discount
 * fileName       : RateDiscountPolicy
 * author         : janghyoseong
 * date           : 2023/06/11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/06/11        janghyoseong       최초 생성
 */
public class RateDiscountPolicy implements DiscountPolicy {

    private final int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
