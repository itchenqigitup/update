package com.ycb.www.update;

import android.app.Application;

import org.xutils.common.util.LogUtil;
import org.xutils.x;

/**
 * Created by hxh on 2015/12/21.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
        LogUtil.customTagPrefix="itchen";


    }
}
