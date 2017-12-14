package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private Track track;
    private Vehicle[]competitors= new Vehicle[10];
    private List<Vehicle> competitorList = new ArrayList<Vehicle>();


    public void start(){

        Engine engine = new Engine();
        engine.setManufacturer("Volvo");

        Vehicle firstCompetitor = createCompetitor(engine, "Volvo", "red",40.7, 8.8,4);


        Engine secondEngine = new Engine();
        secondEngine.setManufacturer("Toyota");

        Vehicle secondCompetitor = createCompetitor(secondEngine, "Toyota", "black", 40.3, 8.4,
                4);


        competitors[0] = firstCompetitor;
        competitors[1] = secondCompetitor;
        //cum dam nume competitorilor//



        for (int i = 0; i < competitors.length; i++) {
            if (competitors[i] != null) {  //cum pui o conditie. != null -inseamna diferit de nul
            System.out.println(competitors [i].getName());}


            for (Vehicle vehicle : competitors) {   //varianta mai usoara pt loop- bucla for imbunatatita//
                if (vehicle != null){
                    System.out.println(vehicle.getName());
                }
            }
        }
        // cum faci un loop, un sir. Atentie la bulcele infinite=au conditia gresita//


         competitorList.get(0);
        competitorList.add(new Vehicle();)
        competitorList.add(1, new Vehicle());
    }


    private Car createCompetitor(Engine carEngine, String carName, String carColor, Double carFuelLevel, Double carMileage,
                       int carDoorCount){
        Car competitor = new Car(carEngine);
        competitor.setName(carName);
        competitor.setColor(carColor);
        competitor.setFuellevel(carFuelLevel);
        competitor.setMileage(carMileage);
        competitor.setDoorCount(carDoorCount);

        return competitor;

    }

        //parameters contain car prefix just to demo they have a name
       // [] pt siruri//















    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }


}
