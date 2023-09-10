package curg.boardingGate.order;

import curg.boardingGate.member.Member;
import curg.boardingGate.member.MemberRepository;
import curg.boardingGate.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    MemberRepository memberRepository = new MemoryMemberRepository();
    OrderRepository memoryOrderRepository = new MemoryOrderRepository();

    //DiscountPolicy discountPolicy = new FixedDiscountPolicy();
    DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Override
    public void createOrder(int memberId, String productName, int price, int ea) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.calDiscount(member, price);


    }
}
