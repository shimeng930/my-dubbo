import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @类描述：
 * @创建人：xn064961
 * @创建时间：2017/4/11
 * @版权：Copyright (c) 深圳市牛鼎丰科技有限公司-版权所有.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "provider.xml" });

        context.start();
        System.out.println("按任意键退出");
        System.in.read();

    }
}
