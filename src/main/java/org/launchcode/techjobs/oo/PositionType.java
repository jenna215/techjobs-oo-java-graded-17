package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

    public PositionType(String value) {
        super(value);
    }
}

//import java.util.Objects;

//public class PositionType {
//
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PositionType that = (PositionType) o;
//        return id == that.id && Objects.equals(value, that.value);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, value);
//    }
//
//    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//    public String toString() {
//        return value.toString();
//    }
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//
//    public boolean equals(int id) {
//        this.id = id;
//        if (id == nextId) {
//        }
//        return id == nextId;
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}
