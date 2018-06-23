import java.util.ArrayList;
import java.util.Scanner;

public class NameSplit {

public static void main( String[] args )
{


@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in); 
System.out.println("enter Fisrt Name");
String firstName= sc.nextLine();
System.out.println("enter last name");
String secondName= sc.nextLine();
char[] fname = firstName.toCharArray(); 
char[] sname = secondName.toCharArray();


char[] result = new char[fname.length + sname.length];
int j=0,k=0;
for(int i= 0;i<result.length;)  {
if(j<fname.length){
result[i++] =fname[j++];

}
if(k<sname.length){
result[i++] =sname[k++];
}
}
for(int i= 0;i<result.length ;i=i+2){

System.out.print(result[i]);
System.out.print(result[i+1] + " ");


}


}
}
