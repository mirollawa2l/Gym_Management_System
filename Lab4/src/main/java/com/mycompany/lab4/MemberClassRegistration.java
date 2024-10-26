
package com.mycompany.lab4;

import java.time.LocalDate;

public class MemberClassRegistration extends User {
   
   private String ClassID ;
   private String status;
   private LocalDate registrationDate;

    public MemberClassRegistration(String memberID, String ClassID, String status, LocalDate registrationDate, String Id, String name) {
        super(Id);
        this.ClassID = ClassID;
        this.status = status;
        this.registrationDate = registrationDate;
    }

   
    public String getMemberID() {
        return Id;
    }

    public String getClassID() {
        return ClassID;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
   
    @Override
    public String lineRepresesntation() {
 
        return  Id + "," + ClassID + "," + registrationDate + "," + status ;
    }
   @Override
   public String getSearchKey(){
       return Id+ClassID;
   
   }
    
}
