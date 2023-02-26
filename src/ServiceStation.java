import Transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transportQueue;

    public ServiceStation(Queue<Transport> transportQueue) {
        this.transportQueue = new LinkedList<Transport>();
    }

    public void printTransportQueue() {
        System.out.println("\nОчередь транспорта для прохождения техобслуживания: ");
        for(Transport tr: transportQueue) {
            System.out.println("ServiceStation {" + tr.getBrand() + " " + tr.getModel() + "}");
        }
        System.out.println();
    }

    public Queue<Transport> getTransportQueue() {
        return transportQueue;
    }

    public void setTransportQueue(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public void addTransportToQueue(Transport transport) {
        if(transport.getType().equals("Автобусы")) {
            System.out.println("\nАвтобусы не проходят техобслуживание и не встают в очередь на техобслуживание.\n");
        } else {
        transportQueue.add(transport);
        }
    }
    public void provideServiceMaintenance() {
        if(transportQueue.peek() == null) {
            System.out.println("Очередь на техобслуживание пустая.");
        } else {
            System.out.println("Техобслуживание проходит: " +
                    transportQueue.peek().getBrand() + " " +
                    transportQueue.peek().getModel());
            transportQueue.poll();
        }
    }
}
