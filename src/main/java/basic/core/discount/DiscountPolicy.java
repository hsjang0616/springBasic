package basic.core.discount;

import basic.core.member.Member;

/**
 * packageName    : basic.core.discount
 * fileName       : DiscountPolicy
 * author         : janghyoseong
 * date           : 2023/03/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/23        janghyoseong       최초 생성
 */
public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
