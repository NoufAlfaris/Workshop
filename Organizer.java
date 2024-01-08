import java.util.*;
public class Organizer{

static Scanner input = new Scanner(System.in);

public static double calcuTotalIncome(WorkShop w1, WorkShop w2){
double totalIncome = Math.round( (w1.calculateIncome() + w2.calculateIncome()));
return totalIncome;
}

public static void main(String[] args){

Speaker s1 = new Speaker("Omar Ali", "Omar@gmail.com");
WorkShop w1 = new WorkShop("Java from zero to hero", "KSU Main Hall", "20-6-2023" ,50, 500, 'B', s1);

System.out.println("the workshop w1 has been created succesfully");
boolean x = false;
if(w1.addParticipant("Malak Ali")){
System.out.println("Added succesfully");
x=true;}
else{
System.out.println("not added succesfully");
x=false;}

if(w1.addParticipant("Hala Mohammed")){
System.out.println("Added succesfully");
x=true;}
else{
System.out.println("not added succesfully");
x=false;}




if(x)
System.out.println("Two participants have been added succesufully to w1");

System.out.println("Enter workshop name, venue, date, capacity, fee, level, speaker name, speaker email");
String name = input.nextLine();
String venue = input.nextLine();
String date = input.next();
int capacity = input.nextInt();
double fee = input.nextDouble();
char level = input.next().charAt(0);
input.nextLine();
String spName = input.nextLine();
String spEmail = input.next();
while(level != 'B' && level != 'I' && level != 'A'){
System.out.println("wrong input for level, please re enter it");
level = input.next().charAt(0);
}

Speaker s2 = new Speaker(spName, spEmail);
WorkShop w2 = new WorkShop(name, venue, date, capacity, fee, level, s2);

for(int i =0 ; i<2;i++){
System.out.println("enter name of participant");
input.nextLine();
String part = input.nextLine();
if(w2.addParticipant(part))
x=true;
else 
x = false;
}

if(x)
System.out.println("Two participants have been added succesufully to w1");

Speaker s3 = new Speaker ("Sameer Ahmed", "Sameer@gmail.com");
w1.updateSpeaker(s3);
System.out.println("the speaker for w1 has been updated");

w1.printInfo();

System.out.println("Number of workshop= "+WorkShop.numOfWorkshop);

double total = calcuTotalIncome(w1,w2);
System.out.println("Total income: "+total);


}//main



}