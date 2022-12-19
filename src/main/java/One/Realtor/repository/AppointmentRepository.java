package One.Realtor.repository;

import One.Realtor.domain.AppointmentInfo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AppointmentRepository {

    private static Map<Long, AppointmentInfo> store = new HashMap<>();
    private static long sequence = 0L;
    public void saveAppointment(AppointmentInfo appointment){
        appointment.setId(++sequence);
        store.put(appointment.getId(), appointment);
    }
}
