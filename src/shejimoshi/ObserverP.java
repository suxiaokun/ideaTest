package shejimoshi;


import java.util.List;
import java.util.ArrayList;

public class ObserverP {
    public static void main(String[] args) {
        whatherStation subject = new whatherStation();
        new whatherAPP(subject);
        new NewWeb(subject);
        System.out.println("发送天气信息");
        subject.setMsg("今天天气多云");
    }
}
class whatherStation{
    private List<Observer> observers = new ArrayList<Observer>();;
    private String msg;
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyAllObservers();
    }
}
abstract class Observer{
    protected whatherStation subject;
    public abstract void update();
}
class whatherAPP extends Observer {
    public whatherAPP(whatherStation subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "天气APP: "
                + subject.getMsg() );
    }
}
class NewWeb extends Observer {
    public NewWeb(whatherStation subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "天气网站: "
                + subject.getMsg() );
    }
}