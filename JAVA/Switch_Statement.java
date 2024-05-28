public class Switch_Statement {
    public static void main(String[] args) {
        int n=8;
        switch(n)
        {
            case 1: 
                    System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            case 5: System.out.println("Friday");
            case 6: System.out.println("Saturday");
            case 7: System.out.println("Sunday");
            default : System.out.println("Haha");
        }
    }
}
