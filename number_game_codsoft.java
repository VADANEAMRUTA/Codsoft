package codsoft;
import java.util.*;
public class number_game_codsoft{
public number_game_codsoft(int ch){
Scanner sc=new Scanner(System.in);
int score=0;
Random r=new Random();
int random_no=r.nextInt(100)+1;
System.out.println(random_no);
int remainig_ch=ch;
while(true){
System.out.println("Guess the no between(1-100)");
System.out.println("You have chances:" +remainig_ch );
int guess=sc.nextInt();
score++;
remainig_ch--;
if(score==ch){
System.out.println("Sorry you have reached the max attempts:\n try again later");
System.out.println("The number was:\t"+random_no);
break;
}
if(guess==random_no){
System.out.println("Congratulations your guess is correct.....!");
System.out.println("Your score is:"+score);
break;
}
else if(random_no>guess){
System.out.println("The no is greater than your guess");
}
else if(random_no<guess){
System.out.println("The no is smaller than your guess");
}
}
}
public static void main(String[] args){
number_game_codsoft g=new number_game_codsoft(5);
}
}