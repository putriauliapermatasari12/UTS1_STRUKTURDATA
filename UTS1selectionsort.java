/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author putri
 */
public class UTS1selectionsort {
    public static void main(String[]args){
        String[]nama={"Ken S.","Syifa B.","Himmel A.","Fern S.","Eren Y.","Dimas K.","Lisya B.","Aning F.","Vilma A.","Agrin N."};
        char[]gender={'L','P','L','P','L','L','P','P','P','P'};
        int[]nilai={100,90,95,88,89,91,92,80,100,94};
         
        for(int a=0;a<nilai.length-1;a++){
           int indexMax=a;
           for(int b=a+1;b<nilai.length-1-a;b++){
               if(nilai[b]>nilai[indexMax]){
                   indexMax=b;
               }
           }
           //tukar nilai
           int tempNilai=nilai[indexMax];
           nilai[indexMax]=nilai[a];
           nilai[a]=tempNilai;
           //tukar nama
           String tempNama=nama[indexMax];
           nama[indexMax]=nama[a];
           nama[a]=tempNama;
           //tukar gender
           char tempGender=gender[indexMax];
           gender[indexMax]=gender[a];
           gender[a]=tempGender;
        }
        System.out.println("\t-----HASIL SELECTION SORT-----");
        System.out.println("==================================================");
        for(int c=0;c<nilai.length;c++){
            System.out.println("|Nama:"+nama[c]+"\t||Gender:"+gender[c]+"\t||Nilai:"+nilai[c]+"\t||");
        }
        System.out.println("==================================================");
    }
    
}
