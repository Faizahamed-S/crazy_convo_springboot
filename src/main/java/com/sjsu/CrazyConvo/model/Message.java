package com.sjsu.CrazyConvo.model;

import jakarta.persistence.*;


@Entity
@Table(name="Message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int msgID;

    @ManyToOne
    @JoinColumn(name = "sender_id")
   User sender;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
   User receiver;
    String time;

    String message;


    public Message(){

    }

    public Message(User sender, User receiver, String time, int msgID, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.time = time;
        this.msgID = msgID;
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMsgID() {
        return msgID;
    }

    public void setMsgID(int msgID) {
        this.msgID = msgID;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msgID=" + msgID +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", time='" + time + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
