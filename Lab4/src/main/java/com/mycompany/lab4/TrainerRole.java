
package com.mycompany.lab4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class TrainerRole {
    private MemberDatabase memberDatabase;
    private ClassDatabase ClassDatabase;
    private MemberClassRegistrationDatabase RegistrationDatabase ;
    
    
    
    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status){
        Member member=new Member(memberID,name,membershipType,email,phoneNumber,status);
         if(!memberDatabase.contains(memberID)){
            memberDatabase.records.add(member);}
        else System.out.println( "Member already exists");
    }
    
    public ArrayList<Member> getListOfMembers(){
        return memberDatabase.returnAllRecords();}
    
     public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants){
        Class Class=new Class (classID,className,trainerID,duration,maxParticipants);
         if(!ClassDatabase.contains(classID)){
            ClassDatabase.records.add(Class);}
         else System.out.println( "class already exists");
    }
     
    public ArrayList<MemberClassRegistration> getListOfRegistrations(){
        return RegistrationDatabase.returnAllRecords();}
        
    public void logout(){
       memberDatabase.saveToFile();
       ClassDatabase.saveToFile();
       RegistrationDatabase.saveToFile();
    }
    
    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate){
        boolean flag= ClassDatabase.getRecord(classID).getAvailableSeats()>0;
       if(flag){
           MemberClassRegistration memberClassRegistration=new MemberClassRegistration( memberID,classID,"active",registrationDate);
           ClassDatabase.getRecord(classID).setAvailableSeats(ClassDatabase.getRecord(classID).getAvailableSeats()-1);
       return true;
       }
       return false;
           
    }
           
    public ArrayList<Class> getListOfClasses(){
        return ClassDatabase.returnAllRecords();}
    
    public boolean cancelRegistrations(String memberID,String classID){
         if(!RegistrationDatabase.contains(memberID)){
             long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), RegistrationDatabase.getRecord(memberID).getRegistrationDate());
              if (daysBetween <= 3){
                 RegistrationDatabase.getRecord(memberID).setStatus("canceled");
                 ClassDatabase.getRecord(classID).setAvailableSeats(ClassDatabase.getRecord(classID).getAvailableSeats()-1);
                 return true;}
             else  return false;     
        
         }
         return false;
             
            
             
    }
    
        
    }

