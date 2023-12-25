//Реализовать класс Market и все методы, которые он обязан реализовывать. Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдает заказы).

public interface QueueBehaviour {
    public void enqueue(Object item);
    public Object dequeue();
    public boolean isEmpty();
}

public interface MarketBehaviour {
    public void addToQueue(Object item);
    public void removeFromQueue(Object item);
    public void update();
}

public class Market implements MarketBehaviour, QueueBehaviour {
    private Queue<Object> queue = new LinkedList<>();

    @Override
    public void enqueue(Object item) {
        queue.add(item);
    }

    @Override
    public Object dequeue() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void addToQueue(Object item) {
        enqueue(item);
    }

    @Override
    public void removeFromQueue(Object item) {
        if (queue.contains(item)) {
            queue.remove(item);
        }
    }

    @Override
    public void update() {
        // update state of market
    }
}
