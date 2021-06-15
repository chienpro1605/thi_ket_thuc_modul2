public class DanhBa {
    private String phoneNumber;
    private String group;
    private String Name;
    private String gender;
    private String address;
    private String bornDay;
    private String Email;

    public DanhBa() {
    }

    public DanhBa(String phoneNumber, String group, String name, String gender, String address, String bornDay, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        Name = name;
        this.gender = gender;
        this.address = address;
        this.bornDay = bornDay;
        Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBornDay() {
        return bornDay;
    }

    public void setBornDay(String bornDay) {
        this.bornDay = bornDay;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", group='" + group + '\'' +
                ", Name='" + Name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", bornDay='" + bornDay + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
