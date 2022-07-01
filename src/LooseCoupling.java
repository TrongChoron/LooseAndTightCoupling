/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Thu, 6/30/2022
 * Time     : 14:28
 * Filename : LooseCoupling
 */
public class LooseCoupling {
    public static void example(){
        TopicLooseCoupling topic1 = new Topic1();
        topic1.understand();
        TopicLooseCoupling topic2 = new Topic2();
        topic2.understand();
    }
}

interface TopicLooseCoupling {
    void understand();
}
class Topic1 implements TopicLooseCoupling{

    @Override
    public void understand() {
        System.out.println("Got it");
    }
}
class Topic2 implements TopicLooseCoupling{

    @Override
    public void understand() {
        System.out.println("understand");
    }
}
