package top.anlythree.test.hashmap;

import javax.annotation.Resource;

/**
 *  Resource注解测试
 * @author wangli
 * @date 2020/7/27 9:02
 */
public class ResourceTest {

    @Resource
    private static HashMapTest hashMapTest;


    public static void main(String[] args) {
        hashMapTest.testPrint();
    }

}
