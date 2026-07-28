package net.babycat.live.model;

import java.io.Serializable;
import org.litepal.crud.LitePalSupport;

/* JADX INFO: loaded from: classes4.dex */
public class TextChatRoomBean extends LitePalSupport implements Serializable {
    private String chatroom_id;
    private Integer room_id;

    public String getChatroom_id() {
        return this.chatroom_id;
    }

    public Integer getRoom_id() {
        return this.room_id;
    }

    public void setChatroom_id(String str) {
        this.chatroom_id = str;
    }

    public void setRoom_id(Integer num) {
        this.room_id = num;
    }
}
