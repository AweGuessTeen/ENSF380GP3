package edu.ucalgary.oop;

public Class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    // Contructor:
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    // Getters:
    public Location getLocation() {
        return location;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    // Setters:
    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        this.dateOfTreatment = dateOfTreatment;
    }
}