/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author putri
 */
public class UTS1insertionsort {
    public static void main(String[]args){
        String[]nama={"Ken S.","Syifa B.","Himmel A.","Fern S.","Eren Y.","Dimas K.","Lisya B.","Aning F.","Vilma A.","Agrin N."};
        char[]gender={'L','P','L','P','L','L','P','P','P','P'};
        int[]nilai={100,90,95,88,89,91,92,80,100,94};
        
        for (int a=1;a<nilai.length;a++){
            
            String tempNama=nama[a];
            char tempGender=gender[a];
            int tempNilai=nilai[a];
            
            int b=a-1;
            while(b>0 && nilai[b]<tempNilai){
                nama[b+1]=nama[b];
                gender[b+1]=gender[b];
                 nilai[b+1]=nilai[b];
                 b=b-1;
            }
            //masukkan data ke posisi yang tepat
            nama[b+1]=tempNama;
            gender[b+1]=tempGender;
            nilai[b+1]=tempNilai;
        }
        System.out.println("\t-----HASIL INSERTION SORT-----");
        System.out.println("==================================================");
        for (int c=0;c<nilai.length;c++){
            System.out.println("|Nama:"+nama[c]+"\t||Gender:"+gender[c]+"\t||Nilai:"+nilai[c]+"\t||");
        }
        System.out.println("==================================================");
    }
    
}
