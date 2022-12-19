package One.Realtor.repository;

import One.Realtor.domain.Schedule;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ScheduleRepository {

    private static Map<Long, Schedule> store = new HashMap<>(){{
        put(0L, new Schedule("01012345678", "대구", 1202, 1100, 1, 0));
        put(1L, new Schedule("01023456789", "대구", 1202, 1101, 2, 1));
    }};

    public List<Schedule> find(String region, int date) {

        List<Schedule> list = new ArrayList<>();
        for(int i = 0; i<store.size(); i++){
            if(region.equals(store.get(Long.valueOf(i)).getRegion())){
                if(date == store.get(Long.valueOf(i)).getDate())
                    list.add(store.get(Long.valueOf(i)));
            }
        }
        return list;
    }




/*
    public void delSchedule(int id){
        store.remove(id);
    }

    public Optional<Schedule> findById(int id){
        return Optional.ofNullable(store.get(id));
    }
    */

    public Optional<Schedule> findById(int schNum){
        Schedule result = null;

        for(Long key: store.keySet()){
            Schedule value = store.get(key);
            if(value.getSchNum() == schNum)
                result = value;
        }

        return Optional.ofNullable(result);
    }

    public void delSchedule(int schNum) {
        System.out.println("\n\n\nschNum = "+schNum+"\n\n\n");
        for (Long key : store.keySet()) {
            Schedule value = store.get(key);
            if (value.getSchNum() == schNum) {
                store.remove(key);
            }

        }
    }

}
