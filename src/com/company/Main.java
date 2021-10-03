package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	double[] array = {2.1,3.2,-4.1,-1.1,-2.5,3.3,4.7,1.3,2.8,-2.4,-1.9,-4.6,5.2,4.3,-1.1};
	for (int i= 0; i< array.length - 1; i++) {
        System.out.println(Arrays.toString(array));
        for (int j = array.length -1; j >i; j--) {
            if (array[j-1] > array[j]) {
                double tmpValue = array[j-1];
                array[j-1] =array[j];
                array[j] = tmpValue;
            }
        }
    }
    double numValuue = 0.0;
	int intValue = 0;
	boolean value = false;

	for (double diob: array) {
        if (diob < 0) {
            value = true;
        } else if (value) {
            numValuue += diob;
            intValue++;
        }
    }
	double ty = numValuue / intValue;
        System.out.println("/Среднее арифметическое положительных числ:" + ty);
    }
}
