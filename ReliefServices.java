package edu.ucalgary.oop;
import md.java;


public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) {
        // Validate the date format
        if (!dateOfInquiry.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid date format");
        }
        this.dateOfInquiry = dateOfInquiry;
    }
    
    public String getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public String getLogDetails() {
        return String.format("Inquirer: %s, Missing Person: %s, Date of Inquiry: %s, Info Provided: %s, Last Known Location: %s",
                inquirer.getFirstName() + " " + inquirer.getLastName(),
                missingPerson.getFirstName() + " " + missingPerson.getLastName(),
                dateOfInquiry, infoProvided, lastKnownLocation.getName() + " - " + lastKnownLocation.getAddress());
    }
}
