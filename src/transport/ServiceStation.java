package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private Queue <Transport<?>> queue;

    public ServiceStation () {
        queue = new LinkedList<>();
    }

    public void addTransportToQueue(Transport<?> auto) {
        if (auto != null) {
            queue.add(auto);
        } else {
            System.out.println("Добавьте авто");
        }
    }

    public void carryOutAnInspection (Transport<?> auto) {
        auto = queue.poll();
        System.out.println("Провести техосмотр авто " + auto);
    }

    public void addTransportToQueue(Bus auto) throws TransportTypeException{
        throw new TransportTypeException ("Автобусы не нуждаются в техобслуживании!");
    }

    public void carryOutAnInspection (Bus auto) throws TransportTypeException{
        throw new TransportTypeException ("Автобусы не нуждаются в техобслуживании!");
    }

    public void printQueue() {
        System.out.println(queue);
    }
}
