package curg.boardingGate.order;

import curg.boardingGate.member.Grade;
import curg.boardingGate.member.Member;
import curg.boardingGate.member.MemberRepository;
import curg.boardingGate.member.MemoryMemberRepository;

public class FixedDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;

    @Override
    public int calDiscount(Member member, int price) {
        if (member.getGrade()== Grade.VIP){
            return discountFixAmount;
        }

        return 0;
    }
}
