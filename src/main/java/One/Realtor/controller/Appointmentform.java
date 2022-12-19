package One.Realtor.controller;

public class Appointmentform {
    private String Phonenumber;
    private String Time;
    private String Place;
    private String schNum;

    public String getSchNum() {
        return schNum;
    }

    public void setSchNum(String schNum) {
        this.schNum = schNum;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }
}
