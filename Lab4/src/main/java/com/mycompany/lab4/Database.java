/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Database implements DataOperations {

    protected String filename;
    protected ArrayList<User> records = new ArrayList<>();  
    
    
    @Override
    public void readFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

      String line;
        try {
            while ((line = reader.readLine()) != null) {
                User user=createRecordFrom(line);
               insertRecord(user);
            }
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         

    @Override
    public abstract User createRecordFrom(String line);

    @Override
    public  abstract ArrayList returnAllRecords();
    
     @Override
     public boolean contains(String key)
     {
        for(User user:records)
        {
             if(user.Id.equals(key))
                return true;
        }
            return false;
        
     }

    @Override
    public  abstract User getRecord(String key) ;

    @Override
    public void insertRecord(User record) {
          if(!contains(record.Id))
       {
           records.add(record);
       } else {
              System.out.println("Account Already exists");
        }
    }

    @Override
    public abstract void deleteRecord(String Key);

    @Override
    public void saveToFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
