package cn.coderss.extension.service.impl;

import cn.coderss.extension.service.Animal;
import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;

/**
 * @author shenwei
 * Created with dubbo-parent
 * Date: 2018/2/7
 * Time: 下午4:43
 */
@Activate(group = Constants.PROVIDER,value = "cat")
public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("cat say");
    }
}