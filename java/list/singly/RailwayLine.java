class RailwayLine {
    static class Station {
        String name;
        Station next;

        Station(String name) {
            this.name = name;
        }
    }

    Station head;
    public void addStation(String name) {
        Station newStation = new Station(name);

        if (head == null) {
            head = newStation;
            return;
        }

        Station temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStation;
    }
    public void insertStation(String after, String name) {
        Station temp = head;

        while (temp != null && !temp.name.equals(after)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Station not found.");
            return;
        }

        Station newStation = new Station(name);
        newStation.next = temp.next;
        temp.next = newStation;
    }

    public void removeStation(String name) {
        if (head == null) return;

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Station temp = head;
        while (temp.next != null && !temp.next.name.equals(name)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void traverse() {
        Station temp = head;
        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void nextNStations(String name, int n) {
        Station temp = head;

        // find starting station
        while (temp != null && !temp.name.equals(name)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Station not found.");
            return;
        }

        System.out.println("Next " + n + " stations after " + name + ":");

        temp = temp.next;
        while (temp != null && n > 0) {
            System.out.println(temp.name);
            temp = temp.next;
            n--;
        }
    }

    public static void main(String[] args) {
        RailwayLine line = new RailwayLine();

        line.addStation("A");
        line.addStation("B");
        line.addStation("C");

        line.insertStation("B", "B2");
        line.removeStation("C");

        line.traverse();

        line.nextNStations("A", 2);
    }
}
