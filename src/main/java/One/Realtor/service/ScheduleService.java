package One.Realtor.service;

import One.Realtor.controller.Appointmentform;
import One.Realtor.domain.AppointmentInfo;
import One.Realtor.domain.Schedule;
import One.Realtor.repository.AppointmentRepository;
import One.Realtor.repository.CurrentUserRepository;
import One.Realtor.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ScheduleService {
    private final CurrentUserRepository currentUserrepository;
    private final ScheduleRepository scheduleRepository;
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public ScheduleService(CurrentUserRepository currentUserrepository,
                           ScheduleRepository scheduleRepository,
                           AppointmentRepository appointmentRepository) {
        this.currentUserrepository = currentUserrepository;
        this.scheduleRepository =  scheduleRepository;
        this.appointmentRepository = appointmentRepository;
    }


    public List<Schedule> findSchedule(int date){
        return scheduleRepository.find(currentUserrepository.getRegion(), date);
    }

    public void makeAppointment(Appointmentform form){
        AppointmentInfo appointment = new AppointmentInfo();
        appointment.setCustomerId(currentUserrepository.getUserId());
        Optional<Schedule> sch = scheduleRepository.findById(Integer.parseInt(form.getSchNum()));
        if(sch.isPresent()) {
            Schedule schedule = sch.get();
            appointment.setPhonenumber(schedule.getPhoneNumber());
            appointment.setExpertId(schedule.getExpertID());
            appointment.setDate(schedule.getDate());
            scheduleRepository.delSchedule(Integer.parseInt(form.getSchNum()));
        }

        String[] result = form.getTime().split(":");
        appointment.setTime(Integer.parseInt(result[0])+(100*Integer.parseInt(result[1])));
        appointment.setPlace(form.getPlace());
        appointmentRepository.saveAppointment(appointment);


    }
}
