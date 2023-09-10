package curg.boardingGate.member;

public class MemberServiceImpl implements MemberService{
    final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member getMember(int _id) {
        return memberRepository.findById(_id);
    }
}
