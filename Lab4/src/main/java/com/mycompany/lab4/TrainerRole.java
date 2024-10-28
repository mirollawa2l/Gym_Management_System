
package com.mycompany.lab4;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrainerRole {
    private MemberDatabase memberDatabase;
    private ClassDatabase ClassDatabase;
    private MemberClassRegisterationDatabase RegisterationDatabase ;
    
    
    
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
      public ArrayList<Class> getListOfClasses(){
        return ClassDatabase.returnAllRecords();}
    
    
    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate){
       if(RegisterationDatabase.getRecord(classID).availableSeats){
           MemberClassRegistration memberClassRegistration=new MemberClassRegistration( memberID,classID,"active",registrationDate);
           RegisterationDatabase.getRecord(classID).availableSeats--;
       return true;}
       return false;
           
    }
           
    public ArrayList<MemberClassRegisteration> getListOfRegistrations(){
        return RegisterationDatabase.returnAllRecords();}
        
    
    public boolean cancelRegistrations(String memberID,String classID){
         if(!memberClassRegistrationDatabase.contains(memberID)){
             if (RegisterationDatabase.getRecord(classID).registerationDate-LocalDate.now()<=3){
                 RegisterationDatabase.getRecord(classID).status="canceled";
                 RegisterationDatabase.getRecord(classID).availableSeats++;
                 return true;}
             else  return false;     
        
         }
         return false;
                          
    }
    
       public void logout(){
       memberDatabase.saveToFile();
       ClassDatabase.saveToFile();
       RegisterationDatabase.saveToFile();
    }    
    }

