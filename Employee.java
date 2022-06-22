import java.text.SimpleDateFormat;
    import java.util.Date;
    public abstract class Employee implements Cloneable {
    char sex;
    Date dob;
    String firstname, lastname, id;
        Employee() {
    }
    Employee(String firstname, String lastname, String id, char sex, Date dob) {
        this.sex = sex;
        this.firstname = firstname;
        this.id = id;
        this.dob = dob;
        this.lastname = lastname;
    }
    public String toString() {

    /*
    * this method will return a string which will be containing all details
    */

    SimpleDateFormat dateformat = new SimpleDateFormat("mm/dd/yy");
    String str = "ID Employee number: " + id + "\nEmployee Last name: "
    + lastname + ", Firstname: " + firstname + "\nBirth Date: "
    + dateformat.format(dob);
    return str;
    }
    public String getFirstname() {
    return firstname;
    }
    public void setFirstname(String firstname) {
    this.firstname = firstname;
    }
    public String getLastname() {
    return lastname;
    }
    public void setLastname(String lastname) {
    this.lastname = lastname;
    }
    public String getId() {
    return id;
    }
    public void setId(String id) {
    this.id = id;
    }
    public char getSex() {
    return sex;
    }
    public void setSex(char sex) {
    this.sex = sex;
    }
    public Date getDob() {
    return dob;
    }
    public void setDob(Date dob) {
    this.dob = dob;
    }
    /*
    * this method is for returning monthly earning
    * returning monthly earning in double format
    */
    public abstract double monthlyEarning();
    @Override
    protected Object clone() throws CloneNotSupportedException {
    return super.clone();
    }
    }
