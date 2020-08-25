/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author mduduzi
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sa[]={6,76,54,3,54,23,6,98,64,35,3,2,52,1};
        ss(sa);
        print(sa);
    }
    //selection takes the small value to the small index, then start agein
    public static int[] ss(int []b){
        for(int i=0;i<b.length-1;i++){
            //minimum value
            int min=i;
            for(int v=i+1;v<b.length;v++){
               //check if the current value is small than the last small value
                if(b[v]<b[min]){
                    //if current valu is less than last small value we assign current as small
                    min=v;
                    int temp=b[min];
                    b[min]=b[i];
                    b[i]=temp;
                }
            }
        }
        return b;
    }
    public static void print(int li[]){
        for(int v=0;v<li.length;v++){
            System.out.println(li[v]);
        }
    }
}
