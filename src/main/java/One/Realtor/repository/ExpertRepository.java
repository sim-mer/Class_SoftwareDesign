package One.Realtor.repository;

import One.Realtor.domain.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ExpertRepository {
    private static Map<String, ArrayList<User>> store = new HashMap<>(){{
        put("대구", new ArrayList<User>(Arrays.asList(new User(999, "대구"), new User(998, "대구"))));
    }}; // <지역이름,List<userId>>
    public int randomSelect(String region){
        Random random = new Random();
        ArrayList<User> temp = store.get(region);
        return temp.get(random.nextInt(temp.size())).getUserId();
    }
}
