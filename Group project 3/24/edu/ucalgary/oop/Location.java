package edu.ucalgary.oop;

import java.util.Arrays;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    public Location(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public DisasterVictim[] getOccupants(){
        return this.occupants;
    }
    public void setOccupants(DisasterVictim[] occupants){
        this.occupants = occupants;
    }
    public Supply[] getSupplies(){
        return this.supplies;
    }
    public void setSupplies(Supply[] supplies){
        this.supplies = supplies;
    }
    public void addOccupant(DisasterVictim occupant){
        DisasterVictim[] newOccupants = Arrays.copyOf(this.occupants, this.occupants.length + 1); //copy old values into new array
        newOccupants[newOccupants.length -1] = occupant; //make last object of newArray the updated value
        this.occupants = newOccupants; // overwrite the data member this.occupants
    }
    public void removeOccupant(DisasterVictim occupant){
        DisasterVictim[] newOccupants = new DisasterVictim[this.occupants.length - 1]; //create new array which is 1 value shorter than the original array
        for(int i = 0, k = 0; i < this.occupants.length; i++){
            if(this.occupants[i] != occupant){ //this section will only skip when we parse over the wanted value
                newOccupants[k] = this.occupants[i]; //update the new list with the old value
                k++;
            }
        }
        this.occupants = newOccupants; //overwrite this.occupants
    }
    public void addSupply(Supply supply){
        Supply[] newSupplies = Arrays.copyOf(this.supplies, this.supplies.length + 1); //copy old values into new larger array
        newSupplies[newSupplies.length-1] = supply; //make last object of newSupplies the new value
        this.supplies = newSupplies; //overwrite original supply list
    }
    public void removeSupply(Supply supply){
        Supply[] newSupplies = new Supply[this.supplies.length - 1]; //create new array which is 1 value shorter than the original array
        for(int i = 0, k = 0; i < this.supplies.length; i++){
            if(this.supplies[i] != supply){ //this section will only skip when we parse over the wanted value
                newSupplies[k] = this.supplies[i]; //update the new list with the old value
                k++;
            }
        }
        this.supplies = newSupplies; //overwrite this.supplies
    }


}

