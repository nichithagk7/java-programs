class Time
{
    int h,m,s;
    Time()
    {
        h=0;
        m=0;
        s=0;
    }
    Time(int sec)
    {
        h=sec/3600;
        m=(sec%3600)/60;
        s=sec%60;
    }
    Time(int hours,int minutes,int seconds)
    {
        h=hours;
        m=minutes;
        s=seconds;
    }
    void display()
    {
        System.out.println(h+"hours"+m+"minutes"+s+"seconds");
    }
    public static void main(String args[])
    {
        Time t1=new Time();
        Time t2=new Time(3665);
        Time t3=new Time(2,30,45);
        t1.display();
        t2.display();
        t3.display();
    }
}

