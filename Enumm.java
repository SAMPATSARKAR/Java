enum Status{
    Running, Failed, Pending, Success;
}

class Enumm{
    public static void main(String a[]){
        int i=5;
        // Status[] s = Status.values();
    //     System.out.println(s);
    //     System.out.println(s.ordinal());
        // System.out.println(s[0]);
        // for(Status x:s){
        //     System.out.println(x +" : "+x.ordinal());
        // }
        Status s = Status.Pending;
        if(s == Status.Running){
            System.out.println("All Good");
        }else if(s == Status.Pending){
            System.out.println("Try again");
        }else if(s == Status.Success){
            System.out.println("Please Wait");
        }else{
            System.out.println("Done");
        }
    }
}