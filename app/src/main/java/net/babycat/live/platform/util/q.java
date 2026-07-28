package net.babycat.live.platform.util;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class q {
    public static final InputFilter emojiFilter = new a();

    public class a implements InputFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Pattern f36959a = Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[☀-⟿]", 66);

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            if (this.f36959a.matcher(charSequence).find()) {
                return "";
            }
            return null;
        }
    }

    public q() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "Empty/Null json content";
        }
        try {
            String strTrim = str.trim();
            return strTrim.startsWith(a5.b.f399d) ? new JSONObject(strTrim).toString(4) : strTrim.startsWith("[") ? new JSONArray(strTrim).toString(4) : strTrim;
        } catch (OutOfMemoryError unused) {
            return "Output omitted because of Object size";
        } catch (JSONException unused2) {
            return str;
        }
    }

    public static String b(String str) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb2 = new StringBuilder("");
        byte[] bytes = str.getBytes();
        for (int i10 = 0; i10 < bytes.length; i10++) {
            sb2.append(charArray[(bytes[i10] & 240) >> 4]);
            sb2.append(charArray[bytes[i10] & com.google.common.base.a.SI]);
        }
        return sb2.toString().trim();
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "Empty/Null xml content";
        }
        try {
            StreamSource streamSource = new StreamSource(new StringReader(str));
            StreamResult streamResult = new StreamResult(new StringWriter());
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("indent", "yes");
            transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformerNewTransformer.transform(streamSource, streamResult);
            return streamResult.getWriter().toString().replaceFirst(">", ">\n");
        } catch (TransformerException unused) {
            return str;
        }
    }
}
