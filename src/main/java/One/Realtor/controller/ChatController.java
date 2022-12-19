package One.Realtor.controller;

import One.Realtor.domain.ChatInfo;
import One.Realtor.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {
    private final ChatService chatService;
    @Autowired
    public ChatController(ChatService chatService){
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public String createChat(Model model){
        ChatInfo chatroom = chatService.createChat();
        model.addAttribute("chatInfo", chatroom.getChatLog());
        return "chat/chatForm";
    }

    @PostMapping("/chat")
    public String Chatting(ChatForm chatForm, Model model){
        ChatInfo chatroom = chatService.writeChat(chatForm.getMsg());
        model.addAttribute("chatInfo", chatroom.getChatLog());
        return "chat/chatForm";
    }

}
