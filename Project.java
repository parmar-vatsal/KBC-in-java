import java.util.Scanner;
import javax.sound.sampled.*;


class Project
{
	public static void main(String args[])
	{
		int Win_Price=0;
		System.out.println("\n\n= = = = = = = =    Welcome to Java Quiz     = = = = = = = =\n\n");
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Are You Ready For Quiz Test Y/N : ");
			String Ready = sc.nextLine();
			if(Ready.equals("Y") || Ready.equals("y"))
			{
				System.out.println("\n\n ------ Let's Start java Quiz ------\n");
				System.out.println("Please Enter Option name Like A,B,C,D\n");
				playAudio("Audio/kbc_break.wav");
				System.out.println("Here is the 1 question price pool is 500 ₹.\n");
				System.out.println("Q1 : Number of primitive data types in Java are? \n(A) 6     (B) 7\n(C) 8     (D) 9\n");
				String Q1_obj = sc.nextLine();
				String Q1 = Q1_obj.toUpperCase();
				if(Q1.equals("C"))
				{
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right....");
					Win_Price =  500;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.");
					System.out.println("The Right Answer Is '(C) 8'.");
					System.out.println("Sorry,Better Luck Next Time.");
					break;
				}

				System.out.println("Here is the 2 question price pool is 1000 ₹.\n");
				System.out.println("Q2 :  What is the size of float and double in java? \n(A) 32 and 64     (B) 32 and 32\n(C) 64 and 64     (D) 64 and 32\n");
				String Q2_obj = sc.nextLine();
				String Q2 = Q2_obj.toUpperCase();
				if(Q2.equals("A"))
				{
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 1000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.");
					System.out.println("The Right Answer Is '(A) 32 and 64'.");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.");
					break;
				}

				System.out.println("Here is the 3 question price pool 2500 ₹.\n");
				System.out.println("Q3 :  Automatic type conversion is possible in which of the possible cases? \n(A) Byte to Int     (B) Int to Long\n(C) Long to Int     (D) Short to Int\n");
				String Q3_obj = sc.nextLine();
				String Q3 = Q3_obj.toUpperCase();
				if(Q3.equals("B"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 2500;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(B) Int to Long'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 4 question price pool 5000 ₹.\n");
				System.out.println("Q4 :  Select the valid statement. \n(A) char[] ch = new char(5)     (B) char[] ch = new char[5]\n(C) char[] ch = new char()     (D) char[] ch = new char[]\n");
				String Q4_obj = sc.nextLine();
				String Q4 = Q4_obj.toUpperCase();
				if(Q4.equals("B"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 5000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(B) char[] ch = new char[5]'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 5 question price pool 10,000 ₹.\n");
				System.out.println("Q5 :  When an array is passed to a method, what does the method receive? \n(A) The reference of the array     (B) A copy of the array\n(C) Length of the array     (D) Copy of first element\n");
				String Q5_obj = sc.nextLine();
				String Q5 = Q5_obj.toUpperCase();
				if(Q5.equals("A"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 10000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(A) The reference of the array'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}


				System.out.println("Here is the 6 question price pool 20,000 ₹.\n");
				System.out.println("Q6 : Select the valid statement to declare and initialize an array. \n(A) int[] A = {}     (B) int[] A = {1,2,3}\n(C) int[] A = (1,2,3)     (D) int[][] A = {1,2,3}\n");
				String Q6_obj = sc.nextLine();
				String Q6 = Q6_obj.toUpperCase();
				if(Q6.equals("B"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 20000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(B) int[] A = {1,2,3}'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}
				
				System.out.println("Here is the 7 question price pool 50,000 ₹.\n");
				System.out.println("Q7 : Arrays in java are -  \n(A) Object references     (B) objects\n(C) Primitive data type     (D) None\n");
				String Q7_obj = sc.nextLine();
				String Q7 = Q7_obj.toUpperCase();
				if(Q7.equals("B"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 50000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(B) objects'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 8 question price pool 1,00,000 ₹.\n");
				System.out.println("Q8 : When is the object created with new keyword?  \n(A) At run time     (B) At compile time\n(C) Depends on the code     (D) None\n");
				String Q8_obj = sc.nextLine();
				String Q8 = Q8_obj.toUpperCase();
				if(Q8.equals("A"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 50000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(A) At run time'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 9 question price pool 2,00,000 ₹.\n");
				System.out.println("Q9 : Identify the corrected definition of a package.  \n(A) A package is a collection of editing tools     (B) A package is a collection of classes\n(C) A package is a collection of classes and interfaces     (D) A package is a collection of interfaces\n");
				String Q9_obj = sc.nextLine();
				String Q9 = Q9_obj.toUpperCase();
				if(Q9.equals("C"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 200000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(C) A package is a collection of classes and interfaces'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 10 question price pool 3,00,000 ₹.\n");
				System.out.println("Q10 : In which of the following is toString() method defined?  \n(A) java.lang.Object     (B) java.lang.String\n(C) java.lang.util     (D) None\n");
				String Q10_obj = sc.nextLine();
				String Q10 = Q10_obj.toUpperCase();
				if(Q10.equals("A"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 300000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(A) java.lang.Object'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 11 question price pool 4,00,000 ₹.\n");
				System.out.println("Q11 : compareTo() returns  \n(A) Ture     (B) False\n(C) An int Value     (D) None\n");
				String Q11_obj = sc.nextLine();
				String Q11 = Q11_obj.toUpperCase();
				if(Q11.equals("C"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 400000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(C) An Int value'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 12 question price pool 5,00,000 ₹.\n");
				System.out.println("Q12 : Total constructor string class have?  \n(A) 3     (B) 7\n(C) 13     (D) 20\n");
				String Q12_obj = sc.nextLine();
				String Q12 = Q12_obj.toUpperCase();
				if(Q12.equals("A"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 500000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(A) 3'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 13 question price pool 10,00,000 ₹.\n");
				System.out.println("Q13 : To which of the following does the class string belong to.  \n(A) java.lang     (B) java.awt\n(C) java.applet     (D) java.string\n");
				String Q13_obj = sc.nextLine();
				String Q13 = Q13_obj.toUpperCase();
				if(Q13.equals("A"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 1000000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(A) java.lang'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 14 question price pool 15,00,000 ₹.\n");
				System.out.println("Q14 : Identify the return type of a method that does not return any value.  \n(A) int    (B) void\n(C) double     (D) None\n");
				String Q14_obj = sc.nextLine();
				String Q14 = Q14_obj.toUpperCase();
				if(Q14.equals("B"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 1500000;
				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(B) Void'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}

				System.out.println("Here is the 15 question price pool 20,00,000 ₹.\n");
				System.out.println("Q15 : Output of Math.floor(3.6)?  \n(A) 3    (B) 3.0\n(C) 4     (D) 4.0\n");
				String Q15_obj = sc.nextLine();
				String Q15 = Q15_obj.toUpperCase();
				if(Q15.equals("B"))
				{
					 
					playAudio("Audio/Sahi_jawab.wav");
					System.out.println("\nYou are absolutely Right ....");
					Win_Price = 2000000;
					System.out.println("You Have Win "+Win_Price+" Today.\n");
					System.out.println("Congratulation 🎉");
					break;

				}
				else
				{
					playAudio("Audio/Kbc_Galat_Jawab.wav");
					System.out.println("Wrong Answer.\n");
					System.out.println("The Right Answer Is '(B) 3.0'.\n");
					System.out.println("Here Is your Wining Cash : "+Win_Price);
					System.out.println("Sorry,Better Luck Next Time.\n");
					break;
				}
			}
			else if(Ready.equals("N") || Ready.equals("n"))
			{
				playAudio("Audio/Sorry.wav");
				System.out.println("Thank you for considering the Java Quiz. Goodbye!");
				break;
			}
			else
			{
				System.out.println("Invalid input. Please enter Y or N.");
			}
		}
	}


	public static void playAudio(String audioFilePath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Project.class.getResourceAsStream(audioFilePath));
            SourceDataLine sourceDataLine = AudioSystem.getSourceDataLine(audioInputStream.getFormat());
            sourceDataLine.open();
            sourceDataLine.start();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = audioInputStream.read(buffer)) != -1) {
                sourceDataLine.write(buffer, 0, bytesRead);
            }
            sourceDataLine.drain();
            sourceDataLine.close();
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}