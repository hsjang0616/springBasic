package basic.core.member;

/**
 * packageName    : basic.core.member
 * fileName       : MemberServiceImpl
 * author         : janghyoseong
 * date           : 2023/03/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/12        janghyoseong       최초 생성
 */
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();


    @Override
    public void joinMember(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
