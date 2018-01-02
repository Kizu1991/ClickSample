package com.example.clicksample;

import android.view.View;

/**
 * OnClickListenerの拡張クラス
 * abstractで定義
 * Created by pdc-k-kamiya on 2017/12/28.
 */
public abstract class OnDelayClickListener implements View.OnClickListener {

    /**
     * ClickEventCallback
     * @param v {@link View}
     */
    abstract void onDelayClick(View v);

    /**
     * コンストラクタ
     */
    public OnDelayClickListener(){
        this(EventDelayManager.DEFAULT_DELAY_TIME);
    }

    /**
     * コンストラクタ
     * @param delayTime int delayTime ms
     */
    public OnDelayClickListener(int delayTime) {
        EventDelayManager.setDelayTime(delayTime);
    }

    @Override
    public void onClick(View v) {
        if(EventDelayManager.isEvent()){
            onDelayClick(v);
        }
    }
}
