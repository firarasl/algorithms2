package assignment7;

public class TestPlanet {


    public static final double gravitationalConstant = 6.67300e-11;
    
    public static double surfaceGravity(Planet planet){
        double result = gravitationalConstant* planet.getMass() / (planet.getRadius()*planet.getRadius());
        return result;
    }
    
    public static double surfaceWeight(double mass, Planet planet){


        // following the advice from the forum by Arooba Aqeel

//        "Arooba Aqeel at 1/10/22, 10:38 AM"+
//        "I would suggest finding mass by dividing earth weight(can be any weight of your choice) divided by surface gravity on earth. Then you pass this mass when calling the surfaceWeight method.";

        double experiment = mass/ surfaceGravity(Planet.EARTH);

        double result = experiment* surfaceGravity(planet);
//        System.out.println("alternative");
//        System.out.println((mass/10)* surfaceGravity(planet));
        return result;
    }

    static void primeFactors( int num){
        int i=2;
        if (num==1)
            return;
        while (num%i!=0)
            i++;
        System.out.println(i+" ");
        primeFactors(num/i);
    }

    public static void main(String[] args) {

primeFactors(15);
//        System.out.println("Your weight on MERCURY is "+ surfaceGravity(Planet.MERCURY));
//        System.out.println("Your weight on VENUS is "+  surfaceGravity(Planet.VENUS));
//        System.out.println("Your weight on EARTH is "+  surfaceGravity(Planet.EARTH));
//        System.out.println("Your weight on MARS is "+  surfaceGravity(Planet.MARS));
//        System.out.println("Your weight on JUPITER is "+ surfaceGravity(Planet.JUPITER));
//        System.out.println("Your weight on SATURN is "+  surfaceGravity(Planet.SATURN));
//        System.out.println("Your weight on URANUS is "+  surfaceGravity(Planet.URANUS));
//        System.out.println("Your weight on NEPTUNE is "+  surfaceGravity(Planet.NEPTUNE));

//        System.out.println("-------------------------------------------------------------------------------------------");
//
//        System.out.println("Your weight on MERCURY is "+ surfaceWeight(180, Planet.MERCURY));
//        System.out.println("Your weight on VENUS is "+ surfaceWeight(180, Planet.VENUS));
//        System.out.println("Your weight on EARTH is "+ surfaceWeight(180, Planet.EARTH));
//        System.out.println("Your weight on MARS is "+ surfaceWeight(180, Planet.MARS));
//        System.out.println("Your weight on JUPITER is "+ surfaceWeight(180, Planet.JUPITER));
//        System.out.println("Your weight on SATURN is "+ surfaceWeight(180, Planet.SATURN));
//        System.out.println("Your weight on URANUS is "+ surfaceWeight(180, Planet.URANUS));
//        System.out.println("Your weight on NEPTUNE is "+ surfaceWeight(180, Planet.NEPTUNE));




    }
}
