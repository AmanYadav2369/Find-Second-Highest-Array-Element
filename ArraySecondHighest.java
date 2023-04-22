/* wajp to find second highest array elements  */

import java.io.*;
import java.util.*;
class ArraySecondHighest
{
public static void main(String args[])
{
int num[]={45,25,65,85,75,95};

for(int i=0; i<num.length; i++){
System.out.print(num[i]+" ");
}

Arrays.sort(num);

for(int i=0; i<num.length; i++){
if(i==num.length-2){
System.out.println("\n second highest element is "+num[i]);
}
}

}
}