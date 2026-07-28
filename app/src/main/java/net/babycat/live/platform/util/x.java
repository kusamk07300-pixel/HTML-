package net.babycat.live.platform.util;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.EditText;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class x {

    public class a implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            if (charSequence.equals(" ")) {
                return "";
            }
            return null;
        }
    }

    public class b implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            if (charSequence.equals(" ") || charSequence.toString().contentEquals("\n")) {
                return "";
            }
            return null;
        }
    }

    public class c implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            if (Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(charSequence.toString()).find()) {
                return "";
            }
            return null;
        }
    }

    public class d implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EditText f37073a;

        public d(EditText editText) {
            this.f37073a = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.toString().contains(InstructionFileId.DOT) && (charSequence.length() - 1) - charSequence.toString().indexOf(InstructionFileId.DOT) > 2) {
                charSequence = charSequence.toString().subSequence(0, charSequence.toString().indexOf(InstructionFileId.DOT) + 3);
                this.f37073a.setText(charSequence);
                this.f37073a.setSelection(charSequence.length());
            }
            if (charSequence.toString().trim().substring(0).equals(InstructionFileId.DOT)) {
                charSequence = x0.IMAGE_1 + ((Object) charSequence);
                this.f37073a.setText(charSequence);
                this.f37073a.setSelection(2);
            }
            if (!charSequence.toString().startsWith(x0.IMAGE_1) || charSequence.toString().trim().length() <= 1 || charSequence.toString().substring(1, 2).equals(InstructionFileId.DOT)) {
                return;
            }
            this.f37073a.setText(charSequence.subSequence(0, 1));
            this.f37073a.setSelection(1);
        }
    }

    public static void a(EditText editText) {
        editText.setFilters(new InputFilter[]{new a()});
    }

    public static void b(EditText editText) {
        editText.setFilters(new InputFilter[]{new c()});
    }

    public static void c(EditText editText) {
        editText.setFilters(new InputFilter[]{new b(), new InputFilter.LengthFilter(17)});
    }

    public static void d(EditText editText) {
        editText.addTextChangedListener(new d(editText));
    }
}
