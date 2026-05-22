/*
Singly Linked List
Build a railway management system that tracks moving trains on a single railway line. Each station is connected linearly (just like a singly linked list), and trains are tracked as they move from station to station.
Each node in the linked list represents a station, containing:

Station Name
Pointer to the next station

Support these operations:

Add a station at the end of the track
Insert a new station between two existing ones
Remove a station (e.g., closed for maintenance)
Traverse the route (print all station names and distances)
Given a train’s current station name, find the next N stations ahead

*/

class Node {
  constructor(name, next) {
    this.name = name;
    this.next = next;
  }
}
class Station {
  constructor() {
    this.head = null;
  }
  addStation(name) {
    if (this.head === null) {
      this.head = new Node(name, null);
    } else {
      let current = this.head;
      while (current.next !== null) {
        current = current.next;
      }
      current.next = new Node(name, null);
    }
  }
  insertStation(name, prevName) {
    if (this.head === null) {
      console.log("List is empty");
    } else {
      let current = this.head;
      while (current !== null) {
        if (current.name === prevName) {
          let newNode = new Node(name, current.next);
          current.next = newNode;
          break;
        }
        current = current.next;
      }
    }
  }
  removeStation(name) {
    if (this.head === null) {
      console.log("List is empty");
    } else {
      let current = this.head;
      let prev = null;
      while (current !== null) {
        if (current.name === name) {
          if (prev === null) {
            this.head = current.next;
          } else {
            prev.next = current.next;
          }
          break;
        }
        prev = current;
        current = current.next;
      }
    }
  }
  traverse() {
    if (this.head === null) {
      console.log("List is empty");
    } else {
      let current = this.head;
      while (current !== null) {
        console.log(current.name);
        current = current.next;
      }
    }
  }
  findNextNStations(name, n) {
    if (this.head === null){
      console.log("List is empty");
    } else {
      let current = this.head;
      let count = 0;
      while (current !== null) {
        if (current.name === name) {
          while (count < n){
            current = current.next;
            count++;
          }
          break:
        }
        current = current.next:
      }
      if (current === null){
        console.log("No more stations ahead");
      } else {
        console.log(current.name);
      }
    }
  }
}
Let station = new Station();
station.addStation("Station A");
station.addStation("Station B");
station.addStation("Station C");
station.insertStation("Station D", "Station B");
station.removeStation("Station C");
station.traverse();
station.findNextNStations("Station A", 2);