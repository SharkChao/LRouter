package com.lenovohit.lrouter_api.core;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * 本地路由服务
 * Created by yuzhijun on 2017/5/27.
 */
public class LocalRouterService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
