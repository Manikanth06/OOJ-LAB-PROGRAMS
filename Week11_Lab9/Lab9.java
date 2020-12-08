class Thread5 implements Runnable {
    String name;
    Thread t;
    int time;
    Thread5(String threadname,int time) {
    name = threadname;
    this.time=time;
    t = new Thread(this, name);
    System.out.println("thread:"+ t);
    t.start(); 
    }
    public void run() {
    try {
    for(int i = 7; i > 0; i--) {
    System.out.println(name);
    Thread.sleep(time);
    }
    } catch (InterruptedException e) {
    System.out.println(name + "Interrupted");
    }
    System.out.println(name + " exiting.");
    }
    }
    class Lab9{
    public static void main(String args[]) {
    Thread5 t1=new Thread5("BMS COLLEGE OF ENGINEERING",10000);
    Thread5 t2=new Thread5("COMPUTER SCIENCE & ENGINEERING",2000);
    }
    }