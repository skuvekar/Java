class Vowel_consonant{
    public static void main(String[] args){
        char c = 'p';

//a switch case does not accept any conditions as a case label. Also you cannot write the if-else dms structure within the case block.

        switch (c){
            case 'a':
              //if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                System.out.println(c+" is a Vowel");
              //}
            break;
            case'e':
            case'E':
            case'i':
            case'I':
            case'o':
            case'O':
            case'u':
            case'U':
                System.out.println(c+" is a vowel.");
                break;
                
            default:
            System.out.println(c+" is a consonant");
            break;
        }
    }
}