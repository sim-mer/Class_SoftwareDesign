package One.Realtor.service;

import One.Realtor.domain.Checklist;
import One.Realtor.repository.ChecklistRepository;
import One.Realtor.repository.CurrentUserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ChecklistService {
	private final CurrentUserRepository currentUserrepository;
	private final ChecklistRepository checklistRepository;
	public ChecklistService(CurrentUserRepository currentUserrepository, ChecklistRepository checklistRepository) {
		this.currentUserrepository = currentUserrepository;
		this.checklistRepository = checklistRepository;
	}


	public void createChecklist(String score) { // 체크리스트 생성
		int id = currentUserrepository.getUserId();
		int index = checklistRepository.findIndex(id);
		Checklist check = new Checklist(index,Integer.parseInt(score),id);
		checklistRepository.saveChecklist(check);
	}

	public ArrayList<Checklist> find(){
		return checklistRepository.findById(currentUserrepository.getUserId());
	}

	
}
