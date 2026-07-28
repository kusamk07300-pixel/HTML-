package net.babycat.live.platform.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes3.dex */
public class q0 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f36960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36962c;

    public q0(EditText editText) {
        this.f36962c = "[^一-龥]";
        this.f36960a = editText;
        this.f36961b = "[^一-龥]";
    }

    public final String a(String str, String str2) {
        return str2.replaceAll(str, "");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String strA = a(this.f36961b, editable.toString());
        this.f36960a.removeTextChangedListener(this);
        editable.replace(0, editable.length(), strA.trim());
        this.f36960a.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public q0(EditText editText, String str) {
        this.f36962c = "[^一-龥]";
        this.f36960a = editText;
        this.f36961b = str;
    }
}
