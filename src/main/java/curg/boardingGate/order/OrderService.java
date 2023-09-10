package curg.boardingGate.order;

public interface OrderService {

    void createOrder(int memberId,String productName, int price, int ea);

}