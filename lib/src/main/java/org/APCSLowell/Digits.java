package org.APCSLowell;

import java.util.ArrayList;

public class Digits {
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number
     */
    public ArrayList<Integer> digits;

    /** Constructs a `Digits` object that represents `num`.
     *  *Precondition*: `num >= 0`
     */
    public Digits(int num) {
        /* To be implemented in part (a) */
        digits = new ArrayList <Integer>();
        boolean KCR = true;
        while(KCR == true){
            if(num<10){
                digits.add(0,num);
                KCR = false;
            }
            else{
                digits.add(0, num%10);
                num = num/10;
            }
        }
        
    }

    /** Returns `true` if the digits in this `Digits` object are in strictly increasing order;
     *      `false` otherwise.
     */
    public boolean isStrictlyIncreasing() {
        /* To be implemented in part (b) */
        int largest = 0;
        for(int i = 0; i<digits.size(); i++){
            if(digits.get(i) >= largest){
                largest = digits.get(i);
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
