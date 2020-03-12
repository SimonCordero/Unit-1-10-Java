public class Solarsystem {
  
  public enum Planets {
    Mercury(1),
    Venus(2),
    Earth(3),
    Mars(4),
    Jupiter(5),
    Saturn(6),
    Uranus(7),
    Neptune(8)
    ;
    
    private final int planetNumber;
    public int value() {
      return this.planetNumber;
      
    }
    
    private Planets(int planetNumber) {
      this.planetNumber = planetNumber;
      
    }
    
  }
  
  /**
  * Counter.
  **/ 
  
  public static void main(String[] args) {
    int numberOfPlanets = 8;
    for (int counter = 0; counter <= numberOfPlanets - 1; counter++) {
      Planets tempPlanet = Planets.values()[counter];
      System.out.println(tempPlanet + " " + tempPlanet.value());
      
    }
    System.out.println("Done.");
    
  }
  
}