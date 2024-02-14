package edu.ucalgary.oop;

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
        //todo: add functionality
    }
    public void removeOccupant(DisasterVictim occupant){
        //todo: add functionality
    }
    public void addSupply(Supply supply){
        //todo: add functionality
    }
    public void removeSupply(Supply supply){
        //todo: add functionality
    }


}

