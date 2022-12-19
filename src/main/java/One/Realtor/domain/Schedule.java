package One.Realtor.domain;

public class Schedule {
    private String PhoneNumber;
    private String Region;
    private int Date;
    private int time;
    private int ExpertID;
    private int schNum;

    public Schedule(String phoneNumber, String region, int date, int time, int expertID, int schNum) {
        PhoneNumber = phoneNumber;
        Region = region;
        Date = date;
        this.time = time;
        ExpertID = expertID;
        this.schNum = schNum;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getExpertID() {
        return ExpertID;
    }

    public void setExpertID(int expertID) {
        ExpertID = expertID;
    }

    public int getSchNum() {
        return schNum;
    }

    public void setSchNum(int schNum) {
        this.schNum = schNum;
    }
}
