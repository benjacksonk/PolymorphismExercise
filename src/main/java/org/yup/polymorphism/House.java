package org.yup.polymorphism;

public class House extends Asset {
    String address;
    int condition;
    int squareFoot;
    int lotSize;


    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    @Override
    public double getValue() {

        double value;

        switch (condition) {
            // excellent condition
            case 1:
                value = 180 * squareFoot;
                break;
            // good condition
            case 2:
                value = 130 * squareFoot;
                break;
            // fair condition
            case 3:
                value = 90 * squareFoot;
                break;
            // poor condition
            case 4:
                value = 80 * squareFoot;
                break;
            // IDK house has ghosts instead of a roof
            default:
                value = squareFoot;
        }

        value += 0.25 * lotSize;

        return value;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
