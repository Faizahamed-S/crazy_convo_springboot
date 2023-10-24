package com.sjsu.CrazyConvo.controller;

import com.sjsu.CrazyConvo.Service.ChatService;
import com.sjsu.CrazyConvo.Service.UserService;
import com.sjsu.CrazyConvo.model.Message;
import com.sjsu.CrazyConvo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ChatController {
    @Autowired
    ChatService chatService;

    @Autowired
    UserService userService;

//    users[0]= sender and users[1]=receiver
    @GetMapping(value={"/get-msg-list/{sender_id}/{receiver_id}"})
    public List<Message> getMsgList(@PathVariable("sender_id") int sender_id, @PathVariable("receiver_id") int receiver_id){
        return chatService.getMsgList(sender_id, receiver_id);
    }

    @PostMapping(value={"/send-msg"})
    public List<Message> senMsg(@RequestBody Message msg)
    {
         chatService.sendMsg(msg);
         return chatService.getMsgList(msg.getSender().getUserId(),msg.getReceiver().getUserId());
    }

    @GetMapping(value={"/get-users"})
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

}
