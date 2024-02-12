

package edu.ucalgary.oop;

import java.util.Arrays;

class DisasterVictim
{
    /*Attributes*/
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private static int counter;

    /*Methods*/
    public DisasterVictim(String firstName, String ENTRY_DATE)
    {
        this.setFirstName(firstName);
        this.ENTRY_DATE = ENTRY_DATE;
        counter++;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getlastName()
    {
        return this.lastName;
    }
    public String getDateOfBirth()
    {
        return this.dateOfBirth;
    }
    public String getComments()
    {
        return this.comments;
    }
    public MedicalRecord[] getMedicalRecords()
    {
        return this.medicalRecords;
    }
    public String getEntryDate()
    {
        return this.ENTRY_DATE;
    }
    public int getAssignedSocialID()
    {
        return this.ASSIGNED_SOCIAL_ID;
    }
    public Supply[] getPersonalBelongings()
    {
        return this.personalBelongings;
    }
    public FamilyRelation[] getFamilyConnections()
    {
        return this.familyConnections;
    }
    public String getGender()
    {
        return this.gender;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    public void setComments(String comments)
    {
        this.comments = comments;
    }
    public void setMedicalRecords(MedicalRecord[] medicalRecords)
    {
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelonging(Supply[] supplies)
    {
        this.personalBelongings = supplies;
    }
    public void setFamilyConnections(FamilyRelation[] relation)
    {
        this.familyConnections = relation;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void addPersonalBelonging(Supply supply)
    {
        int oldPersonalBelongingsLength = this.personalBelongings.length;
        this.personalBelongings = Arrays.copyOf(this.personalBelongings, oldPersonalBelongingsLength + 1);
        this.personalBelongings[oldPersonalBelongingsLength] = supply; 
    }
    public void removePersonalBelonging(Supply supply)
    {
        //To be fixed!
    }
    public void addFamilyConnection(FamilyRelation familyConnection)
    {
        int oldFamilyConnectionsLength = this.familyConnections.length;
        this.familyConnections = Arrays.copyOf(this.familyConnections, oldFamilyConnectionsLength + 1);
        this.familyConnections[oldFamilyConnectionsLength] = familyConnection; 
    }
    public void removeFamilyConnection(FamilyRelation familyConnection)
    {
        //To be fixed!
    }
    public void addMedicalRecord(MedicalRecord medicalRecord)
    {
        int oldMedicalRecordsLength = this.medicalRecords.length;
        this.medicalRecords = Arrays.copyOf(this.medicalRecords, oldMedicalRecordsLength + 1);
        this.medicalRecords[oldMedicalRecordsLength] = medicalRecord; 
    }
}