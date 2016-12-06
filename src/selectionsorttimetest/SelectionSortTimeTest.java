/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selectionsorttimetest;

import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author nohin6777
 */
public class SelectionSortTimeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("##.##########");
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("How many numbers?: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        
        for(int k = 0; k < n; k++){
            int rand = (int)(Math.random() * (10 - 1) + 1);
            nums[k] = rand;
            }
        
        int min;
        long startTime = System.nanoTime();
        for(int i = 0; i < nums.length; i++){
            min = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            
            if(min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        
        long endTime = System.nanoTime();
        double duration = endTime - startTime;
        System.out.println(Arrays.toString(nums));
        System.out.println("\n" + formatter.format(duration/1000000000) + " seconds");
    }
    }
    

