package One.Realtor.repository;

import One.Realtor.domain.ChatInfo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ChatRepository {
    private static Map<Integer, ChatInfo> store = new HashMap<>(); // <customerId,채팅방>


    public void saveChatRoom(ChatInfo chatInfo){
        store.put(chatInfo.getCustomerId(),chatInfo);
    }
    public ChatInfo findById(int userId){
        return store.get(userId);
    }

}
