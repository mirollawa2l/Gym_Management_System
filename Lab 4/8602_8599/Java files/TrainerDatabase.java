/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.ArrayList;

/**
 *
 * @author mirol
 */
public class TrainerDatabase extends Database {

    ArrayList<Trainer> records = (ArrayList<Trainer>) (ArrayList<?>) super.records;

    
    @Override
    public User createRecordFrom(String line) {
        String [] data=line.split(",");
        String trainerId=data[0];
        String name=data[1];
        String email=data[2];
        String speciality=data[3];
        String phoneNumber=data[4];
        return new Trainer(trainerId,name,email,speciality,phoneNumber);
    }

    @Override
    public ArrayList returnAllRecords() {
        return records;
    }

    @Override
    public User getRecord(String key) {
         for(Trainer t: records)
        {
            if (t.Id.equals(key)) {
                return t;
            }
        }
        return null;
                }

    @Override
    public void deleteRecord(String Key) {
 boolean found=false;
        Trainer toRemove = null;
      for(Trainer t: records)
        {
            if (t.Id.equals(Key)) {
                toRemove=t;
                found=true;
                
            }
        }
         records.remove(toRemove);
        if(!found)
            System.out.println("Account doesn't exist");
    }
    
}
