package curg.boardingGate.member;

import java.util.List;

public interface MemberRepository {
    void save(Member _member);
    List<Member> findAll();
    Member findById(int _id);
}
