package com.dev_m_elbanna.watsonbot.network.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created By Mohamed El Banna On 4/5/2020
 **/
public class MessageResponse {
    private String userName;
    private String message;
    private String messageTime;

    public MessageResponse() {
    }

    public MessageResponse(String userName, String message) {
        this.userName = userName;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageTime() {
        return new SimpleDateFormat("h:mm a", Locale.getDefault()).format(new Date());
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }
}
