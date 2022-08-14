class Thread1 implements Runnable {
    public void run(){
        System.out.println("Hello India");
    }
}

class Thread2 implements Runnable{
    public void run(){
        System.out.println("Hello India");
    }
}

class Thread3 implements Runnable{
    public void run(){
        System.out.println("Hello India");
    }
}

class Thread4 implements Runnable{
    public void run(){
        System.out.println("Hello India");
    }
}

class Thread5 implements Runnable{
    public void run(){
        System.out.println("Hello India");
    }
}
public class ThreadingMulti {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        Thread4 t4=new Thread4();
        Thread5 t5=new Thread5();

        Thread c1=new Thread(t1);
        Thread c2=new Thread(t2);
        Thread c3=new Thread(t3);
        Thread c4=new Thread(t4);
        Thread c5=new Thread(t5);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
