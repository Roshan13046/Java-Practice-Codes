package com.roshan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
/*IMP :
1)array are group of elements having same data type stored in coninuous memory lov=cations
2)delaration : int []a;
3)initialization : a=new int [no of elements]; or a= {1,2,3,4,5,}
4)default values in array is = 0
5)default values in String array is null;
 */



    private static Scanner scanner = new Scanner(System.in);
    private static int [] baseData = new int[10];          //BEFORE RESIZING THE ARRAY SIZE IS !0
    public static void main(String[] args) {
/*
	    int [] a = new int[30];
	    int [] b ;
        b = new int[494];
        long [] c = {1,2,4,5,5,6,7};
        System.out.println(c[0]+" " + c[1] + " " + c[2] + c[6]);
        double [] d =new double[33];
        System.out.println(d[3]);

        int n=199;
        String [] s = new String[n];
        s[0]="vklkhdfjh";
        s[3]="d;lf;";
        s[198]="lkfkn";
        System.out.println(s[2]);

        int [] temp =new int [10];
        for(int i=0;i<temp.length;i++)
            System.out.println("The Array value temp[ "+(i+1)+"] is "+temp[i]);

        //recieving an array from method
       // int [] demo = getArray(10);

        //passing an array to a function
    //    passArray(demo);

        //********************************************   CHALLENGE   *************************************************************
        System.out.println("\n\n *****************ARRAY SORTING CHALLENGE **************************\n\n");
        System.out.print("Enter how many numbers to eners : ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int noOfElements = scanner.nextInt() ;
            int []array = getArray(noOfElements);
            quickSort(array,0,noOfElements-1);
            printArray(array);
        }else{
            System.out.println(" INVALID NUMBER ");
        }

/*****************************************cHALLLENGE COMPLETED**********/

/* learning Value types and Reference types*********/

        int myIntValue = 5;
        int anotherIntValue = myIntValue;
        System.out.println("myIntvalue : " +myIntValue);
        System.out.println("anotherIntValue : "+anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntvalue : " +myIntValue);
        System.out.println("Afetr changes anotherIntValue : "+anotherIntValue);

        int [] myIntArray = new int [5] ;
        int [] anotherArray = myIntArray;

        System.out.println("myIntArray : "+ Arrays.toString(myIntArray));//Array.toString( "Array name"); it prints the whole array once with spaces in between
        System.out.println("myAnotherArray : "+Arrays.toString(anotherArray));

        //after some change in refernce array
        anotherArray[0]=111;
        System.out.println("After Change myIntArray : "+ Arrays.toString(myIntArray));//Array.toString( "Array name"); it prints the whole array once with spaces in between
        System.out.println("After Change myAnotherArray : "+Arrays.toString(anotherArray));

        //passing of array as parameter are always by refernce variables
        modifyArray(myIntArray);
        System.out.println("After Change myIntArray : "+ Arrays.toString(myIntArray));//Array.toString( "Array name"); it prints the whole array once with spaces in between
        System.out.println("After Change myAnotherArray : "+Arrays.toString(anotherArray));

        myIntArray = new int[]{11,12,13,14,15};
        System.out.println("After Change myIntArray : "+ Arrays.toString(myIntArray));//Array.toString( "Array name"); it prints the whole array once with spaces in between
        System.out.println("After Change myAnotherArray : "+Arrays.toString(anotherArray));


        /********************************************MINIMUM ELEMENT CHALLENGE*************************************************************/
        System.out.print("\n\n***************** CHALLENGE 2 *************\n\nEnter the count : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int []array = readIntegers(count);
        System.out.println("The MIN ELEMENT OF ARRAY IS : "+findMin(array));

        /***************************CHALLENGE REVERSE ARRAY *************/
        System.out.print("\n\n***************** CHALLENGE 3 *************\n\nEnter the count : ");
        count = scanner.nextInt();
        scanner.nextLine();
         array = readIntegers(count);
        findReverse(array);
        System.out.println("The REVERSE OF ARRAY IS : " + Arrays.toString(array));

        //****************************  ARRAY RESIZE CONCEPT  ******************************************/
        System.out.println("****************************  ARRAY RESIZE CONCEPT  ******************************************");

        baseData = getArray(10);
        System.out.println("Before resize of array : "+ Arrays.toString(baseData));
        baseData = resizeArray(baseData);
        System.out.println("After resize of array : "+ Arrays.toString(baseData));
    }


    public static int[] getArray(int n){
        int []temp = new int [n];
        for(int i = 0 ; i<temp.length ;) {
            System.out.print("Enter element "+(i+1)+ " : ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                temp[i] = scanner.nextInt();
                i++;
            }else{
                System.out.println("INVALID INPUT");
            }
            scanner.nextLine();
        }
        return temp;
    }

    public  static void passArray(int []temp){
        System.out.println("The passed array is :");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i] + " ");
        }
    }

    //**************************** Challenge 1 **********************/
    public static void printArray(int []a){
        System.out.print("The Arrray elements are : ");
        for(int i=0; i<a.length ;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println(" ");
    }

    public static int partition(int []a ,int low ,int high ){

        int i=low,j=high;
        int pivot=a[low],temp ;

        do{
            do{
                    i++;
            }while(a[i]<= pivot);
            do{
                    j--;
            }while(a[j] > pivot);
            if(i<j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }while(i < j);

        temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j;
    }

    public static void quickSort(int []a , int low ,int high){
        int j;
        if( low < high){
            j = partition(a , low ,high);
            quickSort(a , low , j);
            quickSort(a,j+1,high);
        }
    }



/*****************VALUE AND REFERENCE VARAIABLE ************************/
    private static  void modifyArray(int []array){ //array are passes by references always
        array[0] = 3333;
        array = new int[] {1,2,3,4,5};

        System.out.println("After Change myIntArray : "+ Arrays.toString(array));//Array.toString( "Array name"); it prints the whole array once with spaces in between
    }

    //************Find MIN Chalenge ***********//

    public static int[] readIntegers(int count){
        int[]array = new int [count];
        for(int i=0;i<count;i++){
            System.out.print("Enter Array Element "+ (i+1)+" : ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array ;
    }

    public static int findMin(int []array){
        int minElement  = Integer.MAX_VALUE;
        for(int i=0 ;i<array.length ; i++){
            minElement = minElement < array[i] ? minElement : array[i] ;
        }
        return minElement;
    }

    public static void findReverse(int []array){
        int temp;
        for(int i=0;i<array.length / 2 ;i++){
            temp = array[i];
            array[i] = array[array.length - 1 -  i];
            array[array.length - 1 -  i] = temp ;
        }
    }
//********************************************************** ARRAY RESIZE CONCEPT *********************************************************************/

    private  static int[] resizeArray(int[] baseArray){
        int []tempArray = baseArray;
        baseArray = new int [20];        //Resizing to size of 20 elements
        for(int i=0 ;i<tempArray.length;i++){
            baseArray[i] = tempArray[i];
        }
        return baseArray;
    }


}
