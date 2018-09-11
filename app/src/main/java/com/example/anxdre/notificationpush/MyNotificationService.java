package com.example.anxdre.notificationpush;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyNotificationService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.i("_Notify",remoteMessage.getNotification().getBody());
        Toast.makeText(this,String.valueOf(remoteMessage.getNotification().getBody()),Toast.LENGTH_SHORT).show();
    }
}
