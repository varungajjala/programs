import java.util.*;

public class gcd{

	public static int findGcd(int a, int b){
		if( a == 0 && b == 0){
			return 0;
		}else if(  a == 0 ){
			return b;
		}else if (b == 0){
			return a;
		}else if(a == b){
			return a;
		}else if( (a & 1) == 0 && (b & 1) == 0){
			return findGcd (a >>1, b>> 1) << 1;
		}else if( ( a & 1 ) == 0){
			return findGcd( a>>1 , b );
		}else if( ( b & 1 ) == 0){
			return findGcd( a , b>>1 );
		}else if(a >= b){
			return findGcd( (a-b) >> 1, b);
		}else {
			return findGcd( a , (b-a) >> 1);
		}

	}
	public static void main(String args[]){
		System.out.println(findGcd(54,24));
		System.out.println(findGcd(0,24));
		System.out.println(findGcd(54,0));
		System.out.println(findGcd(0,0));
		System.out.println(findGcd(13,7));
		System.out.println(8 >> 1);
	}
}
	
