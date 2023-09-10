package curg.boardingGate.member;

import java.util.LinkedList;
import java.util.List;

public class MemoryMemberRepository implements MemberRepository{
    private List<Member> memberList = new LinkedList<>();

    @Override
    public void save(Member _member) {
        memberList.add(_member);
    }

    @Override
    public List<Member> findAll() {
        return memberList;
    }

    @Override
    public Member findById(int _id) {
        int size = memberList.size();
        for (int i = 0; i < size; i++) {
            Member member = memberList.get(i);
            if (member.getID()==_id){
                return member;
            }
        }
        return null;
    }
}
