package cn.coderss.extension.service;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author shenwei
 * Created with dubbo-parent
 * Date: 2018/2/7
 * Time: 下午4:36
 */
@SPI("man")
public interface People {
    @Adaptive({"key"})
    public void say(URL url, String msg);

    @Adaptive({"key"})
    public void eat(URL url, String msg);
}

