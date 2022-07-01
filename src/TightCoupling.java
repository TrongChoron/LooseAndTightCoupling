/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Thu, 6/30/2022
 * Time     : 14:26
 * Filename : TightCoupling
 */
public class TightCoupling {
}

class Subject{
    Topic topic = new Topic();
    public void startReading(){
        topic.understand();
    }
}

class Topic{
    public void understand(){
        System.out.println("Tight Coupling concept");
    }
}
