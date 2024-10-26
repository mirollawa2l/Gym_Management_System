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
public interface DataOperations<T> {

    void readFromFile();  //fix in the uml

    T createRecordFrom(String line);

    T returnAllRecords();

    T contains(String key);

    T getRecord(String line);

    void insertRecord(T record);

    void deleteRecord();

    void saveToFile();

}
