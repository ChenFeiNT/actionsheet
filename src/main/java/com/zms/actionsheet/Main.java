package com.zms.actionsheet;

import com.zms.actionsheet.ActionSheet.OnActionSheetSelected;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Main extends Activity implements OnActionSheetSelected,
        OnCancelListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViewById(R.id.show).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ActionSheet.showSheet(Main.this, Main.this, Main.this);
            }
        });
    }

    @Override
    public void onClick(int whichButton) {
        switch (whichButton) {
            case 0:
                showToast("核武器正在发射");
                break;

            case 1:
                showToast("取消发射核武器");
                break;

            default:
                break;
        }
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        // TODO Auto-generated method stub
        showToast("取消");
    }

    private void showToast(CharSequence charSequence) {
        Toast.makeText(this, charSequence, Toast.LENGTH_SHORT).show();
    }
}
