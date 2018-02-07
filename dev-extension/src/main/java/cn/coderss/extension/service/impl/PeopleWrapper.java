package cn.coderss.extension.service.impl;

import cn.coderss.extension.service.People;
import com.alibaba.dubbo.common.URL;

/**
 * @author shenwei
 * Created with dubbo-parent
 * Date: 2018/2/7
 * Time: 下午4:40
 */
public class PeopleWrapper implements People{
    People people;

    public PeopleWrapper(People people) {
        this.people = people;
    }

    @Override
    public void say(URL url, String msg) {
        System.out.println("wrapper say");
        this.people.say(url, msg);
    }

    @Override
    public void eat(URL url, String msg) {
        System.out.println("wrapper eat");
    }
}
