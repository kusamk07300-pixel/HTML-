package net.babycat.live.model;

import java.util.List;
import org.litepal.crud.LitePalSupport;

/* JADX INFO: loaded from: classes4.dex */
public class NoticeListBean extends LitePalSupport {
    private List<NoticeChatBean> notices;
    private int redCount = 0;

    public List<NoticeChatBean> getNotices() {
        return this.notices;
    }

    public int getRedCount() {
        return this.redCount;
    }

    public void setNotices(List<NoticeChatBean> list) {
        this.notices = list;
    }

    public void setRedCount(int i10) {
        this.redCount = i10;
    }
}
