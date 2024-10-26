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


public abstract class DataOperationsImpl implements DataOperations {

    protected String filename;
    protected List<Object> records = new ArrayList<>();  
    
    
    @Override
    public void readFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataOperationsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

      String line;
        try {
            while ((line = reader.readLine()) != null) {
                Object obj=createRecordFrom(line);
               insertRecord(obj);
            }
        } catch (IOException ex) {
            Logger.getLogger(DataOperationsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(DataOperationsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         

    @Override
    public abstract Object createRecordFrom(String line);

    @Override
    public  abstract Object returnAllRecords();
    
     @Override
     public boolean contains(String key)
     {
         System.out.println("");
         return (false);
     }

    @Override
    public Object getRecord(String line) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertRecord(Object record) {
          if(!contains(record.))
       {
           records.add(record);
       } else {
        }
    }

    @Override
    public void deleteRecord(String Key) {
     
    }

    @Override
    public void saveToFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
