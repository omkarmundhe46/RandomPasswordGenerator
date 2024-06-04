Today we will make a random password generator that makes passwords with random numbers and letters!

In order to do this we are going to use ASCII. ASCII is a language in which every possible character is represented by a number. 
This standard ensures that computers can communicate to each other about characters properly.

This is a more challenging project for beginners, but you certainly have the ability to do it as long as 
you are familiar with Java concepts such as conditionals, loops, functions, and random numbers.


What to keep in mind before you start:
1). Our program asks us to enter the number of random passwords we want and how long they should be.
2). Then it prints out the list of random passwords it generated.
3). Note that the random passwords consist of both uppercase and lowercase letters, as well as numbers!


Steps to Code the Project:
1). Ask the user to enter the total number of random passwords they want.
2). Ask the user how many characters long they want their passwords to be. (12-15 characters is a strong password length!)
3). Create a function that generates a random character, which can be a number, a lowercase letter, or an uppercase letter.
4). Create a random password by looping through the total number of passwords and looping through the length of the passwords.
5). Store each random password you generate in an array.
6). Create a function to print out your array of passwords.


How do we do each of these steps?
Step 1: Ask the user to enter the total number of random passwords they want.
First we need to type import java.util.Scanner at the top of our code.
Next we can make a Scanner variable by typing Scanner in = new Scanner(System.in).
Finally let’s print out a prompt for the user to enter in the number of passwords they want generated and store their answer in an integer.
Hint: Make sure to use in.nextInt() to get the user input as an integer!


Step 2: Ask the user how many characters long they want their passwords to be.
According to security experts, 12-15 characters is a strong password length!
We can print out a prompt for the user to enter in the length of their passwords and store their answer in an integer, just like what we did for the total number of passwords.


Step 3: Create a function that generates a random character, which can be a number, a lowercase letter, or an uppercase letter.
According to our ASCII table, ‘0’ – ‘9’ is 48-57 in ASCII, ‘A’ – ‘Z’ is 65-90 in ASCII, and ‘a’ – ‘z’ is 97-122 in ASCII. This information will be super important later!
The first thing we want to do is to make a random number that represents all possible characters.

There are 10 numbers, 26 lowercase letters, and 26 uppercase letters, so there are 10 + 26 + 26 = 62 possibilities of characters.
We can write (int)(Math.random() * 62) in order to get a random integer including 0 and excluding 62.
Now that we have established that our random number is between 0 and 61 (inclusive), we want to think about how we will split up 
the values of our random number to correspond to numbers, uppercase letters, and lowercase letters.

The 10 possible numbers can be between 0 and 9 (inclusive). The 26 possible uppercase letters can be between 10 and 35 (inclusive). 
The 26 possible lowercase letters can be between 36 and 61 (inclusive).
In other words, if our random number is between 0 and 9 (inclusive), we can say it’s a number. If our random number is between 10 and 35 (inclusive),
we can say it’s an uppercase letter. If our random number is between 36 and 61 (inclusive), we can say it’s a lowercase letter.

We can use conditionals to check if our random number corresponds to numbers, uppercase letters, and lowercase letters. 
Our goal is to shift the random number interval we currently have for numbers, uppercase letters, and lowercase letters to their appropriate ASCII intervals.

Numbers are 48-57 in ASCII, and we currently have them in the random number interval of 0-9, so we need to convert from 0-9 to 48-57. 
To do this, we can simply add 48 to our random number because 48-0 = 48.
Uppercase letters are 65-90 in ASCII, and we currently have them in the random number interval of 10-35, so we need to convert from 10-35 to 65-90. 
To do this, we can simply add 55 to our random number because 65-10 = 55.
Lowercase letters are 97-122 in ASCII, and we currently have them in the random number interval of 36-61, so we need to convert from 36-61 to 97-122.
To do this, we can simply add 61 to our random number because 97-36 = 61.
Finally, we just need to cast our new integer value into a char and return it!


Step 4: Create a random password by looping through the total number of passwords and looping through the length of the passwords.
Let’s make an outer for loop that will loop as many times as the total number of passwords. You can use the following notation to do so:
for(int i = 0; i < total; i++)
line 2
Inside our outer for loop, we can create a String variable to store our random password and set it to an empty String. Next let’s make an inner for loop 
that will loop as many times as the length of the password.You can use the following notation to do so:
for(int j = 0; j < length; j++)
Inside our inner for loop, we can call our random character function that we just created and add the random character to our random password String. 
You can say stringVariable += charVariable to append a character to a String!


Step 5: Store each random password you generate in an array.
Before our outer for loop, let’s create an array to store each random password we generate. This array will store Strings in it and its length will be equal to 
the total number of random passwords that the user wants to generate.
Once we finish generating each random password, let’s add it to our array.
Hint: Once we finish the inner for loop, we know that we have generated a random password, so right after our inner for loop (but still inside our outer for loop), 
we can say array[i] = randomPassword.


Step 6: Create a function to print out your array of passwords.
Our function should take in a String array and return void because all we are doing in our function is printing out each element of the array. 
You can use a for loop to loop through each element of the array and print it out!


