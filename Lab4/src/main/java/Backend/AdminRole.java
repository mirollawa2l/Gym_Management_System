
package Backend;
import java.util.ArrayList;

public class AdminRole {
    private TrainerDatabase trainerDatabase;
    
    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber){
        if(!trainerDatabase.contains(trainerId)){
        Trainer trainer=new Trainer(trainerId,name,email,specialty,phoneNumber);
        trainerDatabase.records.add(trainer);}
        else System.out.println( "Trainer already exists");
    }
    public void removeTrainer(String Key){
      trainerDatabase.deleteRecord(Key);
    }
        public ArrayList<Trainer> getListOftrainers(){
        return trainerDatabase.returnAllRecords();}
        
    public void logout(){
    trainerDatabase.saveToFile();}
    
    }

    

