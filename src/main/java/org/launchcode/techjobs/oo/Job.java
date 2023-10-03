package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public static int nextId() {
        return nextId;
    }

    public String toString() {
        if (name == null || name.isEmpty()) {
            name = "Data not available";
        }
        if (employer.getValue() == null || employer.getValue().isEmpty()) {
            employer.setValue("Data not available");
        }
        if (location.getValue() == null || location.getValue().isEmpty()) {
            location.setValue("Data not available");
        }
        if (positionType.getValue() == null || positionType.getValue().isEmpty()) {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue() == null || coreCompetency.getValue().isEmpty()) {
            coreCompetency.setValue("Data not available");
        }
        String lineSeparator = System.lineSeparator();

        return lineSeparator +
               "ID: " + id + lineSeparator +
               "Name: " + name + lineSeparator +
               "Employer: " + employer + lineSeparator +
               "Location: " + location + lineSeparator +
               "Position Type: " + positionType + lineSeparator +
               "Core Competency: " + coreCompetency + lineSeparator;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//      and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
