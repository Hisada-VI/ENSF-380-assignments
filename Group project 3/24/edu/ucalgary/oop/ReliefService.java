package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry,
                         String infoProvided, Location lastKnownLocation){
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }
    public Inquirer getInquirer(){
        return this.inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }
    public DisasterVictim getMissingPerson(){
        return this.missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return this.dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) throws IllegalArgumentException
    {
        Pattern datePattern = Pattern.compile("^\\d{4}[-]{1}\\d{2}[-]{1}\\d{2}$");
        Matcher dateMatcher = datePattern.matcher(dateOfInquiry);
        if (dateMatcher.find()){
            this.dateOfInquiry = dateOfInquiry;
        }
        else{
            throw new IllegalArgumentException("Date must be of Format YYYY-MM-DD");
        }
    }

    public String getInfoProvided() {
        return this.infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }
    public String getLogDetails(){
        String inquirerName = this.inquirer.getFirstName() +" "+this.inquirer.getLastName(); //create vars to limit the complexity of return statement
        String missingName = this.missingPerson.getFirstName() + " " + this.missingPerson.getlastName();
        return "Inquirer: " + inquirerName + ", Missing Person: " + missingName + ", Date Of Inquiry: " + this.getDateOfInquiry()
                + ", Info Provided: " + this.getInfoProvided() + ", Last Known Location: " + this.lastKnownLocation.getName();
    }
}
