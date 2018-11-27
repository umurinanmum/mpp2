package prob2B;

import java.util.ArrayList;

public class Order {

    private int orderNum;
    private ArrayList<OrderLine> orderLines;

    public Order(int orderNum, OrderLine orderLine) throws Exception {
        if (orderLine == null) {
            throw new Exception("Needs to have at least 1 order line");
        }
    }

    public Order(int orderNum, ArrayList<OrderLine> orderLines) throws Exception {
        if (orderLines == null || orderLines.size() < 1) {
            throw new Exception("Needs to have at least 1 order line");
        }
    }

    public Order(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public ArrayList<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(ArrayList<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

}
