package com.example.android.pushfirebaseexample.FCM;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;



public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = MyFirebaseMessagingService.class.getSimpleName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
//        Toast.makeText(MyFirebaseMessagingService.this,"onMessageReceived",Toast.LENGTH_SHORT).show();

        if (remoteMessage == null)
            return;

        Log.d(TAG, "onMessageReceived:");
        Log.e(TAG, "From: " + remoteMessage.getFrom());//4103456745464
        if (remoteMessage.getData().size() > 0)
            Log.e(TAG, "getData: " + remoteMessage.getData().toString());

        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Notification Body: " + remoteMessage.getNotification().getBody());
        }

//        {"key2":"456","key1":"123"}

    }


}
