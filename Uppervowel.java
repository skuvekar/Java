class Uppervowel{
    public static void main(String[] args){
        char ch='9';
        
        if(Character.isUpperCase(ch)){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.println("Uppercase Vowel");
            }
            else{
                System.out.println("Uppercase consonant.");
            }
            
        }
        else if(Character.isLowerCase(ch)){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Lowercase vowel");
            }
            else{
                System.out.println("Lowercase consonant");
            }
        }
        else if(Character.isDigit(ch)){
            System.out.println("It is a number.");
        }
        else{
            System.out.println("Special character.");
        }
    }
}
