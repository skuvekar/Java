class Divisibleby3_7{
    public static void main(String[] args){
        int a=67;
        if(a%3==0 && a%7==0){
            System.out.println(a+" is divisible by 3 and 7");
        }
        else if(a%3==0){
            System.out.println(a+" is divisble by 3 only");
        }
        else if(a%7==0){
            System.out.println(a+" is divisible by 7 only.");
        }
        else{
            System.out.println("Not divisible by 3 and 7.");
        }
    }
}
