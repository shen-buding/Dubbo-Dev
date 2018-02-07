package cn.coderss.extension;

import cn.coderss.extension.service.Animal;
import cn.coderss.extension.service.People;
import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.List;

/**
 * @author shenwei
 * Created with dubbo-parent
 * Date: 2018/2/7
 * Time: 下午4:36
 */
public class App {
    public static void main(String[] args) {
        People people = ExtensionLoader.getExtensionLoader(People.class).getAdaptiveExtension();
        //参数
        HashMap<String,String> map = new HashMap<String, String>();
        URL url = new URL("p1", "1.2.3.4", 1010, "path", map);
        people.say(url, "test");
        //重新构建URL
        map.put("key", "women");
        URL url2 = new URL("p1", "1.2.3.4", 1010, "path", map);
        people.say(url2, "test");

        List<Animal> animals = ExtensionLoader.getExtensionLoader(Animal.class).getActivateExtension(
                new URL("p1", "1.2.3.4.",
                        1010,
                        ImmutableMap.of("key","cat"))
                , "key", Constants.PROVIDER);
        //dog的实现类会被忽略
        for (Animal animal:animals){
            animal.say();
        }

        Animal animal = ExtensionLoader.getExtensionLoader(Animal.class).getExtension("dog");
        animal.say();
    }
}
