package cn.submail.sdk;

import cn.submail.sdk.config.AppConfig;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by donie on 15-3-19.
 */
public class MAILXSendTest {

    @Test
    public void testSend() {
        AppConfig config = new AppConfig();
        config.setAppId("app_id");
        config.setAppKey("app_key");
        config.setSignType("md5");
        MAILXSend submail = new MAILXSend(config);
        submail.addTo("mail_address", "name");
        submail.setProject("project_id");
        submail.addVar("username", "TestUser");
        submail.addVar("password", "123456");
        boolean res = submail.xsend();
        assertTrue(res);
    }

}
