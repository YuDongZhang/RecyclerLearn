package com.example.pateo.recyclerlearn.utill;

/**
 * Created by pateo on 18-11-29.
 */
public class Log {
    public static final String TAG = "RecyclerLearn";
    public static final boolean IS_PRINT_LOG = true;

    public Log() {
    }

    public static void v(String tag, String msg) {
        android.util.Log.v("RecyclerLearn", "------" + tag + "---------" + msg);
    }

    public static void d(String tag, String msg) {
        android.util.Log.v("RecyclerLearn", "------" + tag + "---------" + msg);
    }

    public static void w(String tag, String msg) {
        android.util.Log.v("RecyclerLearn", "------" + tag + "---------" + msg);
    }

    public static void e(String tag, String msg) {
        android.util.Log.v("RecyclerLearn", "------" + tag + "---------" + msg);
    }

    public static void e(String tag, String msg, Throwable e) {
        android.util.Log.v("FotonVehicle", "------" + tag + "---------" + msg);
    }
}

