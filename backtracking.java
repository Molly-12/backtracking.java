class Solution{
public static void printPerm(String str,String perm,int index){
if(str.length()==0){
System.out.println(perm);
return;
}
for(int i=0;i<str.length();i++){
String curr_char=str.charAt(i);
String new_str=str.substring(0,i)+str.substring(i+1);
printPerm(new_str,perm+curr_char,index+1);
}
}
public static void main(String[] args){
String str="ABC";
printPerm(str,"",0);
}
}


/*OUTPUT
ABC
ACB
BAC
BCA
CAB
CBA

IT PRINTS ALL TH POSSIBLE PERMUTAIONS OF A GIVEN STRING
*/

