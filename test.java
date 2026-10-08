/*
* * * *
* * * *
* * * *
* * * *
*/


  
  /*class test{
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }  

  }*/

   /*class test{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }  

  }
*/
//  
        
//   class test{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("* ");
//             }
            
//             System.out.println();
//         }
//     }  

//   }
// class test{
//     public static void main(String args[]){
//      int n=5;
//      for (int i=1;i<=n;i++){
//          for(int j=1;j<=i;j++){
//              System.out.print(j);

//          }
//          System.out.println();
//      }

//   }  
// }
// 
//  
 
//  0
//  0 1
//  1 0 1
//  0 1 0 1
//   
 class test {
    public static void main(String[] args) {
        // Shape 1: Triangle ▲
        int rows = 5;
        System.out.println("Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("▲ ");
            }
            System.out.println();
        }

        // Shape 2: Square ■
        int size = 5;
        System.out.println("\nSquare:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("■ ");
            }
            System.out.println();
        }

        // Shape 3: Rectangle ▬
        int width = 8;
        int height = 4;
        System.out.println("\nRectangle:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("▬ ");
            }
            System.out.println();
        }
    }
}


   
