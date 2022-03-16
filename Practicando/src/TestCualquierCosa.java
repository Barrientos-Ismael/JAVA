import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMaximumGrossValue' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long getMaximumGrossValue(List<Integer> arr) {
        // Write your code here
        long result1,result2,result3;
        long max = Long.MIN_VALUE;
        for (int i=0; i<arr.size()-2; i++){
            result1= sum(0,i,arr);
            for (int j=i+1; j<arr.size()-1; j++){
                result2= result1 - sum(i,j,arr);
                for (int k=j+1; k<arr.size(); k++){
                    result3=result2+sum(j,k,arr)-sum(k,arr.size()+1,arr);
                    if (max<result3) max=result3;
                }
            }
        }
        return max;
    }

    public static long sum (int a, int b, List<Integer> arr){
        if (a >= b-1) return 0;
        else return (sum(a+1,b,arr) + arr.get(a));
    }

}
