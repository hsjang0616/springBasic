package basic.core.order;

/**
 * packageName    : basic.core.order
 * fileName       : OrderService
 * author         : janghyoseong
 * date           : 2023/03/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/23        janghyoseong       최초 생성
 */
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
