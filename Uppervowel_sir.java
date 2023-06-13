class Uppervowel_sir{
    public static void main(String[] args){
        char ch='i';
    if(ch>='A'&& ch<='Z'){
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Uppercase vowel");
        }
        else{
            System.out.println("Uppercase consonant");
        }
    }
    else if(ch>='a'&& ch<='z'){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("lowercase vowel");
        }
        else{
            System.out.println("lowercase consonant");
        }
    }
    else if(ch>='0'&& ch<='9'){
        System.out.println("number");
    }
    else{
        System.out.println("special character");
    }
}
}