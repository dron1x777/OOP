import java.time.LocalDate;

public class Customer {
    private long id;
    private String firstName;
    private String email;
    private int dateOfBirth;
    private String phoneNumber;

    void setId(long id) {
        this.id = id;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    void setEmail(String email) {
        this.email = email;
    }
    void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    long getId() {
        return id;
    }
    String getFirstName() {
        return firstName;
    }
    String getEmail() {
        return email;
    }
    int getDateOfBirth() {
        return dateOfBirth;
    }
    String getPhoneNumber() {
        return phoneNumber;
    }

}
