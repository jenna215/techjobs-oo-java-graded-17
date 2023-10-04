package org.launchcode.techjobs.oo;
import org.junit.Test;

import static org.junit.Assert.*;
//import static org.launchcode.techjobs.oo.Job.nextId;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 =  new Job("Product tester",
                    new Employer("ACME"),
                    new Location("Desert"),
                    new PositionType("Quality control"),
                    new CoreCompetency("Persistence"));

        assertTrue(job1.getName() instanceof String);
        assertEquals("Product tester", job1.getName());

        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals("ACME", job1.getEmployer().getValue());

        assertTrue(job1.getLocation() instanceof Location);
        assertEquals("Desert", job1.getLocation().getValue());

        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job1.getPositionType().getValue());

        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        Job job1 =  new Job("Product tester",
                    new Employer("ACME"),
                    new Location("Desert"),
                    new PositionType("Quality control"),
                    new CoreCompetency("Persistence"));

        Job job2 =  new Job("Product tester",
                    new Employer("ACME"),
                    new Location("Desert"),
                    new PositionType("Quality control"),
                    new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));

    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String lineSeparator = System.lineSeparator();

        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String string = job1.toString();

        assertEquals(lineSeparator, string.substring(0, lineSeparator.length()));
        assertEquals(lineSeparator, string.substring(string.length() - lineSeparator.length()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){

        Job job1 =
                    new Job("Product tester",
                    new Employer("ACME"),
                    new Location("Desert"),
                    new PositionType("Quality control"),
                    new CoreCompetency("Persistence"));

        String lineSeparator = System.lineSeparator();

        String expected = lineSeparator +
                            "ID: " + job1.getId() + lineSeparator +
                            "Name: Product tester" + lineSeparator +
                            "Employer: ACME" + lineSeparator +
                            "Location: Desert" + lineSeparator +
                            "Position Type: Quality control" + lineSeparator +
                            "Core Competency: Persistence" + lineSeparator;

        assertEquals(expected, job1.toString());

//        assertTrue(job1.equals(job1.getId()));
//        assertTrue(job1.getName().contains("Name: "));
//        assertTrue(job1.getEmployer().getValue().contains("Employer: "));
//        assertTrue(job1.getLocation().getValue().contains("Location: "));
//        assertTrue(job1.getPositionType().getValue().contains("Position Type: "));
//        assertTrue(job1.getCoreCompetency().getValue().contains("Core Competency: "));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String lineSeparator = System.lineSeparator();
        Job job1 =  new Job("",
                new Employer("ACME"),
                new Location(null),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        String expected = lineSeparator + "ID: " + job1.getId() + lineSeparator +
                "Name: Data not available" + lineSeparator +
                "Employer: " + "ACME" + lineSeparator +
                "Location: Data not available" + lineSeparator +
                "Position Type: " + "Quality Control" + lineSeparator +
                "Core Competency: " + "Persistence" + lineSeparator;
        String actual = job1.toString();

        assertEquals(expected, actual);
    }

}
