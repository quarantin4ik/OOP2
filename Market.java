import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// Реализовать класс Market и
// все методы, которые он
// обязан реализовывать.
// Методы из интерфейса
// QueueBehaviour, имитируют
// работу очереди,
// MarketBehaviour – помещает и
// удаляет человека из очереди,
// метод update – обновляет
// состояние магазина
// (принимает и отдает заказы)

public class Market implements MarketBehaviour, QueueBehaviour{

    private List<Actor> actors = new ArrayList<Actor>();
    
    @Override
    public void acceptToMarket(Actor actor) {
        if(actor.isMakeOrder){
        takeOrders();
        } else {
        System.out.println(actors.get(0).getName() + " Такого заказа нет");
        }
    }
        
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);
        update();
    }

    @Override
    public void update() {
        if(!actors.isEmpty()){
        acceptToMarket(actors.get(0));
        releaseFromMarket(actors);

        }else{
        System.out.println("Очередь пуста");
        }

    }

    @Override
    public void giveOrders() {
        System.out.println(actors.get(0).getName()+" Ваш заказ готов");
        releaseFromQueue();
    }

    @Override
    public void takeOrders() {
        System.out.println(actors.get(0).getName()+" Ваш заказ принят");
        giveOrders();
        
    }

    @Override
    public void takeInQueue(Actor actor) {
        actors.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
        
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actors.get(0).getName()+" До свидания!");
        
    }

    

    

    



}