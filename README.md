<h1>Loose And Tight Coupling</h1>

<h2>In this application, I use Spring to fix Tight Coupling</h2>

<h2>I have three class about Tight Coupling</h2>

```JAVA
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
```

<h2>After use Spring to fix it.</h2>

```JAVA
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
```

<h2>In the fixing, i use an interface declare a method understand.
And then create two class implement this method. So the code is reduced dependencies.
When you want to change, you only change the code in the class has implemented by the interface.</h2>