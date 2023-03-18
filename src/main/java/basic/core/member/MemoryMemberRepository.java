package basic.core.member;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * packageName    : basic.core.member
 * fileName       : MemoryMemberRepository
 * author         : janghyoseong
 * date           : 2023/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/12        janghyoseong       최초 생성
 */
public class MemoryMemberRepository implements MemberRepository {


    // HashMap의 경우 동시성 이슈가 발생할 수 있으므로 실무에서는 ConcurrentHashMap을 사용하도록 하자.
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
