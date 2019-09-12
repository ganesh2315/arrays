package com.company;

public class Main {

    public static void main(String[] args) {
	   int[] arrInts={2,4,5,8};
	   String[] arrString={"Ganesh","Aparna","Apu","Diya","Pradip","Sonali"};
	   boolean[] arrbools={true,false,true,false};
	   int[] newarray=new int[4];

	   newarray[0]=12;
	   newarray[1]=13;
	   newarray[2]=45;
	   newarray[3]=23;

	   for (int i=0; i< arrInts.length; i++)
       {
           System.out.println("item:"+arrInts[i]);
       }
	   for (int i=0;i<arrString.length;i++)
       {
           System.out.println("my siblings:"+arrString[i]);
       }
	   for (int i=0;i<arrbools.length;i++){
           System.out.println("Output:"+arrbools[i]);

       }
	   for (int i=0;i<newarray.length;i++){
           System.out.println("new Item:"+newarray[i]);
       }
        System.out.println("elements:"+arrInts[0]);

    }
}
