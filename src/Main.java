import Transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создание списка механиков для ДЗ List и Queue");
        List<Mechanic> listOfAllMechanics = initializeAllMechanics();
        System.out.println(listOfAllMechanics + "\n");

        Queue<Transport> transportQueue = new LinkedList<Transport>();
        ServiceStation serviceStation = new ServiceStation(transportQueue);

        System.out.println(Arrays.toString(PassengerCarBodyType.values()) + "\n");

        Driver_Category_B petrov = new Driver_Category_B("Петров", true, 10);
        System.out.println("Водитель категории В: " + petrov + "\n");

        List<Mechanic> passengerCarMechanics = new ArrayList<Mechanic>();
        passengerCarMechanics.add(listOfAllMechanics.get(0));
        passengerCarMechanics.add(listOfAllMechanics.get(6));
        System.out.println("Список механиков для легковых автомобилей: \n" + passengerCarMechanics + "\n");

        PassengerCar<Driver_Category_B> passengerCar = new PassengerCar<Driver_Category_B>("", "", 31.6, petrov, PassengerCarBodyType.COUPE, null, passengerCarMechanics);
        System.out.print("Тип транспортного средсва у passengerCar: ");
        passengerCar.printType();
        System.out.println();

        PassengerCar<Driver_Category_B> qashkai = new PassengerCar<Driver_Category_B>("Nissan", "Qashkai", 2.0, petrov, PassengerCarBodyType.CROSSOVER, Type.PASSENGER_CAR, passengerCarMechanics);
        serviceStation.addTransportToQueue(qashkai);
        System.out.print("Тип транспортного средсва у qashkai: ");
        qashkai.printType();
        PassengerCar<Driver_Category_B> bmw = new PassengerCar<Driver_Category_B>("BMW", "X1", 2.0, petrov, PassengerCarBodyType.CROSSOVER, Type.PASSENGER_CAR, passengerCarMechanics);
        serviceStation.addTransportToQueue(bmw);
        PassengerCar<Driver_Category_B> audi = new PassengerCar<Driver_Category_B>("Audi", "A3", 1.8, petrov, PassengerCarBodyType.SEDAN, Type.PASSENGER_CAR, passengerCarMechanics);
        serviceStation.addTransportToQueue(audi);
        System.out.println(passengerCar + "\n" + qashkai + "\n" + bmw + "\n" + audi + "\n");
        serviceStation.printTransportQueue();

        passengerCar.startMovement();
        passengerCar.stopMovement();

        qashkai.maximumSpeed();
        bmw.bestLapTime();
        audi.pit_stop();

        printInformation(petrov, bmw);

        petrov.startDriving();
        petrov.stopDriving();
        petrov.fillFuel();
        bmw.passCarDiagnostics();
        System.out.println();

        List<Mechanic> truckMechanics = new ArrayList<Mechanic>();
        truckMechanics.add(listOfAllMechanics.get(3));
        truckMechanics.add(listOfAllMechanics.get(4));
        truckMechanics.add(listOfAllMechanics.get(5));
        System.out.println("Список механиков для грузовиков: \n" + truckMechanics + "\n");

        Driver_Category_C ivanov = new Driver_Category_C("Иванов", true, 9);
        System.out.println("Водитель категории С: " + ivanov + "\n");

        Truck<Driver_Category_C> truck = new Truck<Driver_Category_C>("", "", 10, ivanov, LoadCapacity.N1, null, truckMechanics);
        System.out.print("Тип транспортного средсва у truck: ");
        truck.printType();
        System.out.println();

        Truck<Driver_Category_C> volvo = new Truck<Driver_Category_C>("Volvo", "FL", 2.4, ivanov, LoadCapacity.N2, Type.TRUCK, truckMechanics);
        serviceStation.addTransportToQueue(volvo);
        System.out.print("Тип транспортного средства у volvo: ");
        volvo.printType();
        Truck<Driver_Category_C> scania = new Truck<Driver_Category_C>("Scania", "P440", 3.0, ivanov, LoadCapacity.N3, Type.TRUCK, truckMechanics);
        serviceStation.addTransportToQueue(scania);
        Truck<Driver_Category_C> renault = new Truck<Driver_Category_C>("Renault", "Magnum", 12.0, ivanov, LoadCapacity.N3, Type.TRUCK, truckMechanics);
        serviceStation.addTransportToQueue(renault);
        System.out.println(truck + "\n" + volvo + "\n" + scania + "\n" + renault);
        serviceStation.printTransportQueue();

        truck.startMovement();
        truck.stopMovement();
        volvo.pit_stop();
        scania.bestLapTime();
        renault.maximumSpeed();

        printInformation(ivanov, renault);
        ivanov.startDriving();
        ivanov.stopDriving();
        ivanov.fillFuel();
        renault.passCarDiagnostics();
        System.out.println();

        Driver_Category_D sidorov = new Driver_Category_D("Сидоров", true, 20);
        System.out.println("Водитель категории D: " +sidorov + "\n");

        List<Mechanic> busMechanics = new ArrayList<Mechanic>();
        busMechanics.add(listOfAllMechanics.get(1));
        busMechanics.add(listOfAllMechanics.get(2));
        busMechanics.add(listOfAllMechanics.get(3));
        System.out.println("Список механиков для автобусов: \n" + busMechanics + "\n");

        Bus<Driver_Category_D> bus = new Bus<Driver_Category_D>("", "", 0, sidorov, BusCapacity.MINI, null, busMechanics);
        System.out.print("Тип транспортного средсва у bus: ");
        bus.printType();
        Bus<Driver_Category_D> volvoBus = new Bus<Driver_Category_D>("Volvo", "B12", 12.1, sidorov, BusCapacity.SMALL, Type.BUS, busMechanics);
        System.out.print("Тип транспортного средсва у volvoBus: ");
        volvoBus.printType();
        serviceStation.addTransportToQueue(volvoBus);
        Bus<Driver_Category_D> maz = new Bus<Driver_Category_D>("MAZ", "203", 12.0, sidorov, BusCapacity.MIDI, Type.BUS, busMechanics);
        serviceStation.addTransportToQueue(maz);
        Bus<Driver_Category_D> mersedesBus = new Bus<Driver_Category_D>("MB", "Tourismo", 12.0, sidorov, BusCapacity.LARGE, Type.BUS, busMechanics);
        serviceStation.addTransportToQueue(mersedesBus);
        System.out.println(bus + "\n" + volvoBus + "\n" + maz + "\n" + mersedesBus);
        serviceStation.printTransportQueue();
        System.out.println();

        bus.startMovement();
        bus.stopMovement();
        volvoBus.pit_stop();
        maz.bestLapTime();
        mersedesBus.maximumSpeed();

        printInformation(sidorov, volvoBus);
        sidorov.startDriving();
        sidorov.stopDriving();
        sidorov.fillFuel();
        try {
        maz.passCarDiagnostics();
        } catch (TransportTypeException buses) {
            System.out.println(buses.getMessage());
        } finally {
            System.out.println("Диагностика завершена.");
        }

        System.out.println();

        List<Transport> transports = new ArrayList<>();
        transports.add(qashkai);
        transports.add(bmw);
        transports.add(audi);
        transports.add(volvo);
        transports.add(scania);
        transports.add(renault);
        transports.add(volvoBus);
        transports.add(maz);
        transports.add(mersedesBus);
        printParticipantsList(transports);


        passengerCarMechanics.get(0).performMaintenance(bmw);
        passengerCarMechanics.get(1).repairAutomobile(audi);
        truckMechanics.get(0).performMaintenance(volvo);
        truckMechanics.get(1).repairAutomobile(renault);
        busMechanics.get(1).performMaintenance(volvoBus);
        busMechanics.get(2).repairAutomobile(mersedesBus);
        System.out.println();

        bmw.printDriverAndMechanicsInfo();
        renault.printDriverAndMechanicsInfo();
        volvoBus.printDriverAndMechanicsInfo();
        System.out.println();

        serviceStation.printTransportQueue();
        System.out.println("Начинается техобслуживание транспортных средств.");
        while(serviceStation.getTransportQueue().size() >= 0) {
            if(serviceStation.getTransportQueue().size() > 0) {
                serviceStation.provideServiceMaintenance();
            } else {
                System.out.println("Все транспортные средства прошли техобслуживание.");
                break;
            }
        }
        System.out.println();
    }
    public static void printInformation(Driver driver, Transport transport) {
        System.out.println("Водитель " + driver.getFullName() +
                            " управляет автомобилем " + transport.getModel() +
                            " и будет участвовать в заезде.");
    }
    public static List<Mechanic> initializeAllMechanics() {
        String name_1 = "Иван Иванов";
        String name_2 = "Петр Петров";
        String name_3 = "Сергей Сергеев";
        String name_4 = "Андрей Андреев";
        String name_5 = "Василий Васильев";
        String name_6 = "Герман Германов";
        String name_7 = "Дмитрий Дмитриев";
        String companyName_1 = "Крутые механики";
        String companyName_2 = "Топ Механикс";
        String companyName_3 = "Супер механики";
        Mechanic mechanic_1 = new Mechanic(name_1, companyName_1);
        Mechanic mechanic_2 = new Mechanic(name_2, companyName_1);
        Mechanic mechanic_3 = new Mechanic(name_3, companyName_2);
        Mechanic mechanic_4 = new Mechanic(name_4, companyName_2);
        Mechanic mechanic_5 = new Mechanic(name_5, companyName_3);
        Mechanic mechanic_6 = new Mechanic(name_6, companyName_3);
        Mechanic mechanic_7 = new Mechanic(name_7, companyName_3);
        List<Mechanic> generalList = new ArrayList<Mechanic>();
        generalList.add(mechanic_1);
        generalList.add(mechanic_2);
        generalList.add(mechanic_3);
        generalList.add(mechanic_4);
        generalList.add(mechanic_5);
        generalList.add(mechanic_6);
        generalList.add(mechanic_7);
        return generalList;
    }
    public static void printParticipantsList(List<Transport> transports) {
        System.out.println("Список автомобилей, участвующих в гонках:");
        for(int i = 0; i < transports.size(); i++) {
            System.out.println(transports.get(i).getBrand() + " " + transports.get(i).getModel());
        }
        System.out.println();
    }
}