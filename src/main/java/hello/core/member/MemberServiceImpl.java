package hello.core.member;

public class MemberServiceImpl implements MemberService{

    //추상화 의존, 구체화 의존. --> DIP 위반 변경시 문
//    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //test only
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
