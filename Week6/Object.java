class Count{
    static int c=0;
    Count(){
        c++;
    }
    int num(){
        return c;
    }

}
public class Object {
    public static void main(String[] args) {
       Count c1=new Count();
       Count c2=new Count();
       Count c3=new Count(); 
       System.out.println(c1.num());
    }
}
