package com.milkmanagement.initials;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.milkmanagement.R;
import com.milkmanagement.utils.PreferencesManager;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_username, edt_password;
    private Button btn_submit;
    private Intent intent;
    private TextView tv_title;
    private TextView tv_forget_password, tv_signup, tv_terms_and_condition;
    private PreferencesManager preferencesManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        preferencesManager = PreferencesManager.getInstance(LoginActivity.this);
        initUI();
        initListener();
    }

    public void initUI() {


        tv_title = (TextView) findViewById(R.id.tv_title);
        edt_username = (EditText) findViewById(R.id.edt_username);
        edt_password = (EditText) findViewById(R.id.edt_password);
        tv_forget_password = (TextView) findViewById(R.id.tv_forget_password);
        tv_signup = (TextView) findViewById(R.id.tv_signup);
        tv_terms_and_condition = (TextView) findViewById(R.id.tv_terms_and_condition);
        btn_submit = (Button) findViewById(R.id.btn_submit);


    }

    public void initListener() {
        btn_submit.setOnClickListener(this);
        tv_forget_password.setOnClickListener(this);
        tv_signup.setOnClickListener(this);
        tv_terms_and_condition.setOnClickListener(this);
    }

    private void validate() {
        String email = edt_username.getText().toString().trim();
        String pass = edt_password.getText().toString().trim();
        int count = 0;

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            count--;
            edt_username.setError("Enter the valid email");
        }
        if (pass.equalsIgnoreCase("")) {
            count--;
            edt_password.setError("Password should not be blank");
        } else if (pass.length() < 5) {
            count--;
            edt_password.setError("Password length must be 8 digit.");
        }
        if (count == 0) {

            Toast.makeText(this, "Validate Success", Toast.LENGTH_SHORT).show();

            // callApis("Login");
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_terms_and_condition:
                final Dialog dialog = new Dialog(LoginActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

                LayoutInflater lf = (LayoutInflater) (LoginActivity.this)
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View dialogview = lf.inflate(R.layout.terms_and_condition, null);

                ImageView img_close = (ImageView) dialogview.findViewById(R.id.img_close);
                TextView btn_agree = (TextView) dialogview.findViewById(R.id.btn_agree);
                TextView tv_titletnc = (TextView) dialogview.findViewById(R.id.tv_titletnc);
                TextView tv_titletncdesc = (TextView) dialogview.findViewById(R.id.tv_titletncdesc);

                btn_agree.setOnClickListener(new View.OnClickListener() {
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
                break;
            case R.id.tv_signup:
                intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_submit:
                validate();
                break;
            case R.id.tv_forget_password:
//                 intent=new Intent(LoginActivity.this,ForgotPasswordActivity.class);
//                startActivity(intent);
                break;
        }
    }


}
