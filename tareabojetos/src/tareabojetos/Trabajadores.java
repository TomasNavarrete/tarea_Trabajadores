/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareabojetos;

/**
 *
 * @author Tomas
 */
public class Trabajadores {

    /**
     * @return the namep
     */
    public String getNamep() {
        return namep;
    }

    /**
     * @param namep the namep to set
     */
    public void setNamep(String namep) {
        this.namep = namep;
    }

    /**
     * @return the yearp
     */
    public int getYearp() {
        return yearp;
    }

    /**
     * @param yearp the yearp to set
     */
    public void setYearp(int yearp) {
        this.yearp = yearp;
    }

    /**
     * @return the addressP
     */
    public String getAddressP() {
        return addressP;
    }

    /**
     * @param addressP the addressP to set
     */
    public void setAddressP(String addressP) {
        this.addressP = addressP;
    }

    /**
     * @return the phoneNumerP
     */
    public double getPhoneNumerP() {
        return phoneNumerP;
    }

    /**
     * @param phoneNumerP the phoneNumerP to set
     */
    public void setPhoneNumerP(double phoneNumerP) {
        this.phoneNumerP = phoneNumerP;
    }
    
     private String namep;
     private int yearp;
     private String addressP;
     private double phoneNumerP;
    //method to save the names
    public String name(String nameP){
        
        String namePer;
        
        namePer=nameP;
        
        return namePer;
    }
    //method to save the years
    public int year(int yearP){
        
        int yearPer;
        yearPer=yearP;
        
    
        return yearPer;
    }
    //method to save the address
    public String address(String addressP){
        String addressPer;
        addressPer=addressP;
        return addressPer;
    
    
    } 
    //method to save the  phone numers
    public double phoneNumer(double phoneNumerP){
          double phoneNumerPer;
          phoneNumerPer= phoneNumerP;
          return phoneNumerPer;
    }
   
}
