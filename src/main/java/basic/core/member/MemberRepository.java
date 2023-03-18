package basic.core.member;

/**
 * packageName    : basic.core.member
 * fileName       : MemberRepository
 * author         : janghyoseong
 * date           : 2023/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/12        janghyoseong       최초 생성
 */
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
