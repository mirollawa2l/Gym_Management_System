package Backend;

public class Trainer extends User {

    private String speciality;
    private PersonalInfo p;

    public Trainer(String Id, String name, String email, String speciality, String phoneNumber) {
        super(Id);
        this.speciality = speciality;
        this.p = new PersonalInfo(name, email, phoneNumber);
    }

    @Override
    public String lineRepresesntation() {

        return Id + "," + p.name + "," + p.email + "," + speciality + "," + p.phoneNumber;
    }
}
