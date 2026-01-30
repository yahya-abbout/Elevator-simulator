import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 2 3\n4 5 6\n7 8 9\n 10");
        int nextFloor = 0;
        int currentFloor = 0;

        try {
            System.out.print("enter where you want to go: ");
            nextFloor = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("enter a number");
        }

        MoveElevator(currentFloor, nextFloor);
        openDoor();
    }

 static void MoveElevator(int currentFloor, int nextFloor){

        if(currentFloor==nextFloor){
            System.out.println("Arrived at floor: " + currentFloor);
            return;
     }
        if(nextFloor>currentFloor){
        currentFloor++;
            System.out.println("current floor " + currentFloor);
        }

        else {
            currentFloor--;
            System.out.println("current floor: " + currentFloor);

        }
     MoveElevator(currentFloor, nextFloor);

 }

static void openDoor(){
    System.out.println("Door open");
}
}