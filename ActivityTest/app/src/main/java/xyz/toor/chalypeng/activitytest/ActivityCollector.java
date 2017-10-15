package xyz.toor.chalypeng.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chalypeng on 2017/10/15.
 */

public class ActivityCollector {
    public static List<Activity> sActivities = new ArrayList<>();

    public static void addActivity(Activity activity){
        sActivities.add(activity);
    }

    public static void removeActivity(Activity activity){
        sActivities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity:sActivities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        sActivities.clear();
        // 杀掉当前进程，保证程序完全推出(tips:不finish 活动，直接运行这句并不会退出程序，会直接重启app)
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
