
/*pattern program digit
1        1
12      21
123    321
1234  4321
1234554321 

*/




class Pattern18{
public static void main(String args[]) {
int i,j,k;
for (i=1;i<=5;i++) {
for (j=1;j<=5;j++) {
if(j<=i)
System.out.print(j);
else
System.out.print(" ");
}
for (j=5;j>=1;j--) {
if(j<=i)
System.out.print(j);
else
System.out.print(" ");
}
System.out.print("\n");
}
}
}