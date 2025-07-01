// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*
1
2 # 2
3 # 3 # 3
4 # 4 # 4 # 4
5 # 5 # 5 # 5 # 5
5 # 5 # 5 # 5 # 5
4 # 4 # 4 # 4
3 # 3 # 3
2 # 2
1

*/





class Main {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++) {
            for (int j=1; j<=i; j++)  {
                if(j>1)  {
                    System.out.print(" # ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        
         for(int i=5; i>=1;i--) {
            for (int j=1; j<=i; j++)  {
                if(j>1)  {
                    System.out.print(" # ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        
        
    }
}