package me.akshay.stories.ui.login;

import static me.akshay.stories.common.index.Constants.StringConstants.NEW_USER;

import android.content.Intent;
import android.os.Build;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

import me.akshay.stories.BR;
import me.akshay.stories.common.model.UserModel;
import me.akshay.stories.services.UtilService;

public class LoginViewModel extends BaseObservable {

    @Bindable
    private String toastMessage = null;

    private UserModel account;

    public LoginViewModel(){
    }

    public UserModel getAccount() {
        return account;
    }

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void onGoogleSignInResult(Intent data) {
        Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
        try {
            GoogleSignInAccount account = task.getResult(ApiException.class);
            setToastMessage("authenticating...");
            firebaseAuthWithGoogleAccount(account);
        }catch (ApiException e){
            setToastMessage("Unable to log in");
        }
    }

    private void firebaseAuthWithGoogleAccount(GoogleSignInAccount account) {
        this.account = new UserModel(account.getDisplayName(), account.getEmail(), NEW_USER
                ,account.getDisplayName(), UtilService.getCurrentDate());
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()){

                    }else {
                        setToastMessage("Please try again later");
                    }
                });
    }


}
