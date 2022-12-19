package One.Realtor.service;

import One.Realtor.domain.ChatInfo;
import One.Realtor.repository.ChatRepository;
import One.Realtor.repository.CurrentUserRepository;
import One.Realtor.repository.ExpertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final ChatRepository chatRepository;
    private final CurrentUserRepository currentUserRepository;
    private final ExpertRepository expertRepository;

    @Autowired
    public ChatService(ChatRepository chatRepository, CurrentUserRepository currentUserRepository, ExpertRepository expertRepository){
        this.chatRepository = chatRepository;
        this.currentUserRepository = currentUserRepository;
        this.expertRepository = expertRepository;
    }


    public ChatInfo writeChat(String chat){
        String message = currentUserRepository.getUserId() + " : " + chat;
        ChatInfo chatInfo = chatRepository.findById(currentUserRepository.getUserId());

        chatInfo.appendChat(message);

        chatRepository.saveChatRoom(chatInfo); //덮어쓰기

        return chatInfo;
    }

    public ChatInfo createChat(){
        int customerId = currentUserRepository.getUserId();
        if( (chatRepository.findById(customerId) ) == null){
            String region = currentUserRepository.getRegion();
            int expertId = expertRepository.randomSelect(region);

            ChatInfo chatInfo = new ChatInfo(customerId, expertId);
            chatRepository.saveChatRoom(chatInfo);
            return chatInfo;
        }
        else{
            return chatRepository.findById(currentUserRepository.getUserId());
        }
    }
}
