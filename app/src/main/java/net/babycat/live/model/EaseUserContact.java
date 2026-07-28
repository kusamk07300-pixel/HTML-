package net.babycat.live.model;

import java.io.Serializable;
import org.litepal.crud.LitePalSupport;

/* JADX INFO: loaded from: classes4.dex */
public class EaseUserContact extends LitePalSupport implements Serializable {
    private String userInfos;

    public String getUserInfos() {
        return this.userInfos;
    }

    public void setUserInfos(String str) {
        this.userInfos = str;
    }
}
