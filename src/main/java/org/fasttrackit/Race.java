package org.fasttrackit;

public class Race {
    private Track track;
    private Car firstCompetitor;
    private Car secondCompetitor;

    public void start(){

        Engine engine = new Engine();
        engine.setManufacturer("Volvo");
        firstCompetitor = createCompetitor(engine, "Volvo", "red",40.7, 8.8,4);

        System.out.println(firstCompetitor.toString());

        Engine secondEngine = new Engine();
        secondEngine.setManufacturer("Toyota");
        secondCompetitor = createCompetitor(secondEngine, "Toyota", "black", 40.3, 8.4,
                4);
        System.out.println(secondCompetitor.toString());





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















    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Car getFirstcompetitor() {
        return firstCompetitor;
    }

    public void setFirstcompetitor(Car firstcompetitor) {
        this.firstCompetitor = firstcompetitor;
    }

    public Car getSecondcompetitor() {
        return secondCompetitor;
    }

    public void setSecondcompetitor(Car secondompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
