public class Human extends Actor {

    public Human(String name, boolean isMakeOrder) {
        this.name = name;
        this.isMakeOrder = isMakeOrder;
    }

    @Override
    public void setMakeOrder() {
        this.isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        this.isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String getName() {
        return name;
    }

}
