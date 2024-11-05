
package Backend;


public class Member extends User {

   private String membershipType;
   private PersonalInfo p;

    public Member(String membershipType, String Status, String Id, String name, String email, String phoneNumber) {
        super(Id);
        this.membershipType = membershipType;
         p=new PersonalInfo(name,email,phoneNumber);
    }
   
    @Override
    public String lineRepresesntation() {
         return   Id + "," + p.name + "," + p.email + ","+ membershipType +","+ p.phoneNumber;
    }

}
