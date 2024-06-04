// Абстрактный класс Actor,
// который хранит в себе
// параметры актора, включая
// состояние готовности сделать
// заказ и факт получения
// заказа.


public abstract class Actor implements ActorBehavoir {

    protected String name;
    protected boolean isMakeOrder; //готов сделать заказ
    protected boolean isTakeOrder; //сделал заказ

    public abstract String getName();



}