class Divisibleby4_3{
    public static void main(String[] args){
        int a=17, b=3;
        if(a%4==0&&a%3==0){
            System.out.println("Variable 'a'is Divisible by both 4 and 3");
            System.out.println(a+b);
        }
        else{
            System.out.println("Variable 'a' is not Divisible by both 4 and 3");
            System.out.println(a-b);
        }



    }
}