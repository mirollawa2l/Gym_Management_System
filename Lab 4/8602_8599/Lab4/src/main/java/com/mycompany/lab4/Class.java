

package com.mycompany.lab4;


public class Class extends User  {
   private String ClassName;
   private String trainerId;
   private int duration;
   private int availableSeats;

    public Class(String Id,String name , String trainerId, int duration, int availableSeats) {
        super(Id);
        this.ClassName=name;
        this.trainerId=trainerId;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
     @Override
   public String lineRepresesntation() {
         return   Id + "," + ClassName + "," + trainerId + ","+ duration +","+ availableSeats ;
    }
    
    
    
}
