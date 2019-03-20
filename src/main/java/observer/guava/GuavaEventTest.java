package observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {

    public static void main(String[] args) {

        //消息总线
        EventBus bus = new EventBus();
        GPer gper = new GPer();
        Teacher teacher = new Teacher("Tom");
        Question question = new Question(teacher , "小明" , "观察者模式适用场景");

        bus.register(gper);
        bus.post(question);
    }
}
