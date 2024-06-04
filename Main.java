public class Main {

    public static void main(String[] args) {
       
        Market market = new Market();

        market.takeInQueue(new Human("Покупатель-1", true));
        market.takeInQueue(new Human("Покупатель-2", true));  
        market.takeInQueue(new Human("Покупатель-3", false));
        market.update();
        market.takeInQueue(new Human("Покупатель-4", false));
        market.takeInQueue(new Human("Покупатель-5", true));
        market.update();
        market.takeInQueue(new Human("Покупатель-6", true));
        market.update();
    }
        
}