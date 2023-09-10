package curg.boardingGate.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemoryMemberRepositoryTest {

    final MemoryMemberRepository memberRepository = new MemoryMemberRepository();
    @Test
    @DisplayName("repo 저장 잘되는지 확인")
    void save() {
        Member member = new Member(1,"진중",Grade.VIP);
        memberRepository.save(member);

        Member byId = memberRepository.findById(1);
        Assertions.assertThat(member).isSameAs(byId);
    }
}
