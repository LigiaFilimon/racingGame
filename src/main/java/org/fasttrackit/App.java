package org.fasttrackit;

/**
 * Hello world!
 *
 */
// comment

public class App 
{
    public static void main(
            String[] args)
    {Race race = new Race();

    Track track = new Track();
    track.length = 100;

    race.track = track;
        Engine engine = new Engine();
        engine.manufacturer = "Volvo";
    Car car = new Car();
    car.name = "Volvo";
    car.color = "black";
    car.fuellevel = 100.00;
    car.mileage = 12.5;
    car.doorCount = 4;
    car.engine = engine;

    Engine engine2 = new Engine();
    engine2.manufacturer = "Honda";

    Car car2 = new Car();
    car2.name = "Honda";
    car2.color = "red";
    car2.fuellevel= 100.00;
    car2.mileage = 13.5;
    car2.doorCount = 2;
    car2.engine = engine2;













    }
}
