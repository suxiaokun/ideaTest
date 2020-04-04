package suanfa;

public class Test {
    public static void main(String[] args) {
        Person xiaoming=new Person();
        xiaoming.look(new xuanhuanBook());
        xiaoming.look(new lishiBook());
    }
}
class Person{
    public void look(IBook iBook){
        iBook.look();
    }
}
interface IBook {
    public void look();
}
class xuanhuanBook implements IBook{

    @Override
    public void look() {
        System.out.println("看玄幻小说");
    }
}
class lishiBook implements IBook{

    @Override
    public void look() {
        System.out.println("看历史小说");
    }
}