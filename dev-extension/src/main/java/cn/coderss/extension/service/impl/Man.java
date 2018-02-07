package cn.coderss.extension.service.impl;

import cn.coderss.extension.service.People;
import com.alibaba.dubbo.common.URL;

/**
 * @author shenwei
 * Created with dubbo-parent
 * Date: 2018/2/7
 * Time: 下午4:36
 */
public class Man implements People {
    @Override
    public void say(URL url, String msg) {
        System.out.println("man say " + msg);
    }
    @Override
    public void eat(URL url, String msg) {
        System.out.println("man eat " + msg);
    }
}
