
package com.mycompany.lab4;

public class Trainer extends user {
    private String speciality;
    private Personalinfo p;
   

    public Trainer(String speciality, String Id, String name, String email, String phoneNumber) {
        super(Id);
        this.speciality = speciality;
        this.p=new Personalinfo(name,email,phoneNumber);
    }
    
    @Override
    public String lineRepresesntation() {
 
        return   Id + "," + p.name + "," + p.email + "," + speciality+","+ p.phoneNumber;
    }
}
