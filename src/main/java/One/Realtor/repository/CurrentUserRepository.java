package One.Realtor.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CurrentUserRepository {
    private int UserId = 1;
    private String Region = "대구";
    private String Name = "Joe";

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
