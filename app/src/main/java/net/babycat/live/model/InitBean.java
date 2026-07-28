package net.babycat.live.model;

import java.io.Serializable;
import org.litepal.crud.LitePalSupport;

/* JADX INFO: loaded from: classes4.dex */
public class InitBean extends LitePalSupport implements Serializable {
    private String comm_chat_room;
    private SettingBean setting;
    private TextChatRoomBean text_chat_room;

    public String getComm_chat_room() {
        return this.comm_chat_room;
    }

    public SettingBean getSetting() {
        return this.setting;
    }

    public TextChatRoomBean getText_chat_room() {
        return this.text_chat_room;
    }

    public void setComm_chat_room(String str) {
        this.comm_chat_room = str;
    }

    public void setSetting(SettingBean settingBean) {
        this.setting = settingBean;
    }

    public void setText_chat_room(TextChatRoomBean textChatRoomBean) {
        this.text_chat_room = textChatRoomBean;
    }
}
