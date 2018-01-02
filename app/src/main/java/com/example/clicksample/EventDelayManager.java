package com.example.clicksample;

/**
 * 連続Eventを防止するためのManagerクラス
 * Created by pdc-k-kamiya on 2017/12/28.
 */
public class EventDelayManager {
    public static final int DEFAULT_DELAY_TIME = 1000;

    private static int mDelayTime = DEFAULT_DELAY_TIME;
    private static long mBeforeTime;

    /**
     * 遅延時間デフォルト設定
     * @param delayTime int
     */
    public static void setDelayTime(int delayTime) {
        mDelayTime = delayTime;
    }

    /**
     * 連続Click判定
     * @return boolean
     */
    public static boolean isEvent(){
        return isEvent(mDelayTime);
    }

    /**
     * 連続Click判定
     * @param delayTime int ms
     * @return boolean
     */
    public static boolean isEvent(int delayTime){
        long time = System.currentTimeMillis();
        if (time - mBeforeTime < delayTime) {
            return false;
        }
        mBeforeTime = time;
        return true;
    }

}
