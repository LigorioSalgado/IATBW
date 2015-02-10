package com.example.devf.pushnoti;

/**
 * Created by ligorioedwin on 07/02/2015.
 */
public interface Config {



        // used to share GCM regId with application server - using php app server
        static final String APP_SERVER_URL = "http://192.168.1.71/iatb/push.php";

        // GCM server using java
        // static final String APP_SERVER_URL =
        // "http://192.168.1.17:8080/GCM-App-Server/GCMNotification?shareRegId=1";

        // Google Project Number
        static final String GOOGLE_PROJECT_ID = "989898191021";
        static final String MESSAGE_KEY = "message";

    }


