package bai1;

public class Person {
    private String name;
    private String dob;
    private String pob;
    private char gender;
    private String gmail;
    private String phone;

    public Person() {
    }

    public Person(String name, String dob, String pob, char gender, String gmail, String phone) {
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.gmail = gmail;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", gmail=" + gmail
                + ", phone=" + phone + "]";
    }

}
