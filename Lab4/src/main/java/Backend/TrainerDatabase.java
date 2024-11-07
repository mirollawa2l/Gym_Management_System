
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
public class TrainerDatabase extends Database {

    ArrayList<Trainer> records = (ArrayList<Trainer>) (ArrayList<?>) super.records;

    TrainerDatabase() {
        this.filename = "Trainers.txt";
        readFromFile();

    }

    @Override
    public Trainer createRecordFrom(String line) {
        String[] data = line.split(",");
        String trainerId = data[0];
        String name = data[1];
        String email = data[2];
        String speciality = data[3];
        String phoneNumber = data[4];
        return new Trainer(trainerId, name, email, speciality, phoneNumber);
    }

    @Override
    public ArrayList<Trainer> returnAllRecords() {
        return records;
    }

    @Override
    public Trainer getRecord(String key) {
        for (Trainer t : records) {
            if (t.Id.equals(key)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public void deleteRecord(String Key) {
        boolean found = false;
        Trainer toRemove = null;
        for (Trainer t : records) {
            if (t.Id.equals(Key)) {
                toRemove = t;
                found = true;

            }
        }
        records.remove(toRemove);
        if (!found) {
            System.out.println("Account doesn't exist");
        }
    }

}
