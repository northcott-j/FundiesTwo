// Assignment 1
// Northcott Jonathan
// nrthcoj
// Lowen Zach
// zlowen

interface IHabitation { }
interface ITransportation { }

class Planet implements IHabitation {
    String name;
    int population; //in thousands of people
    int spaceports;
    
    Planet(String name, int population, int spaceports) {
        this.name = name;
        this.population = population;
        this.spaceports = spaceports;
    }    
}


class SpaceStation implements IHabitation {
    String name;
    int population;
    int transporterPads;
    
    SpaceStation(String name, int population, int transporterPads) {
        this.name = name;
        this.population = population;
        this.transporterPads = transporterPads;
    }
}

class Transporter implements ITransportation {
    IHabitation to;
    IHabitation from;
    
    Transporter(IHabitation to, IHabitation from) {
        this.to = to;
        this.from = from;
    }
}

class Shuttle implements ITransportation {
    IHabitation to;
    IHabitation from;
    int fuel;
    int capacity;
    
    
    Shuttle(IHabitation to, IHabitation from, int fuel, int capacity) {
        this.to = to;
        this.from = from;
        this.fuel = fuel;
        this.capacity = capacity;
    }
}

class SpaceElevator implements ITransportation {
    IHabitation to;
    IHabitation from;
    int tonnage;
    
    SpaceElevator(IHabitation to, IHabitation from, int tonnage) {
        this.to = to;
        this.from = from;
        this.tonnage = tonnage;
    }
}

class ExamplesTravel {
    IHabitation nausicant = new Planet("Nausicant", 6000000, 8);
    IHabitation earth = new Planet("Earth", 9000000, 14);
    IHabitation remus = new Planet("Remus", 18000000, 23);
    IHabitation watcherGrid = new SpaceStation("WatcherGrid", 1, 0);
    IHabitation deepSpace42 = new SpaceStation("Deep Space 42", 7, 8);
    IHabitation iss = new SpaceStation("International Space Station", 3, 99);
    
    ITransportation shuttle1 = new Shuttle(earth, remus, 10, 20);
    ITransportation shuttle2 = new Shuttle(nausicant, iss, 100, 2);
    ITransportation elevator1 = new SpaceElevator(iss, remus, 321);
    ITransportation elevator2 = new SpaceElevator(earth, deepSpace42, 666);
    ITransportation transporter1 = new Transporter(remus, iss);
    ITransportation transporter2 = new Transporter(deepSpace42, iss);
}