package observer.guava;

import observer.gper.GPer;
import observer.gper.Question;

import java.util.Observable;
import java.util.Observer;

public class Teacher {

    private String name;

    public Teacher(){}

    public Teacher(String name)
    {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
