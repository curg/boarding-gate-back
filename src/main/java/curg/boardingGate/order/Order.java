package curg.boardingGate.order;

public class Order {
    private int memberId;
    private String productName;
    private int price;
    private int discountPrice;
    private int ea;

    public Order(int id, String productName, int price, int discountPrice, int ea) {
        this.memberId = id;
        this.productName = productName;
        this.price = price;
        this.discountPrice = discountPrice;
        this.ea = ea;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEa() {
        return ea;
    }

    public void setEa(int ea) {
        this.ea = ea;
    }
}
