package One.Realtor.repository;

import One.Realtor.domain.Checklist;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ChecklistRepository {
	
	private static Map<Integer, ArrayList<Checklist>> checklist = new HashMap<>();

	public int findIndex(int Userid){
		if(checklist.get(Userid)==null) {
			ArrayList<Checklist> a = new ArrayList<>();
			checklist.put(Userid, a);
			return 0;
		}
		return checklist.get(Userid).size();
	}

	public void saveChecklist(Checklist check){
		ArrayList<Checklist> a = checklist.get(check.getUserId());
		a.add(check);
		checklist.put(check.getUserId(), a);
	}

	public ArrayList<Checklist> findById(int Id){
		return checklist.get(Id);
	}
	
}
