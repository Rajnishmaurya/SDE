// Object Oriented Programming
//Object - Properties and Behaviours
// Class

class Computer
{
    int num=5;
    public void playMusic()
    {
        System.out.println("Music playing..");

    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
        return "Pen";
        else
        return "Nothing phone";
    }
}

public class Oops
{
    public static void main(String[] args) {
        Computer obj=new Computer();    // obj is a reference variable
        obj.playMusic();
        String str=obj.getMeAPen(02);
        System.out.println(str);
        System.out.println(obj.num);
    }
}