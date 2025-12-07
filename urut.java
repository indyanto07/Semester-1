package TugasSelainLaprak;


public class urut {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int [] angka = {78,90,65,88,72,60};

        for (int i=0;i<angka.length;i++){
            for (int j = 0; j < angka.length - 1; j++) {
        if (angka[j] > angka[j+1]) {
            int terkecil = angka[j];
            angka[j] = angka[j+1];
            angka[j+1] = terkecil;
        }
    }
}
            // if (angka[i]<angka[i+1]){
            //     int terkecil = angka[i];
            //     angka[i]=angka[i+1];
            //     angka[i+1]=terkecil;
                
            // }
        
        for(int a :angka){
            System.out.print(a +" ");
        }

        }
}
