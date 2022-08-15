package com.generic_corp.cryptrix;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static android.content.Context.MODE_PRIVATE;

public class LoginTabFragment extends Fragment {
    EditText email;
    EditText pass;
    CheckBox checkBox;
    TextView forgetPass,swipe_text;
    Button login;
    float v = 0;
    FirebaseAuth fauth;
    private static int Splash_Time_Out=4000;
    SharedPreferences loginSharedPref;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);
        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.password);
        forgetPass = root.findViewById(R.id.forget_pass);
        login = root.findViewById(R.id.login_btn);

        swipe_text = root.findViewById(R.id.swipe_text);
        fauth = FirebaseAuth.getInstance();





        email.setTranslationX(800);
        pass.setTranslationX(800);
        forgetPass.setTranslationX(800);
        login.setTranslationX(800);
        swipe_text.setTranslationX(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        forgetPass.setAlpha(v);
        login.setAlpha(v);
        swipe_text.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        swipe_text.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_txt = email.getText().toString().trim();
                String password_txt = pass.getText().toString().trim();
                loginUser(email_txt, password_txt);





            }
        });



        return root;
    }

    private void loginUser(String email_txt, String password_txt){
        fauth.signInWithEmailAndPassword(email_txt,password_txt).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){


                    Toast.makeText(getActivity(),"Logged in",Toast.LENGTH_LONG).show();

                    startActivity(new Intent(getContext(),dashboard.class));


                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getActivity(),"User Registration Failed",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
