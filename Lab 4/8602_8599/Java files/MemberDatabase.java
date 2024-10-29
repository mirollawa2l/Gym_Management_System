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
public class MemberDatabase extends Database {

    ArrayList<Member> records = (ArrayList<Member>) (ArrayList<?>) super.records;

    @Override
    public Member createRecordFrom(String line) {
        String[] data = line.split(",");
        String id = data[0];
        String name = data[1];
        String membershipType = data[2];
        String email = data[3];
        String phoneNumber = data[4];
        String status = data[5];
        return new Member(id, name, membershipType, email, phoneNumber, status);

    }

    @Override
    public ArrayList<Member> returnAllRecords() {
        return records;
    }

    @Override
    public User getRecord(String key) {
        for (Member member : records) {
            if (member.Id.equals(key)) {
                return member;
            }
        }
        return null;
    }

    @Override
    public void deleteRecord(String Key) {
        Member toRemove=null;
        boolean found=false;
        for (Member member : records) {
            if (member.Id.equals(Key)) {
               toRemove=member;
                found = true;
            }
        }
        records.remove(toRemove);
        if(!found)
            System.out.println("Account doesn't exist");
    }

}
