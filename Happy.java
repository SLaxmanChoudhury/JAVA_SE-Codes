public class Happy
{
    public static void main(String[] args)
    {
        int n = 10;

        
          for(int k=0; k<=3;k++)
          {
            System.out.println();
          }

          
         
           
        for(int i=0;i<n; i++)
        {

//Space
               for(int j=0; j<1; j++)
            {
                 
                    System.out.print(" ");
                
            }
            System.out.print(" ");
              for(int k=0; k<=10;k++)
          {
            System.out.print(" ");
          }
            
           
            //H
            for(int j=0; j<n; j++)
            {
                 if(j==0 || j==(n-1) || i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
            System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                //A
                if(j==0 && i>0 || i==0 && j>0 && j<n-1 || j==(n-1) && i>0||i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }

            
            

            System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                //P
                if(i==0 && j>0 && j<(3*n)/4 || j==0 && i>0 || j==(3*n)/4 && i<=(n-1)/2  && i>0 && i<(n-1)/2 || 
                i==(n-1)/2 && j>0 && j<(3*n)/4  )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
             System.out.print(" ");
             for(int j=0; j<n; j++)
            {
                //P
                if(i==0 && j>0 && j<(3*n)/4 || j==0 && i>0 || j==(3*n)/4 && i<=(n-1)/2  && i>0 && i<(n-1)/2 || 
                i==(n-1)/2 && j>0 && j<(3*n)/4  )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
             System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                //Y
                if(j==(n-1)/2 && i>(n-1)/2 || i-j==0 && i<=(n-1)/2 || i+j==n-1 &&  i<=(n-1)/2 )
                   
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }



          for(int k=0; k<=25;k++)
          {
            System.out.print(" ");
          }
           
            for(int j=0; j<n; j++)
            {
                //N
                 if(j==0 || j==(n-1) || i-j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }

            System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                //E
                 if(j==0 || i==(n-1) || i==0 && j<=(3*n)/4 || i==(n-1)/2 && j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }

             System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                //W
                if(j==0 || j==(n-1) || i-j==0 &&  i>(n-1)/2 || i+j==n-1 && i>(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }

            System.out.println(" ");
        }
         
//Space
         
         for(int k=0; k<=4;k++)
          {
            System.out.println();
          }
           
       
         
         
         
         for(int i=0;i<n; i++)
        {
//Space
             for(int j=0; j<1; j++)
            {
                 
                    System.out.print(" ");
                
            }
            System.out.print(" ");
              for(int k=0; k<=55;k++)
          {
            System.out.print(" ");
          }
           
            //Y
            for(int j=0; j<n; j++)
            {
                   if(j==(n-1)/2 && i>(n-1)/2 || i-j==0 && i<=(n-1)/2 || i+j==n-1 &&  i<=(n-1)/2 )
                   
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
            System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                //E
                 if(j==0 || i==(n-1) || i==0 && j<=(3*n)/4 || i==(n-1)/2 && j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }

            
            

            System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                
               //A
                if(j==0 && i>0 || i==0 && j>0 && j<n-1 || j==(n-1) && i>0||i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
             System.out.print(" ");
             for(int j=0; j<n; j++)
            {
                //R
                   if(i==0 && j>0 && j<(3*n)/4 || j==0 && i>0 || j==(3*n)/4 && i<=(n-1)/2  && i>0 && i<(n-1)/2 || 
                i==(n-1)/2 && j>0 && j<(3*n)/4 || i-j==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
             
            System.out.println(" ");
        }
        
    }
}