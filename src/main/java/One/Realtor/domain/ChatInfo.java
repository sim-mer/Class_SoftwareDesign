package One.Realtor.domain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ChatInfo {
        private int customerId;
        private int expertId;
        private Queue<String> chatLog = new LinkedList<>(Arrays.asList("", "", "", "", "", "", "", "", "", ""));

        public ChatInfo(int customerId, int expertId){
                this.customerId = customerId;
                this.expertId = expertId;
        }



        public int getCustomerId() {
                return customerId;
        }

        public void setCustomerId(int customerId) {
                this.customerId = customerId;
        }

        public int getExpertId() {
                return expertId;
        }

        public void setExpertId(int expertId) {
                this.expertId = expertId;
        }



        public void appendChat(String str){
                chatLog.add(str);
                chatLog.remove();
        }
        public Queue<String> getChatLog() {
                return chatLog;
        }
}
