/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab4;

import java.util.ArrayList;


public interface DataOperations {

    void readFromFile();  //fix in the uml

    User createRecordFrom(String line);

    ArrayList returnAllRecords();

    boolean contains(String key); //fix in the uml

    User getRecord(String key);

    void insertRecord(User record);

    void deleteRecord(String key);

    void saveToFile();

}
