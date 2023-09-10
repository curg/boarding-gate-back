package curg.boardingGate.order;

import curg.boardingGate.member.Member;

public interface DiscountPolicy {
    int calDiscount(Member member,int price);
}
