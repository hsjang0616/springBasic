package basic.core.discount;

import basic.core.member.Grade;
import basic.core.member.Member;

/**
 * packageName    : basic.core.discount
 * fileName       : FixDiscountPolicy
 * author         : janghyoseong
 * date           : 2023/03/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/23        janghyoseong       최초 생성
 */
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
