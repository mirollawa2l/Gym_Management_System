
package com.mycompany.lab4;

import java.util.ArrayList;

public class ClassDatabase extends Database{
        ArrayList<Class> records = (ArrayList<Class>) (ArrayList<?>) super.records;

    
    @Override
    public User createRecordFrom(String line) {
       String[] data = line.split(",");
        String classId = data[0];
        String className = data[1];
        String trainerId = data[2];
        int duration = Integer.parseInt(data[3]);
        int availableSeats= Integer.parseInt(data[4]);
        return new Class(classId, className, trainerId, duration, availableSeats);

    }

    @Override
    public ArrayList<Class> returnAllRecords() {
      return records;
    }

    @Override
    public Class getRecord(String key) {
        for(Class c: records)
        {
            if (c.Id.equals(key)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void deleteRecord(String Key) {
        boolean found=false;
        Class toRemove = null;
  for(Class c: records)
        {
            if (c.Id.equals(Key)) {
                toRemove=c;
                found=true;
                
            }
        }
         records.remove(toRemove);
        if(!found)
            System.out.println("Account doesn't exist");
    }
    
}
