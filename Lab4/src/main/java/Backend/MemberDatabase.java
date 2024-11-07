/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mirol
 */
public class MemberDatabase extends Database {

    ArrayList<Member> records = (ArrayList<Member>) (ArrayList<?>) super.records;

    MemberDatabase() {
        this.filename = "Members.txt";
        readFromFile();

    }

    @Override
    public Member createRecordFrom(String line) {
        String[] data = line.split(",");
        String id = data[0];
        String name = data[1];
        String membershipType = data[2];
        String email = data[3];
        String phoneNumber = data[4];
        return new Member(id, name, membershipType, email, phoneNumber);

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
        Member toRemove = null;
        boolean found = false;
        for (Member member : records) {
            if (member.Id.equals(Key)) {
                toRemove = member;
                found = true;
            }
        }
        records.remove(toRemove);
        if (!found) {
            System.out.println("Account doesn't exist");
        }
    }

}
