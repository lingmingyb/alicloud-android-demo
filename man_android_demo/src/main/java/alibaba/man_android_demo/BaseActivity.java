package alibaba.man_android_demo;

import android.app.Activity;
import android.os.Bundle;

import com.alibaba.sdk.android.AlibabaSDK;
import com.alibaba.sdk.android.man.MANService;

/**
 * Created by LK on 16/1/30.
 * 手动页面埋点Activity基类，见文档4.2.1
 */
public class BaseActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MANService manService = AlibabaSDK.getService(MANService.class);
        manService.getMANPageHitHelper().pageAppear(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MANService manService = AlibabaSDK.getService(MANService.class);
        manService.getMANPageHitHelper().pageDisAppear(this);
    }
}
