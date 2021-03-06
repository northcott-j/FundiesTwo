// Assignment 1
// Northcott Jonathan
// nrthcoj
// Lowen Zach
// zlowen

interface ITaco { }

class EmptyShell implements ITaco { 
    boolean softShell;
    
    EmptyShell(boolean softShell) {
        this.softShell = softShell;
    }
}

class Filled implements ITaco {
    ITaco taco;
    String filling;
    
    Filled(ITaco taco, String filling) {
        this.taco = taco;
        this.filling = filling;
    }
}

class ExamplesTaco {
    ITaco order1 = new Filled(
                    new Filled(
                     new Filled(
                      new Filled(
                       new EmptyShell(
                        true), 
                      "carnitas"), 
                     "salsa"),
                    "lettuce"),
                   "cheddar cheese");
                   
    ITaco order2 = new Filled(
                    new Filled(
                     new Filled(
                      new EmptyShell(
                       false), 
                     "veggies"), 
                    "guacamole"),
                   "sour cream");

}