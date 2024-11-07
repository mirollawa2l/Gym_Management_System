package Backend;

import java.time.LocalDate;

public class MemberClassRegistration extends User {

    private String ClassID;
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberID, String ClassID, LocalDate registrationDate) {
        super(memberID);
        this.ClassID = ClassID;
        this.registrationDate = registrationDate;
    }

    public String getMemberID() {
        return Id;
    }

    public String getClassID() {
        return ClassID;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

   
    @Override
    public String lineRepresesntation() {

        return Id + "," + ClassID + "," + registrationDate;
    }

    @Override
    public String getSearchKey() {
        return Id + ClassID;

    }

}
