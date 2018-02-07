package cn.coderss.extension.service.impl;

import cn.coderss.extension.service.People;
import com.alibaba.dubbo.common.URL;

/**
 * @author shenwei
 * Created with dubbo-parent
 * Date: 2018/2/7
 * Time: 下午4:38
 */
public class Women implements People {
    @Override
    public void say(URL url, String msg) {
        System.out.println("woman say " + msg);
    }
    @Override
    public void eat(URL url, String msg) {
        System.out.println("woman eat " + msg);
    }
}
