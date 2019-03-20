package observer.guava;

import com.google.common.eventbus.Subscribe;

public class GPer {

    private String name = "咕泡生态圈";

    @Subscribe
    public void subscribe(Question question){
        System.out.println(question.getTeacher().getName()+ "老师，您好，您收到一个来自"
                + this.name  + "问题内容是：" + question.getContent()
                + "提问者：" + question.getUserName());
    }
}
