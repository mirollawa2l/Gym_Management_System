/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mirol
 */
public class MemberClassRegisterationDatabase extends Database{

        ArrayList<MemberClassRegisteration> records = (ArrayList<MemberClassRegisteration>) (ArrayList<?>) super.records;

    @Override
    public MemberClassRegisteration createRecordFrom(String line) {
           String[] data=line.split(",");
           String memberId=data[0];
           String classId=data[1];
           String status=data[2];
          LocalDate registerationDate=LocalDate.parse(data[3]);
           return new MemberClassRegisteration(memberId,classId,status,registerationDate);
    }

    @Override
    public ArrayList<MemberClassRegisteration> returnAllRecords() {
            return records;
    }

    @Override
    public User getRecord(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteRecord(String Key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
