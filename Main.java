public class Main {

    public static void main(String[] args) {

        
        
        Market market = new Market();

        

    
        market.takeInQueue(new Human("Покупатель-1", true));
        market.takeInQueue(new Human("Покупатель-2", true));  
        market.takeInQueue(new Human("Покупатель-3", false));
        market.update();
    }
        

}