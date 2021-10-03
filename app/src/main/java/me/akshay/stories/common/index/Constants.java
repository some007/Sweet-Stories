package me.akshay.stories.common.index;

public class Constants {

    public interface IntConstants{
        int LOADER_DELAY = 3500;
        int REQUEST_CODE_PERMISSION_DEFAULT = 1;
        int ID_MAX = 99999;
        int ID_MIN = 10000;
    }

    public interface Tags{
        String FIREBASE_AUTH_TAG = "Google Sign In";
    }

    public interface StringConstants{
        String successMessage = "Login Successful";
        String errorMessage = "Unable to login";
        String GOOGLE_LOGIN = "google";
        String PROFILE = "photograph";
        String APP_KEY = "sweet_terms";
        String REGISTRATION = "entered";
        String NEW_USER = "new";
        String EMAIL = "email";
        String USER = "user";
        String BASE = "DATA";
        String EMPTY_KEY = "";
    }

    public interface IntentKeys{
        int RC_SIGN_IN = 9001;
    }
}
