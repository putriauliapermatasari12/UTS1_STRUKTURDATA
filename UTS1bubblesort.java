/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author putri
 */
public class UTS1bubblesort {
    public static void main(String[]args){
        String[]nama={"Ken S.","Syifa B.","Himmel A.","Fern S.","Eren Y.","Dimas K.","Lisya B.","Aning F.","Vilma A.","Agrin N."  };
        char[]gender={'L','P','L','P','L','L','P','P','P','P'};
        int[]nilai={100,90,95,88,89,91,92,80,100,94};
        for(int a=0;a<nilai.length-1;a++){
            for(int b=0;b<nilai.length-1-a;b++){
                if(nilai[b]<nilai[b+1]){
                    //tukar nilai
                    int tempNilai=nilai[b];
                    nilai[b]=nilai[b+1];
                    nilai[b+1]=tempNilai;
                    //tukar nama
                    String tempNama=nama[b];
                    nama[b]=nama[b+1];
                    nama[b+1]=tempNama;
                    //tukar gender
                    char tempGender=gender[b];
                    gender[b]=gender[b+1];
                    gender[b+1]=tempGender;
                }
            }
        }
        System.out.println("\t-----HASIL BUBBLE SORT-----");
        System.out.println("==================================================");
        for(int a=0;a<nilai.length;a++){
            System.out.println("|Nama:"+nama[a]+"\t||Gender:"+gender[a]+"\t||Nilai:"+nilai[a]+"\t||");
        }
        System.out.println("==================================================");
    }
    
}
