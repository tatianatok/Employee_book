public class Personal {
    private String firstName;
    private String middleName;
    private String lastName;

    public Personal(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public String toString(){
        return getFirstName() + " " + getMiddleName() + " " + getLastName();
    }
}
