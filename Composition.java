// pseudocode for Composition in java
//Car must have Engine
public class Car {
   //engine is a mandatory part of the car
   private final Engine engine;

   public Car () {
      engine = new Engine();
   }
}

//Engine Object
class Engine {}
