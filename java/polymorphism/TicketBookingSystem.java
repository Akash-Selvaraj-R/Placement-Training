/* 
A travel booking system sells tickets for Bus and Train
Each mode of transport has a different way of generating tickets 
in java using polymorphism and constructors.
*/
class Ticket {
    private String ticketId;
    private String passengerName;

    public Ticket(String ticketId, String passengerName) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
    }

    public String getTicketDetails() {
        return "Ticket ID: " + ticketId + ", Passenger: " + passengerName;
    }
}
class BusTicket extends Ticket {
    private String busNumber;

    public BusTicket(String ticketId, String passengerName, String busNumber) {
        super(ticketId, passengerName);
        this.busNumber = busNumber;
    }
    @Override
    public String getTicketDetails() {
        return super.getTicketDetails() + ", Bus Number: " + busNumber;
    }
}
class TrainTicket extends Ticket {
    private String trainNumber;

    public TrainTicket(String ticketId, String passengerName, String trainNumber) {
        super(ticketId, passengerName);
        this.trainNumber = trainNumber;
    }
    @Override
    public String getTicketDetails() {
        return super.getTicketDetails() + ", Train Number: " + trainNumber;
    }
}
public class TicketBookingSystem {
    public static void main(String[] args) {
        Ticket busTicket = new BusTicket("B123", "Alice", "Bus-45");
        Ticket trainTicket = new TrainTicket("T456", "Bob", "Train-12");

        System.out.println(busTicket.getTicketDetails());
        System.out.println(trainTicket.getTicketDetails());
    }
}

// Output:
// Ticket ID: B123, Passenger: Alice, Bus Number: Bus-45
// Ticket ID: T456, Passenger: Bob, Train Number: Train-12