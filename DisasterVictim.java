// DisasterVictim Class

package edu.ucalgary.oop;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class DisasterVictim{
	
	private String firstName;
	private	String lastName;
	private String dateOfBirth;
	private	String comments;
	private final int ASSIGNED_SOCIAL_ID;
	private	MedicalRecord[] medicalRecords;
	private FamilyRelation[] familyConnections;
	private final String ENTRY_DATE;
	private Supply[] personalBelongings;
	private String gender;
	private static int counter;
	
	//Constructor
	public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {

		//DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String regex = "\\d{4}-\\d{2}-\\d{2}";
		if (!ENTRY_DATE.matches(regex)){
			throw new IllegalArgumentException("Date format is in Invalid. Expected: YYYY-MM-DD");
		}
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
		this.ASSIGNED_SOCIAL_ID = counter++;
		
	}

	//getters
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	
	public String getComments(){
		return comments;
	}
	
	public MedicalRecord[] getMedicalRecords(){
		return medicalRecords;
	}
	
	public String getEntryDate(){
		return ENTRY_DATE;
	}
	
	public int getAssignedSocialID(){
		return ASSIGNED_SOCIAL_ID;
		
	}
	
	public Supply[] getPersonalBelongings(){
		return personalBelongings;
	}
	
	public FamilyRelation[] getFamilyConnections(){
		return familyConnections;
	}
	
	public String getGender(){
		return gender;
	}
	
	//setters
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setDateOfBirth(String dateOfBirth){
		String regex = "\\d{4}-\\d{2}-\\d{2}";

		if(!dateOfBirth.matches(regex)){
			throw new IllegalArgumentException("Date format is in Invalid. Expected: YYYY-MM-DD");
		}
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setComments(String comments){
		this.comments = comments;
	}
	
	public void setMedicalRecords(MedicalRecord[] medicalRecords){
		this.medicalRecords = medicalRecords;
	}
	
	public void setPersonalBelongings(Supply[] supplies){
		this.personalBelongings = supplies;
	}
	
	public void setFamilyConnections(FamilyRelation[] relations){
		this.familyConnections = relations;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	//other methods
	public void addPersonalBelonging(Supply supply){
		if (personalBelongings == null){
			personalBelongings = new Supply[1];
			personalBelongings[0] = supply;
		}
		else{
			Supply[] newPersonalBelongings = Arrays.copyOf(personalBelongings, personalBelongings.length + 1);
			newPersonalBelongings[personalBelongings.length] = supply;
			personalBelongings = newPersonalBelongings;
		}
		
	}
	
	public void removePersonalBelonging(Supply supply){
		if(personalBelongings != null && personalBelongings.length > 0){
			List<Supply> supplyList = new ArrayList<>(Arrays.asList(personalBelongings));
			supplyList.remove(supply);
			personalBelongings = supplyList.toArray(new Supply[0]);
	}
}
	
	public void addFamilyConnection(FamilyRelation familyrelation){
		if (familyConnections == null){
			familyConnections = new FamilyRelation[1];
			familyConnections[0] = familyrelation;
		}
		else{
			FamilyRelation[] newFamilyConnections = Arrays.copyOf(familyConnections, familyConnections.length + 1);
            newFamilyConnections[familyConnections.length] = familyrelation;
            familyConnections = newFamilyConnections;
		}
	}
	
	public void removeFamilyConnection(FamilyRelation familyrelation){
		if (familyConnections != null && familyConnections.length > 0) {
            List<FamilyRelation> relationList = new ArrayList<>(Arrays.asList(familyConnections));
            relationList.remove(familyrelation);
            familyConnections = relationList.toArray(new FamilyRelation[0]);
        }
	}
	
	public void addMedicalRecord(MedicalRecord medicalRecord){
		if (medicalRecords == null) {
            medicalRecords = new MedicalRecord[1];
            medicalRecords[0] = medicalRecord;
        } else {
            MedicalRecord[] newMedicalRecords = Arrays.copyOf(medicalRecords, medicalRecords.length + 1);
            newMedicalRecords[medicalRecords.length] = medicalRecord;
            medicalRecords = newMedicalRecords;
        }
	}
}
	
