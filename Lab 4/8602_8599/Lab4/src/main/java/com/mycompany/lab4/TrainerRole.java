
package com.mycompany.lab4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class TrainerRole {
    private MemberDatabase memberDatabase;
    private ClassDatabase ClassDatabase;
    private MemberClassRegistrationDatabase RegistrationDatabase ;
    
    TrainerRole() {
        this.memberDatabase = new MemberDatabase();
        this.ClassDatabase=new ClassDatabase();
        this.RegistrationDatabase=new MemberClassRegistrationDatabase(); 
    }
    
    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status){
        Member member=new Member(memberID,name,membershipType,email,phoneNumber,status);
         if(!memberDatabase.contains(memberID)){
            memberDatabase.records.add(member);}
        else System.out.println( "Member already exists");
    }
    
    public ArrayList<Member> getListOfMembers(){
        return memberDatabase.returnAllRecords();
    }
    
     public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants){
        Class Class=new Class (classID,className,trainerID,duration,maxParticipants);
         if(!ClassDatabase.contains(classID))
         {
            ClassDatabase.records.add(Class);
         }
         else 
         {
             System.out.println("Class already exists");
         }
    }
     
    public ArrayList<MemberClassRegistration> getListOfRegistrations(){
        return RegistrationDatabase.returnAllRecords();}
        
    public void logout(){
       memberDatabase.saveToFile();
       ClassDatabase.saveToFile();
       RegistrationDatabase.saveToFile();
    }
    
    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate){
       boolean flag=false;
        if(ClassDatabase.contains(classID)&&memberDatabase.contains(memberID))
        {
            flag= ClassDatabase.getRecord(classID).getAvailableSeats()>0;
        }
       if(flag){
           MemberClassRegistration memberClassRegistration=new MemberClassRegistration(memberID,classID,"active",registrationDate);
           RegistrationDatabase.records.add(memberClassRegistration);
           ClassDatabase.getRecord(classID).setAvailableSeats(ClassDatabase.getRecord(classID).getAvailableSeats()-1);
       return true;
       }
       return false;
           
    }
           
    public ArrayList<Class> getListOfClasses(){
        return ClassDatabase.returnAllRecords();}
    
    public boolean cancelRegistration(String memberID,String classID){
        if(ClassDatabase.contains(classID)){
         if(RegistrationDatabase.contains(memberID)){
             long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), RegistrationDatabase.getRecord(memberID).getRegistrationDate());
              if (daysBetween <= 3){
                 RegistrationDatabase.getRecord(memberID).setStatus("canceled");
                 ClassDatabase.getRecord(classID).setAvailableSeats(ClassDatabase.getRecord(classID).getAvailableSeats()-1);
                 return true;
              }
         }   
        
         }
         return false;
             
            
             
    }
    
        
    }

