package net.babycat.live.model;

import org.litepal.crud.LitePalSupport;

/* JADX INFO: loaded from: classes4.dex */
public class NoticeChatBean extends LitePalSupport {
    private String content;
    private String create_time;
    private String title;
    private String url;

    public String getContent() {
        return this.content;
    }

    public String getCreate_time() {
        return this.create_time;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreate_time(String str) {
        this.create_time = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
