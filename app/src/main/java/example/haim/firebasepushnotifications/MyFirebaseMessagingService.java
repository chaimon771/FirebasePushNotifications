package example.haim.firebasepushnotifications;

import android.content.Intent;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by DELL e7440 on 17/07/2017.
 */

//it's a specialized intent service.
    //this class gets the notification
public class MyFirebaseMessagingService extends FirebaseMessagingService {

    //this method occurs when we receive a message in the "foreground" - the app is visible
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d("onMessageReceived", "onMessageReceived");


    }

    //this method is fired either in both Background and Foreground
    @Override
    public void handleIntent(Intent intent) {
        super.handleIntent(intent); //don't want the default push in foreground - we customize our push
        Log.d("HandleIntent", "HandleIntent");

        /*
        // 1) Build notification using NotificationCompat.Builder
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("The Custom push");
        builder.setSmallIcon(R.drawable.ic_notification);
        builder.setContentText("The Content Text");
        builder.setAutoCancel(true);


        Intent contentIntent = new Intent(this, MainActivity.class);
        contentIntent.putExtra("name", "Haim");

        PendingIntent pi = PendingIntent.getActivities(this, 1, new Intent[]{contentIntent}, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);

        //priority
        builder.setPriority(Notification.PRIORITY_DEFAULT);
        builder.setDefaults(Notification.DEFAULT_ALL);
        //TODO: builder.setChannelID("channel1");
        //vibration, sounds, loghts
        //required permissions: wake, lock, vibrate (not dengarous permissions)

        Notification notification = builder.build();
        // 2) notify using NotificationCompatManager
        NotificationManagerCompat mgr = NotificationManagerCompat.from(this);
        mgr.notify(1, notification);

        //update a notification: mgr.notify (1, notification);
        //cancel mgr.cancel(id)
        */

    }
}
