
package com.mycompany.lab4;


public class Member extends User {

   private String membershipType;
   private  String status;
   private PersonalInfo p;

    public Member(String membershipType, String Status, String Id, String name, String email, String phoneNumber) {
        super(Id);
        
        this.membershipType = membershipType;
        this.status = Status;
         p=new PersonalInfo(name,email,phoneNumber);
    }
   
    @Override
    public String lineRepresesntation() {
         return   Id + "," + p.name + "," + p.email + ","+ membershipType +","+ status +","+ p.phoneNumber;
    }

}
