public class WorkShop{


private String title;
private String venue;
private String date;
private int capacity;
private double fee;
private char level;
private Speaker sp;
private String participantList;
private int numOfPart;
public static int numOfWorkshop = 0;

public WorkShop(String title, String v, String date, int cap, double f, char lev, Speaker sp){
this.title = title;
venue = v;
this.date = date;
capacity = cap;
fee = f;
level = lev;
this.sp = new Speaker(sp.getName(), sp.getEmail());
participantList = "";
numOfPart = 0;
numOfWorkshop++;
} 

public boolean isFull(){
if(numOfPart == capacity)
return true;

return false;
}

public boolean addParticipant(String p){

if(!isFull()){
participantList = participantList.concat(p+"&");
numOfPart++;
return true;
}
return false;
}

public double calculateIncome(){
double totalIncome = 0;
double discount = 0;
switch(level){

case 'B':
discount = 0.1;
break;
case 'I':
discount = 0.2;
break;
case 'A':
discount = 0.3;
break;
}
totalIncome = numOfPart * (fee - (fee*discount));
return totalIncome;
}


public void updateSpeaker(Speaker newSp){
sp = newSp;
}

public void printInfo(){
System.out.printf("Title: %20s%nVenue: %20s%nDate: %-10s%nfee: %.2f%n", title, venue, date, fee);
System.out.println(participantList.replace('&', '\n'));
System.out.println("Availability: " + (isFull()?"This workshop is full":"You can register for this workshop"));

}
}