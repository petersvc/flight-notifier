package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        var aircraftRepository = new AircraftRepository();
        var flightRepository = new FlightRepository();

        aircraftRepository.save("Boeing747", 3);
        aircraftRepository.save("AirbusA380", 5);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------- Menu Principal ---------------------");
            System.out.println("1 - Cadastrar Voo");
            System.out.println("2 - Adicionar Passageiro");
            System.out.println("3 - Remover Passageiro");

            var option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Menu Principal > Cadastrar Voo");
                    System.out.println("Aeronaves disponíveis: ");
                    aircraftRepository.findByAvailability(flightRepository).forEach(aircraft -> {
                        System.out.println("Cod: " + aircraft.getId() + " | Modelo: " + aircraft.getModel() + " | Capacidade: " + aircraft.getCapacity());
                    });

                    System.out.println("Informe o código da aeronave");

                    var aircraftOption = scanner.nextLong();
                    var aircraft = aircraftRepository.findById(aircraftOption);

                    System.out.println("Informe os dados do Voo a seguir:");

                    System.out.print("Informe o código do voo: ");
                    var code = scanner.nextLong();

                    System.out.print("Informe o aeroporto de origem: ");
                    var departures = scanner.next();

                    System.out.print("Informe o aeroporto de destino: ");
                    var arrivals = scanner.next();

                    System.out.print("Informe a data do voo: ");
                    var date = scanner.next();

                    System.out.print("Informe a previsão do horário de partida: ");
                    var departureTime = scanner.next();

                    System.out.print("Informe a previsão do horário de chegada: ");
                    var arrivalTime = scanner.next();

                    System.out.print("Informe o portão de embarque: ");
                    var gate = scanner.next();

                    flightRepository.save(new Flight(code, departures, arrivals, date, departureTime, arrivalTime, gate, aircraft));
                    break;

                case 2:
                    System.out.println("Menu Principal > Adicionar Passageiro");

                    System.out.println("Informe o código do voo: ");
                    var flightId = scanner.nextLong();
                    var flight = flightRepository.findByCode(flightId);

                    System.out.println("Informe o nome do passageiro: ");
                    var passengerName = scanner.next();

                    System.out.println("Informe o CPF do passageiro: ");
                    var passengerCpf = scanner.next();

                    System.out.println("Informe o meio de notificação: ");
                    System.out.println("1 - SMS ");
                    System.out.println("2 - EMAIL ");
                    System.out.println("3 - PushNotification ");
                    var notificationOption = scanner.nextInt();
                    var notifier = NotifierFactory.create(notificationOption);

                    flight.addPassenger(new Passenger(passengerName, passengerCpf, notifier));

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }

    }
}