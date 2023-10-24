package com.sjsu.CrazyConvo.Service;

import com.sjsu.CrazyConvo.model.Message;
import com.sjsu.CrazyConvo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChatService {
    boolean sendMsg(Message msg);
    List<Message> getMsgList(int sender, int receiver);

}
