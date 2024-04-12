package S8_OPPS;

public class S1_opps {
    public static void main(String args[])
    {
        pen p1=new pen();
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);   
        
        BankAccount b=new BankAccount();
        b.username="kashis";
        b.setPassword("123");
    }
    
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}

class pen {
    String color;
    int tip;

    void setcolor(String newcolor)
    {
        color=newcolor;
    }

     void settip(int newtip)
    {
        tip=newtip;
    }
}