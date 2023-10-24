package com.sjsu.CrazyConvo.Service;

import com.sjsu.CrazyConvo.Repository.MsgRepository;

import com.sjsu.CrazyConvo.model.Message;
import com.sjsu.CrazyConvo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChatServiceImple implements  ChatService{
    @Autowired
    MsgRepository msgRepo;
    public boolean sendMsg(Message msg){
        try{
        msgRepo.save(msg);}
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return  true;
    }
    public List<Message> getMsgList(int sender, int receiver){
        return msgRepo.findAll().stream().filter(msg->(msg.getSender().getUserId()==  sender&&msg.getReceiver().getUserId()==receiver)||
                msg.getSender().getUserId()==receiver&& msg.getReceiver().getUserId()==sender).collect(Collectors.toList());
    }
}
