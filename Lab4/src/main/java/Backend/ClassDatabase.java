package Backend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassDatabase extends Database {

    ArrayList<Class> records = (ArrayList<Class>) (ArrayList<?>) super.records;

    ClassDatabase() {
        this.filename = "Classes.txt";
        readFromFile();

    }

    @Override
    public Class createRecordFrom(String line) {
        String[] data = line.split(",");
        String classId = data[0];
        String className = data[1];
        String trainerId = data[2];
        int duration = Integer.parseInt(data[3]);
        int availableSeats = Integer.parseInt(data[4]);
        return new Class(classId, className, trainerId, duration, availableSeats);

    }

    @Override
    public ArrayList<Class> returnAllRecords() {
        return records;
    }

    @Override
    public Class getRecord(String key) {
        for (Class c : records) {
            if (c.Id.equals(key)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void deleteRecord(String Key) {
        boolean found = false;
        Class toRemove = null;
        for (Class c : records) {
            if (c.Id.equals(Key)) {
                toRemove = c;
                found = true;

            }
        }
        records.remove(toRemove);
        if (!found) {
            System.out.println("Account doesn't exist");
        }
    }

}
