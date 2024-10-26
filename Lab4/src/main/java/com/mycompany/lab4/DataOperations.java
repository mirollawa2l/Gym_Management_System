/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author mirol
 * @param <T>
 */
public interface DataOperations {

    void readFromFile();  //fix in the uml

    User createRecordFrom(String line);

    User returnAllRecords();

    boolean contains(String key); //fix in the uml

    User getRecord(String line);

    void insertRecord(User record);

    void deleteRecord(String key);

    void saveToFile();

}
