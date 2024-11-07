package Backend;

public abstract class User {

    protected String Id;

    public User(String Id) {
        this.Id = Id;

    }

    public String getSearchKey() {
        return this.Id;
    }

    public abstract String lineRepresesntation();

}
