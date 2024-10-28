
package com.mycompany.lab4;

public class TrainerRole {
    private MemberDatabase memberDatabase;
    private ClassDatabase ClassDatabase;
    private RegisterationDatabase RegisterationDatabase ;
    
    
    
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
     
     public ArrayList<Member> getListOfMembers(){
        return memberDatabase.returnAllRecords();}
        
    public void logout(){
    memberDatabase.saveToFile();
    ClassDatabase.saveToFile();
    RegistrationDatabase.saveToFile();
    }
    
    public void registerMemberForClass(String memberID, String classID, LocalDate registrationDate){
    if(RegisterationDatabase.getRecord().availableSeats){
        
    
    }
        
    }

}