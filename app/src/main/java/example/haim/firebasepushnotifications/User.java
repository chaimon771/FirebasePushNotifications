package example.haim.firebasepushnotifications;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by DELL e7440 on 17/07/2017.
 */

public class User implements Parcelable {

    private String displayName;
    private String uid;

    //PoJo:

    //Constructors:
    public User() {
    }

    public User(FirebaseUser user) {
        this.displayName = user.getDisplayName();
        this.uid = user.getUid();
    }

    //Getter & Setters:
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }

    //toString
    @Override
    public String toString() {
        return "User{" +
                "displayName='" + displayName + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }

    //Parcelables
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.displayName);
        dest.writeString(this.uid);
    }
    protected User(Parcel in) {
        this.displayName = in.readString();
        this.uid = in.readString();
    }
    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
