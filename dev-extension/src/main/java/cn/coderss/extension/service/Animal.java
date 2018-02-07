package cn.coderss.extension.service;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author shenwei
 * Created with dubbo-parent
 * Date: 2018/2/7
 * Time: 下午4:42
 */
@SPI
public interface Animal {
    void say();
}
