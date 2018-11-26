package com.milkmanagement.initials;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.milkmanagement.R;
import com.milkmanagement.adapter.MySpinnerAdapter;
import com.milkmanagement.utils.PreferencesManager;
import com.milkmanagement.utils.UnCaughtException;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_username, edt_password, edt_email, edt_mobile;
    private Button btn_submit;
    private TextView tv_title, tv_did_not;
    private Spinner sp_select_one;
    private PreferencesManager preferencesManager;
    private String member_id = "", otp = "";
    private Spinner sp_milk, sp_qty, sp_schedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread.setDefaultUncaughtExceptionHandler(new UnCaughtException(this));
        setContentView(R.layout.activity_create_account);
        initUI();
        initListener();
    }

    List<String> milk, qty, schedule;

    public void initUI() {
        sp_milk = (Spinner) findViewById(R.id.sp_milk);
        sp_qty = (Spinner) findViewById(R.id.sp_qty);
        sp_schedule = (Spinner) findViewById(R.id.sp_schedule);
        btn_submit = (Button) findViewById(R.id.btn_submit);

        milk = new ArrayList<>();
        qty = new ArrayList<>();
        schedule = new ArrayList<>();


        milk.add("Select Type");
        milk.add("Cow");
        milk.add("Buffalo");
        milk.add("Both");

        qty.add("Select Quantity");
        qty.add("1 ltr");
        qty.add("1.5 ltr");
        qty.add("2 ltr");
        qty.add("3 ltr");


        schedule.add("Select Schedule");
        schedule.add("Daily");
        schedule.add("Alternate Day");

        MySpinnerAdapter aa1 = new MySpinnerAdapter(CreateAccountActivity.this, android.R.layout.simple_spinner_item, milk);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_milk.setAdapter(aa1);

        MySpinnerAdapter aa2 = new MySpinnerAdapter(CreateAccountActivity.this, android.R.layout.simple_spinner_item, qty);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_qty.setAdapter(aa2);


        MySpinnerAdapter aa3 = new MySpinnerAdapter(CreateAccountActivity.this, android.R.layout.simple_spinner_item, schedule);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_schedule.setAdapter(aa3);


        sp_milk.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void initListener() {
        btn_submit.setOnClickListener(this);

    }

    Dialog dialog;

    public void showDialog() {
        dialog = new Dialog(CreateAccountActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        LayoutInflater lf = (LayoutInflater) (CreateAccountActivity.this)
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View dialogview = lf.inflate(R.layout.otp_verification, null);

        TextView tv_otp = (TextView) dialogview.findViewById(R.id.tv_otp);
        TextView tv_enter_otp = (TextView) dialogview.findViewById(R.id.tv_enter_otp);
        TextView tv_did_not = (TextView) dialogview.findViewById(R.id.tv_did_not);
        EditText edt_enter_otp = (EditText) dialogview.findViewById(R.id.edt_enter_otp);
        Button btn_verified = (Button) dialogview.findViewById(R.id.btn_verified);
        Button btn_cancel = (Button) dialogview.findViewById(R.id.btn_cancel);
        ImageView img_close = (ImageView)dialogview.findViewById(R.id.img_close);

        tv_did_not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        btn_verified.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(CreateAccountActivity.this, LoginActivity.class);

                startActivity(i);
                dialog.dismiss();
                finish();

            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.setContentView(dialogview);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = ViewGroup.LayoutParams.MATCH_PARENT;
        lp.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;

        dialog.getWindow().setAttributes(lp);
        dialog.show();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_submit:
                showDialog();
                break;
        }
    }
}
