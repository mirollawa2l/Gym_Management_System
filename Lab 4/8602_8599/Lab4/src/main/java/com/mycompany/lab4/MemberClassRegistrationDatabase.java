/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

/**
 *
 * @author mirol
 */
public class MemberClassRegistrationDatabase extends Database{

        ArrayList<MemberClassRegistration> records = (ArrayList<MemberClassRegistration>) (ArrayList<?>) super.records;

        MemberClassRegistrationDatabase()
        {
            this.filename="MemberClassRegistration.txt";
        }
        
    @Override
    public MemberClassRegistration createRecordFrom(String line) {
           String[] data=line.split(",");
           String memberId=data[0];
           String classId=data[1];
           String status=data[2];
           LocalDate registrationDate = null;
           
           try {
          LocalDate registerationDate=LocalDate.parse(data[3]);}
            catch (DateTimeParseException e) {
                System.out.println("Invalid date format for registrationDate: " + data[3]);}
          
           return new MemberClassRegistration(memberId,classId,status,registrationDate);
    }

    @Override
    public ArrayList<MemberClassRegistration> returnAllRecords() {
            return records;
    }

    @Override
    public MemberClassRegistration getRecord(String key) {

        for(MemberClassRegistration m: records)
        {
            if (m.Id.equals(key)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void deleteRecord(String Key) {
        boolean found=false;
        MemberClassRegistration toRemove = null;
  for(MemberClassRegistration m: records)
        {
            if (m.Id.equals(Key)) {
                toRemove=m;
                found=true;
                
            }
        }
         records.remove(toRemove);
        if(!found)
            System.out.println("Account doesn't exist");    }
    
    
}
