package net.babycat.live.model;

import java.io.Serializable;
import org.litepal.crud.LitePalSupport;

/* JADX INFO: loaded from: classes4.dex */
public class EaseUserInfo extends LitePalSupport implements Serializable {
    private String avatarUrl;
    private String nickname;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }
}
