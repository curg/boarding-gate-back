package curg.boardingGate.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceImplTest {
    final MemberService memberService = new MemberServiceImpl();
    @Test
    @DisplayName("저장 확인")
    void saveTest(){
        Member member = new Member(1, "진중", Grade.VIP);
        memberService.join(member);

        Member member2 = memberService.getMember(1);
        Assertions.assertThat(member).isSameAs(member2);
    }
}
