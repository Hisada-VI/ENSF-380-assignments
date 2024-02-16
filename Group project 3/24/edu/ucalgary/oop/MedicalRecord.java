

package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicalRecord
{
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;


    public MedicalRecord (Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException
    {
        Pattern datePattern = Pattern.compile("^\\d{4}[-]{1}\\d{2}[-]{1}\\d{2}$");
        Matcher dateMatcher = datePattern.matcher(dateOfTreatment);
        if (dateMatcher.find())
        {
            this.dateOfTreatment = dateOfTreatment;
        }
        else
        {
            throw new IllegalArgumentException("Date must be of Format YYYY-MM-DD");
        }
        this.location=location;
        this.treatmentDetails=treatmentDetails;
    }
    public Location getLocation(){
        return location;
    }

    public void setLocation(Location location){
        this.location=location;
    }

    public String getTreatmentDetails(){
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails){
        this.treatmentDetails=treatmentDetails;
    }

    public String getDateOfTreatment(){
        return dateOfTreatment;
    }

    public void setDateOfTreatment(String dateOfTreatment) throws IllegalArgumentException
    {
        Pattern datePattern = Pattern.compile("^\\d{4}[-]{1}\\d{2}[-]{1}\\d{2}$");
        Matcher dateMatcher = datePattern.matcher(dateOfTreatment);
        if (dateMatcher.find())
        {
            this.dateOfTreatment = dateOfTreatment;
        }
        else
        {
            throw new IllegalArgumentException("Date must be of Format YYYY-MM-DD");
        }
    }
}