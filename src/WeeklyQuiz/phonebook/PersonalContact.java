package WeeklyQuiz.phonebook;

public class PersonalContact extends Contact{

    private String relationship;

    public PersonalContact() {

    }

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
