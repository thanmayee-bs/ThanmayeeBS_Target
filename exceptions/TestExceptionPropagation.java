package exceptions;
import java.io.IOException;


class TestExceptionPropagation{
void m()throws IOException {
    int  c = 10 +  20;

    throw new java.io.IOException("device error");//checked exception
}
void n()  throws IOException{

    m();
}
void p(){
    try{
        n();
    }catch(Exception e){System.out.println("exception handeled");}
}
public static void main(String args[]){
    TestExceptionPropagation obj=new TestExceptionPropagation();
    obj.p();
    System.out.println("normal flow");
}
}