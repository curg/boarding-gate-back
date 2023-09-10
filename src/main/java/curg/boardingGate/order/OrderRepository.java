package curg.boardingGate.order;

import java.util.LinkedList;
import java.util.List;

public interface OrderRepository {
    void save(Order order);
    Order getOrderById(int id);
}
