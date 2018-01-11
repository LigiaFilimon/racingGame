package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Race {
    private Track track;
//    //private Vehicle[]competitors= new Vehicle[10]; //[] pt siruri//
//    private List<Vehicle> competitorList = new ArrayList<Vehicle>();
//
//
//    public void start(){
//
//        Engine engine = new Engine();
//        engine.setManufacturer("Volvo");
//
//        Vehicle firstCompetitor = createCompetitor(engine, "Volvo", "red",40.7, 8.8,4);
//
//
//        Engine secondEngine = new Engine();
//        secondEngine.setManufacturer("Toyota");
//
//        Vehicle secondCompetitor = createCompetitor(secondEngine, "Toyota", "black", 40.3, 8.4,
//                4);
//
//
//        competitors[0] = firstCompetitor;
//        competitors[1] = secondCompetitor;
//        //cum dam nume competitorilor//
//
//
//
//        for (int i = 0; i < competitors.length; i++) {
//            if (competitors[i] != null) {  //cum pui o conditie. != null -inseamna diferit de nul
//            System.out.println(competitors [i].getName());}
//
//
//            for (Vehicle vehicle : competitors) {   //varianta mai usoara pt loop- bucla for imbunatatita//
//                if (vehicle != null){
//                    System.out.println(vehicle.getName());
//                }
//            }
//        }
//        // cum faci un loop, un sir. Atentie la bulcele infinite=au conditia gresita//
//
//
//         competitorList.get(0);
//        competitorList.add(new Vehicle());
//        competitorList.add(1, new Vehicle());
//    }
//
//
//    private Car createCompetitor(Engine carEngine, String carName, String carColor, Double carFuelLevel, Double carMileage,
//                       int carDoorCount){
//        Car competitor = new Car(carEngine);
//        competitor.setName(carName);
//        competitor.setColor(carColor);
//        competitor.setFuellevel(carFuelLevel);
//        competitor.setMileage(carMileage);
//        competitor.setDoorCount(carDoorCount);
//
//        return competitor;
//
//    }//

        //parameters contain car prefix just to demo they have a name











 private int competitorCount = 2;

     private List<Vehicle> competitors = new ArrayList<Vehicle>();

     private String readVehicleName() {
         System.out.println("Please enter your vehicle's name");
         Scanner scanner = new Scanner(System.in); // ce citim de la tastatura//
         scanner.nextLine(); //tot ce scrie userul pe o linie va fi returnat prin metoda aceasta//
         String name = scanner.nextLine();

         System.out.println("Your vehicle name is : " + name);

         return name;
     }

     private double readAccelerationSpeed() throws Exception {
         System.out.println("Please enter acceleration speed as a decimal number");
         Scanner scanner = new Scanner(System.in);

         double speed = 0;
         try {                                 // pt a schimba textul unei erori//
              speed = scanner.nextDouble();
         } catch (InputMismatchException exception) {
            // throw new Exception("Please enter a valid decimal number");//

             System.out.println("Please enter a valid decimal number");

              return readAccelerationSpeed();
         }

         System.out.println("You accelerated with " + speed + "km/h");

         return speed;

     }

     private void addCompetitor() {
         String vehicleName = readVehicleName();
         new Vehicle();
         Vehicle vehicle = new Vehicle();
         vehicle.setName(vehicleName);
          vehicle.setMileage(ThreadLocalRandom.current().nextDouble());
         System.out.println("Your vehicle's mileage is " + vehicle.getMileage());

         competitors.add(vehicle);
     }


     private void addAllCompetitors(){
         for (int i = 0; i < competitorCount; i++){
             addCompetitor();
         }
     }

     public void start() throws Exception {
         addAllCompetitors();

         boolean noWinnerYet = true;

         while (noWinnerYet)  // fol while cand avem o conditie pana cand trebuie executata bucla//
         {for (Vehicle vehicle : competitors) {
             double speed = readAccelerationSpeed();

             vehicle.accelerate(speed);
         if (vehicle.getTravelDistance() >= track.getLength()) {
             System.out.println("The winner is" + vehicle.getName());
             noWinnerYet = false;
         }


         }




         }
     }


    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }


}
