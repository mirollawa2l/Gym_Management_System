package Backend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Database implements DataOperations {

    protected String filename;
    protected ArrayList<User> records = new ArrayList<>();

    @Override
    public void readFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, "File not found: " + filename, ex);
            return; // Stop further execution without exiting the program
        }

        String line;
        try {
            while ((line = reader.readLine()) != null) {
                User user = createRecordFrom(line);
                insertRecord(user);
            }
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public abstract User createRecordFrom(String line);

    @Override
    public abstract ArrayList returnAllRecords();

    @Override
    public boolean contains(String key) {
        for (User user : records) {
            if (user.Id.equals(key)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public abstract User getRecord(String key);

    @Override
    public void insertRecord(User record) {
        if (!contains(record.Id)) {
            records.add(record);
        } else {
            System.out.println("Account Already exists");
        }
    }

    @Override
    public abstract void deleteRecord(String Key);

    @Override
    public void saveToFile() {

        try (FileWriter writer = new FileWriter(filename, false)) {
            for (User record : records) {
                String line = record.lineRepresesntation();
                writer.write(line + "\n");
            }
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
