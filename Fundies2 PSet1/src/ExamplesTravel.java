interface IHabitation {}
interface ITransportation{}

class Planet implements IHabitation{
    String name;
    int population; //in thousands of people
    int spaceports;
    
    Planet(String name, int pop, int sp){
        this.name = name;
        this.population = pop;
        this.spaceports = sp;
    }    
}


class SpaceStation implements IHabitation{
    String name;
    int population;
    int transporter_pads;
    
    SpaceStation(String name, int pop, int tp){
        this.name = name;
        this.population = pop;
    }
}

class Transporter implements ITransportation{
    IHabitation to;
    IHabitation from;
    
    Transporter(IHabitation to, IHabitation from){
        this.to = to;
        this.from = from;
    }
}

class Shuttle implements ITransportation{
    IHabitation to;
    IHabitation from;
    int fuel;
    int capacity;
    
    
    Shuttle(IHabitation to, IHabitation from, int f, int c){
        this.to = to;
        this.from = from;
        this.fuel = f;
        this.capacity = c;
    }
}

class SpaceElevator implements ITransportation{
    IHabitation to;
    IHabitation from;
    int tonnage;
    
    SpaceElevator(IHabitation to, IHabitation from, int t){
        this.to = to;
        this.from = from;
        this.tonnage = t;
    }
}

class ExamplesHabitaion {
    IHabitation nausicant = new Planet("Nausicant", 6000000, 8);
    IHabitation earth = new Planet("Earth", 9000000, 14);
    IHabitation remus = new Planet("Remus", 18000000, 23);
    IHabitation watcherGrid = new SpaceStation("WatcherGrid", 1, 0);
    IHabitation deepSpace42 = new SpaceStation("Deep Space 42", 7, 8);
    IHabitation iss = new SpaceStation("International Space Station", 3, 99);
}

class ExamplesTravel{
    ITransportation shuttle1 = new Shuttle(earth, remus, 10, 20);
    ITransportation shuttle2 = new Shuttle(nausicant, iss, 100, 2);
    ITransportation elevator1 = new SpaceElevator(iss, remus, 321);
    ITransportation elevator2 = new SpaceElevator(earth, deepSpace42, 666);
    ITransportation transporter1 = new Transporter(remus, iss);
    ITransportation transporter2 = new Transporter(deepSpace42, iss);
}