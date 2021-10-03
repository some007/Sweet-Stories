package me.akshay.stories.ui.login;

import static me.akshay.stories.common.index.Constants.IntConstants.LOADER_DELAY;
import static me.akshay.stories.common.index.Constants.IntentKeys.RC_SIGN_IN;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

import java.util.Timer;
import java.util.TimerTask;

import me.akshay.stories.R;
import me.akshay.stories.common.model.UserModel;
import me.akshay.stories.databinding.ActivityLoginBinding;
import me.akshay.stories.services.SharedPrefService;
import me.akshay.stories.ui.main.MainActivity;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding viewBinding;
    private LoginViewModel viewModel;

    private GoogleSignInClient mClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new LoginViewModel();
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        viewBinding.setViewModel(viewModel);
        viewBinding.executePendingBindings();
        initSignInOptions();
    }

    @BindingAdapter({"toastMessage"})
    public static void makeToast(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void initSignInOptions() {
        if (SharedPrefService.getLogStatus(this)){
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }else {
            GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                    .requestIdToken(getString(R.string.google_web_client))
                    .requestEmail()
                    .build();
            mClient = GoogleSignIn.getClient(this, gso);
            viewBinding.googleBtn.setOnClickListener((v)-> startLogin());
        }
    }

    @SuppressWarnings("deprecation")
    private void startLogin() {
        Intent signInIntent = mClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            viewModel.onGoogleSignInResult(data);
            after2Seconds();
        }
    }

    private void after2Seconds() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(()->{
                    SharedPrefService.setUserLog(LoginActivity.this, viewModel.getAccount());
                    initSignInOptions();
                });
            }
        }, LOADER_DELAY);
    }

}