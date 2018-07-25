package org.tiny.spring.core.util;

/**
 * Created by LiuYi on 2018/7/19 14:02
 */
public abstract class TinyStringUtil {

    /**
     * 将首字母转换为小写
     * @param name
     * @return
     */
    public static String captureName(String name) {
        name = name.substring(0, 1).toLowerCase() + name.substring(1);
        return  name;
    }

    public static void main(String[] args){
        System.out.print("\n\n");
        System.out.print(captureName("ABc"));
        System.out.print("\n\n");
    }
}