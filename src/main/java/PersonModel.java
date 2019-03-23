
public class PersonModel {

    private String personID;
    private String first_name;
    private String last_name;
    private String location;

    public PersonModel(SourceType sourceType) {
        if(sourceType !=  null){
            this.personID =sourceType.getPersonID();
            this.first_name = sourceType.getFirst_name();
            this.last_name = sourceType.getLast_name();
            this.location = sourceType.getLocation();
        }
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
