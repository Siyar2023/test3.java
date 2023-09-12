//Name: Siyar Sarikaya
//Inlämnings uppgifter - Lektion 1 (JAVA A)
//https://sti.learning.nu/pluginfile.php/22557/mod_resource/content/1/%231%20Java%20A%20-%20Intro.pdf


//ALLA KODER FÖR INTELLIJ IDEA:
// PART 1
/* Print the result of two: INT variables added together
int x = 15…
For example variables: x + y  */

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(x + y);{
        }





//***********************************************************************************************************
        // PART 2

/* Create an Array and print the FIRST value present in the data
structure.
Int[] score = [0, 50, 100]
System.out.println( score[0] ) */


        int[] scores= {0, 50, 100};
        {
            System.out.println(scores[1]);
        }




//***********************************************************************************************************
        // PART 3
/* Create two String variables, try to + them together, see what
happens! (Don’t forget to print)
String benny = “Benny”
String anton = “Anton”  */

        String firstname = "Benny";
        String lastname = "Anton"; {
            System.out.println(firstname + " " + lastname);
        }






//***********************************************************************************************************
        // PART 4
/* In this next assignment we will try to change the visibility
modifier and run the application. Don’t worry if something breaks!
change public → private
inside ‘Public static void main’
What happens? */

//SVAR:
        /*Error: Main method not found in class com.siyar.lektion1.Main, please define the main method as:
public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application


//Public: Det är åtkomstspecifikationen som betyder att man kan komma åt den från överallt.





//***********************************************************************************************************
    // PART 5
         */
/* Remove ‘static’ this time in:
‘Public static void main’
What happens? Again, all ok if the app crashes! */

//SVAR:
        /*Error: Main method is not static in class com.siyar.lektion1.Main, please define the main method as:
public static void main(String[] args)

        /* Kommentar:
        När JVM anropar huvudmetoden finns det inget objekt för klassen som anropas,
        därför måste den ha statisk metod för att tillåta anrop från klassen. */





//***********************************************************************************************************
        // PART 6
/* Go back to the way the project was with public + PSVM
Create TWO variables: number & Number (note the capital N)
Print both - what happens? */

        int number = 15;
        int Number = 5;

        System.out.println(number + Number); {
        }




//***********************************************************************************************************
        //PART 7

/*To create an array in Java that contains both integers and booleans,
you can use the Object type as the array element type. Here’s an example*/
        Object[] arr = new Object[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        arr[3] = true;
        arr[4] = false;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


//***********************************************************************************************************
        //PART 8
        /* Create an array,
name it: myArray
Print the entire array without using brackets → [ ]
For example:
System.out.println(myArray) // Prints the entire array’s data */

        String[] myArray = {"Red", "Blue", "Black", "White"};
        for (String i : myArray)
            System.out.println(i); {
        }
    }
}