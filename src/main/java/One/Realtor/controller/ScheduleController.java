package One.Realtor.controller;


import One.Realtor.domain.Schedule;
import One.Realtor.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

@Controller
public class ScheduleController {
    private final ScheduleService scheduleService;
    @Autowired
    public ScheduleController(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }

    @GetMapping(value = "/schedules")
    public String sche(){
        return "schedules/FindSchedule";
    }

    @PostMapping(value = "/schedules/list")
    public String list(Dateform dateform, Model model){
        String Sdate = dateform.getDate();
        String[] result = Sdate.split("-");
        int date = Integer.parseInt(result[2]) + (100 * Integer.parseInt(result[1]));
        List<Schedule> schedules = scheduleService.findSchedule(date);
        model.addAttribute("schedules", schedules);
        return "schedules/ScheduleList";
    }
    @GetMapping(value = "/appointment/new")
    public String createappointmentForm(schNumform form, Model model){
        model.addAttribute("data", form);
        return "appointment/ReForm";
    }

    @PostMapping(value = "/appointment/check")
    public String create(Appointmentform appointmentform) {
        scheduleService.makeAppointment(appointmentform);
        return "appointment/ReComp";
    }

}
