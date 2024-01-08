package arrayassignment;

public class TwoDimensionArrayAssignment {
public static void main(String[] args) {
// Write a program to create a static Array, having following cricket data:
//--name, age, team name, DOB, gender, Strike Rate --Try to create multiple Object Arrays for different players 
//--Try to print all the values of each player on the console
Object PlayerInfo [] []= {{"Kishor",31, "Delhi" ,"21-05-90",'M',9},{"Dhoni",42,"Mumbai","11-7-80",'M',8},
		{"Virat",37,"Kolkata","13-10-87",'M',8}};
for(Object [] row : PlayerInfo) {
	for(Object e : row) 
	{
		System.out.print(e + " ");
	}
	System.out.println();
}




















}
}



