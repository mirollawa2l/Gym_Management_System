
package com.mycompany.lab4;

import java.time.LocalDate;

public class MemberClassRegisteration extends User {
   
   private String ClassID ;
   private String status;
   private LocalDate registerationDate;


    public MemberClassRegisteration(String memberID, String ClassID, String status, LocalDate registrationDate) {
        super(memberID);
        this.ClassID = ClassID;
        this.status = status;
        this.registerationDate = registerationDate;
    }

   
    public String getMemberID() {
        return Id;
    }

    public String getClassID() {
        return ClassID;
    }

    public LocalDate getRegisterationDate() {
        return registerationDate;
    }
   
    @Override
    public String lineRepresesntation() {
 
        return  Id + "," + ClassID + "," + registerationDate + "," + status ;
    }
   @Override
   public String getSearchKey(){
       return Id+ClassID;
   
   }
    
}
