package One.Realtor.domain;

public class User {
    private int userId;
    private String region;

    public User(int userId, String region) {
        this.userId = userId;
        this.region = region;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
