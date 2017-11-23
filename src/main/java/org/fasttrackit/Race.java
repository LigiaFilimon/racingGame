package org.fasttrackit;

public class Race {
    private Track track;
    private Car firstcompetitor;
    private Car secondcompetitor;

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Car getFirstcompetitor() {
        return firstcompetitor;
    }

    public void setFirstcompetitor(Car firstcompetitor) {
        this.firstcompetitor = firstcompetitor;
    }

    public Car getSecondcompetitor() {
        return secondcompetitor;
    }

    public void setSecondcompetitor(Car secondcompetitor) {
        this.secondcompetitor = secondcompetitor;
    }
}
