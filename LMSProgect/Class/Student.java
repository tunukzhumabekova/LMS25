package LMSProgect.Class;

import LMS21.Enum.Gender;

public class Student {
    private int id;
    private String FirstName;
    private String LastName;
    private String email;
    private Object password;
    private Gender gender;
    private static int idd=1;

    public Student( String firstName, String lastName, String email, Object password, Gender gender) {
        this.id = idd++;
        FirstName = firstName;
        LastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Student.idd = idd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", gender=" + gender +
                '}';
    }
}
