package observer.guava;

public class Question {

    private Teacher teacher;

    private String userName;

    private String content;

    public Question(Teacher teacher, String userName, String content) {
        this.teacher = teacher;
        this.userName = userName;
        this.content = content;
    }

    public String getUserName(){
        return this.userName;
    }
    public String getContent(){
        return this.content;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setContent(String content){
        this.content = content;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
}
