package day11.task1;

public class Warehouse {
    private int countPickedOrders; // кол-во собранных заказов
    private int countDeliveredOrders; // кол-во досталенных заказов

    public void incrementPickedOrders() {
        countPickedOrders++;
    }

    public void incrementDeliveredOrders() {
        countDeliveredOrders++;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
