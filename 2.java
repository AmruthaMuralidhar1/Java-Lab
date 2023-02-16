
import java.util.*;
class Student {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter your name ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Enter your USN ");
        String usn = in.nextLine();
        System.out.println("Enter your total courses ");
        int n = in.nextInt();
        int [] marks=new int[n];
        int [] crd=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter your marks in course["+(i+1)+"]");
            marks[i] = in.nextInt();
            System.out.println("Enter the credits of course["+(i+1)+"]");
            crd[i] = in.nextInt();
        }
        double sgp = sgpa(n,marks,crd);
        display(sgp, name, usn);
    }
    
    public static double sgpa(int n, int [] marks, int [] crd){
        int point[] = new int [n];
        int i, sum=0, tc=0;
        for (i=0;i<n;i++){
            if(marks[i]>=90){
                point[i]=crd[i]*10;
            }
            else if(marks[i]>=80 && marks[i]<90){
                point[i]=crd[i]*9;
            }
            else if(marks[i]>=70 && marks[i]<80){
                point[i]=crd[i]*8;
            }
            else if(marks[i]>=60 && marks[i]<70){
                point[i]=crd[i]*7;
            }
            else if(marks[i]>=50 && marks[i]<60){
                point[i]=crd[i]*6;
            }
            else if(marks[i]>=40 && marks[i]<50){
                point[i]=crd[i]*5;
            }
            else if(marks[i]<40){
                point[i]=crd[i]*0;
            }
            tc=+crd[i];
            sum =+ point[i];
        }
        double sgpa = sum/tc;
        return sgpa;
    }
    
    public static void display(double sgp, String name, String usn){
        System.out.println("Name = "+name+"\nUSN = "+usn+"\nYour SGPA = "+sgp);
    }
}
