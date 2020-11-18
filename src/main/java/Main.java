import java.util.Scanner;

public class Main
{

    static int currentPosition;
    static int roll;


    public static void main(String[] args)
    {

        float number =20;
        Object[] grid = new Object[101]; // define an array to hold the grid

        GRID:
        for (int position = 1; position <= grid.length-1; position++) // put values into the array
        {
            SWITCH:
            switch (position) {
                case 4:
                    grid[position] = "ladder";
                    break;
                case 11:
                    grid[position] = "ladder";
                    break;
                case 30:
                    grid[position] = "ladder";
                    break;
                case 44:
                    grid[position] = "ladder";
                    break;
                case 56:
                    grid[position] = "ladder";
                    break;
                case 72:
                    grid[position] = "ladder";
                    break;
                case 86:
                    grid[position] = "ladder";
                    break;
                case 20:
                    grid[position] = "snake";
                    break;
                case 43:
                    grid[position] = "snake";
                    break;
                case 58:
                    grid[position] = "snake";
                    break;
                case 69:
                    grid[position] = "snake";
                    break;
                case 84:
                    grid[position] = "snake";
                    break;
                case 87:
                    grid[position] = "snake";
                    break;
                case 99:
                    grid[position] = "snake";
                    break;
                default:
                    grid[position] = position;

            } //end of switch

        } // END OF GRID
        rollDice(grid); // call roll dice
    }

    public static void rollDice(Object[] object)
    {

        currentPosition = (int)object[1]; // first block in the grid
        while(currentPosition != 100)
        {
            System.out.println("Enter a roll:  ");

            input(); // grab input
            if(roll >=0 && roll <= 6)
            {
                currentPosition += roll; // changing the position based on the roll

                /*
                      implement the logic
                 */

                if((currentPosition) > 100)
                {
                    currentPosition -= roll;
                }
                else if(object[currentPosition].equals("ladder") && currentPosition == 4) // if you hit the snake at number 4
                {
                    currentPosition = 73;

                }

                else if(object[currentPosition].equals("snake") && currentPosition == 6)
                {
                    currentPosition = 44;
                }
                else if(object[currentPosition].equals("ladder") && currentPosition == 11)
                {
                      currentPosition = 33;
                }
                else if(object[currentPosition].equals("ladder") && currentPosition == 30)
                {
                     currentPosition = 51;
                }
                else if(object[currentPosition].equals("ladder") && currentPosition == 38)
                {
                    currentPosition = 80;

                }
                else if(object[currentPosition].equals("ladder") && currentPosition == 72)
                {
                     currentPosition = 94;
                }
                else if(object[currentPosition].equals("ladder") && currentPosition == 56)
                {
                            currentPosition = 82;
                }
                else if(object[currentPosition].equals("ladder") && currentPosition == 86)
                {
                    currentPosition = 96;
                }
                else if(object[currentPosition].equals("snake") && currentPosition == 99)
                {
                 currentPosition = 18;
                }
                else if(object[currentPosition].equals("snake") && currentPosition == 87)
                {
                       currentPosition = 27;
                }
                else  if(object[currentPosition].equals("snake") && currentPosition == 58)
                {
                    currentPosition = 79;
                }
                else if(object[currentPosition].equals("snake") && currentPosition == 84)
                {
                    currentPosition = 75;
                }
                else  if(object[currentPosition].equals("snake") && currentPosition == 52)
                {
                        currentPosition = 45;
                }
                else if(object[currentPosition].equals("snake") && currentPosition == 20)
                {
                    currentPosition = 2;
                }

                System.out.println("You are at position: "+object[currentPosition]);


            }
            else
            {
                System.out.println("You have entered an invalid roll , try again!");
            } // end of else

        } // end of while loop

    } //end of rollDice
    public static int input() // for creating input
    {
        roll = new Scanner(System.in).nextInt();
        return roll;
    }
    //make some random 
}