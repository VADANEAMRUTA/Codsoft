import java.util.Scanner;
public class GradeCalculator{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
System.out.println("For Calculate the Grade follow this step");
System.out.println("Fill information");
System.out.println("Enter no of subject-->");
int Sub=x.nextInt();
int M=Sub*100;
int T_mark=00;
for(int i=1;i<=Sub;i++){
System.out.println("Enter obtained marks in sub "+i+"[out of 100]");
int mark=x.nextInt();
T_mark+=mark;
}
System.out.println("Total mark you obtained in exam is-->"+T_mark+"Out of"+M);
double per=(double)T_mark/Sub;
System.out.println("Percentage you get in exam is-->"+per+"%");
String grade;
if(per>=90){
grade="You pass with A+";
}
else if(per>=80){
 grade="You pass with A";
}
else if(per>=80){
 grade="You pass with A";
}
else if(per>=80){
 grade="You pass with A";
}
else if(per>=80){
 grade="You pass with A";
}
else{
  grade="You Fail in Exam";
}
System.out.println("Grade-->"+grade);
x.close();
}
}
