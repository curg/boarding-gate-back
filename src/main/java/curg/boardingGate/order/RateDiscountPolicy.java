package curg.boardingGate.order;

import curg.boardingGate.member.Grade;
import curg.boardingGate.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    private final int discountRate = 10;
    @Override
    public int calDiscount(Member member, int price) {
        if (member.getGrade()== Grade.VIP){
            return price*discountRate/100;
        }

        return 0;
    }
}
