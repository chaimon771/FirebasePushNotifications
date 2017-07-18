package example.haim.firebasepushnotifications;

import android.content.SharedPreferences;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by DELL e7440 on 17/07/2017.
 */

//the registration process happens immediately when the app is first run.
    // may happen before Sign In

//This Class registers the user to fcm and gets the token:
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        //Get the token > so we can send individual message
        String token = FirebaseInstanceId.getInstance().getToken();

        //can't assign this token to a person Yet, since we have no User yet.
        //so we need save it to shared preferences.
        SharedPreferences prefs = getSharedPreferences("userid", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("token", token);
        editor.commit(); //sync we want to wait...

    }
}
