package com.wjustudio.servicedialog;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * 作者：songwenju on 2016/3/22 22:24
 * 邮箱：songwenju01@163.com
 */
public class DialogService extends Service {
    private Context mContext;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // 获取应用的Context
        mContext = this.getApplicationContext();

        String type = intent.getStringExtra("type");
        if (type.equals("progress")){
            showProgress();
        }else {
            showDialog();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    private void showDialog() {
        WindowUtils.showPopupWindow(mContext,R.layout.item_dialog);
    }

    private void showProgress() {
        WindowUtils.showPopupWindow(mContext,R.layout.item_progress);
    }
}
