package net.babycat.live.platform.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BaseResponse<T> implements Serializable {
    public static final int SUCCESS = 200;
    private static int SUCCESS_CODE = 200;
    private int code;
    private int count_coin;
    private T data;
    private boolean hasmore;
    private String msg;
    private String time;
    private int total;

    public int getCode() {
        return this.code;
    }

    public int getCount_coin() {
        return this.count_coin;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getResult() {
        return this.data;
    }

    public String getTime() {
        return this.time;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isHasmore() {
        return this.hasmore;
    }

    public boolean isSuccess() {
        return getCode() == SUCCESS_CODE;
    }

    public void setCode(int i10) {
        this.code = i10;
    }

    public void setCount_coin(int i10) {
        this.count_coin = i10;
    }

    public void setHasmore(boolean z10) {
        this.hasmore = z10;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setResult(T t10) {
        this.data = t10;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setTotal(int i10) {
        this.total = i10;
    }
}
