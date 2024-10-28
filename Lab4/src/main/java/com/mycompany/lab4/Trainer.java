
package com.mycompany.lab4;

public class Trainer extends User {
    private String speciality;
    private PersonalInfo p;
   

    public Trainer(String speciality, String Id, String name, String email, String phoneNumber) {
        super(Id);
        this.speciality = speciality;
        this.p=new PersonalInfo(name,email,phoneNumber);
    }
    
    @Override
    public String lineRepresesntation() {
 
        return   Id + "," + p.name + "," + p.email + "," + speciality+","+ p.phoneNumber;
    }
}
