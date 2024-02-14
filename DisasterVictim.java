// DisasterVictim Class 

public class DisasterVictim{
	
	private String firstName;
	private	String lastName;
	private String dateOfBirth;
	private	String comments;
	private static int ASSIGNED_SOCIAL_ID;
	private	MedicalRecord[] medicalRecords;
	private FamilyRelation[] familyConnections;
	private String ENTRY_DATE;
	private Supply[] personalBelongings;
	private String gender;
	private int counter;
	
	//Constructor
	public DisasterVictim(String firstName, String ENTRY_DATE){
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
	}
	
	//getters
	public String getfirstName(){
		return firstName;
	}
	
	public String getlastName(){
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
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setComments(String comments){
		this.comments = comments;
	}
	
	public void setMedicalRecords(setMedicalRecord[] medicalRecords){
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
		if (familyConnections = null){
			familyConnections = new FamilyRelation[1];
			familyConnections[0] = familyrelation;
		}
		else{
			FamilyRelation[] newFamilyConnections = Arrays.copyOf(familyConnections, familyConnections.length + 1);
            newFamilyConnections[familyConnections.length] = familyRelation;
            familyConnections = newFamilyConnections;
		}
	}
	
	public void removeFamilyConnection(FamilyRelation familyrelation){
		if (familyConnections != null && familyConnections.length > 0) {
            List<FamilyRelation> relationList = new ArrayList<>(Arrays.asList(familyConnections));
            relationList.remove(familyRelation);
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
	
