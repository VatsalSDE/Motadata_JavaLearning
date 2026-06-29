class Payment{
    void process(){
        System.out.println("Processing general payment");
    }
}

class creditCard extends Payment{

    @Override
    void process(){
        System.out.println("Processing Credit Card Payment");
    }
}

class onlinePayment extends Payment{
    
    @Override
    void process(){
        System.out.println("Processing the online payment");
    }
}

public class overriding {
    public static void main(String[] args) {
        Payment p ;
        p=new creditCard();
        p.process();

        p=new onlinePayment();
        p.process();
    }
}
