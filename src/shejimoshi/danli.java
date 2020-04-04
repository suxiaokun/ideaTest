package shejimoshi;
class Id{
    //懒汉，要了再new
    private static Id id=null;
    private String idNo;
    private Id() {
    }
    public String getIdNo() {
        return idNo;
    }
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
    public static Id getId(){
        if (id==null){
            id=new Id();
            id.setIdNo("1224692968");
            System.out.println("单例，有身份证:"+id.getIdNo());
            return id;
        }
        else {
            System.out.println("无身份证");
        }
        return id;
    }
}
public class danli {
    public static void main(String[] args) {
        Id id;
        id=Id.getId();
    }
}
