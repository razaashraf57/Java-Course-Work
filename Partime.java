import java.util.Date;
    public class Partime extends Staff {
    float hourly_rate;
    int hours_worked_per_week;
    public Partime(String firstname,String lastname,String id,char sex,Date dob,double hourly_rate,int hours_worked_per_week) {
    super(firstname,lastname,id, sex,dob,hourly_rate);
    this.hours_worked_per_week=hours_worked_per_week;
    }
    public Partime() {
    }
    @Override
    public double monthlyEarning() {
    return hourly_rate*hours_worked_per_week*4;
    }
    public int getHours_worked_per_week() {
    return hours_worked_per_week;
    }
    public void setHours_worked_per_week(int hours_worked_per_week) {
    this.hours_worked_per_week = hours_worked_per_week;
    }
    public String toString(){
    return super.toString()+"\n Hours worked per month: "+(hours_worked_per_week*4);
    }
    }