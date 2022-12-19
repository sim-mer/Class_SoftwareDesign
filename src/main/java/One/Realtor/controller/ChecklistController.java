package One.Realtor.controller;

import One.Realtor.domain.Checklist;
import One.Realtor.service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class ChecklistController {
    private final ChecklistService checklistService;
    @Autowired
    public ChecklistController(ChecklistService checklistService){
        this.checklistService = checklistService;
    }
	
    @GetMapping("/checklist")
    public String checkcol(Model model){
        ArrayList<Checklist> a = checklistService.find();
        model.addAttribute("checklists", a);
        return "checklist/check_list_col";
    }
    
    @GetMapping("/checklist/create")
    public String create() {
        return "checklist/check_list";
    }
    
    @PostMapping("/checklist/create")
    public String list(ScoreForm form){
        checklistService.createChecklist(form.getTemp());
    	return "redirect:/checklist";
    }
    
    
}
