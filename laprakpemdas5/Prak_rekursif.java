package laprakpemdas5;
import java.util.*;
public class Prak_rekursif {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    int hasil; 
    int bilangan = in.nextInt(); 
    hasil = faktorial(bilangan); 
    System.out.println("Nilai dari "+ bilangan + "! adalah " + hasil); 
    in.close();
} 

private static int faktorial(int bil){ 
    if (bil==1) 
 
    return 1; 
    else 
    return (bil * faktorial(bil-1)); 
}    
}