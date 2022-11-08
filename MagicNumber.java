import java.util.*;
class MagicNumber{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
System.out.print( magicNumber(N) );


}
static int magicNumber(int N){
    int i = 0;
    while(checkNotMagic(N-i) == true && checkNotMagic(N+i) == true){
        i++;
    }

    if(checkNotMagic(N-i)==false)
        return N-i;
    else    
        return N+i;
}

static boolean checkNotMagic(int n){
    boolean seven = false;
    boolean nine = false;

    while(n>0){
        if(n%10 == 7){
            seven = true;
        }
        if(n%10 == 9){
            nine = true;
        }
        n = n/10;
    }

    if(seven && nine)
        return false;
    else 
       return true;

}



}



