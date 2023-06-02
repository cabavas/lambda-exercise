# Worker Data Analysis

This repository contains a Java program that reads worker data from a CSV file and performs various operations on the data, such as filtering workers based on salary and calculating the sum of salaries for workers whose names start with 'M'.

## Getting Started
To run this program, you need Java installed on your machine. Follow these steps:

1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Compile and run the `Main` class.
4. Enter the full file path for the worker data file.
5. Enter a salary value to filter workers.
6. The program will display the email addresses of workers with salaries above the given value and calculate the sum of salaries for workers with names starting with 'M'.

## Sample Data File Format
The worker data should be provided in a CSV (Comma-Separated Values) file format. Each line in the file represents a worker and contains the following fields in order: name, email, and salary. The fields should be separated by commas. Here's an example:

## The code

The code provided is a Java program that performs analysis on worker data read from a CSV file. Here's a breakdown of the main components and steps:

1. The program prompts the user to enter the full file path of the CSV file containing worker data.
2. The program uses a `BufferedReader` to read the contents of the file.
3. For each line in the file, the program splits the line by commas using the `split()` method and creates a `Worker` object with the name, email, and salary extracted from the line.
4. The `Worker` objects are stored in an `ArrayList` called `workers`.
5. The user is then prompted to enter a salary value.
6. The program filters the `workers` list based on the entered salary value using the `filter()` method of the stream API.
7. The program maps the filtered `Worker` objects to their email addresses using the `map()` method.
8. The email addresses are sorted in alphabetical order using the `sorted()` method.
9. The sorted email addresses are collected into a `List` using the `collect()` method.
10. The program then prints the email addresses of workers whose salary is higher than the entered value.
11. The program filters the `workers` list again, this time based on the condition that the worker's name starts with 'M'.
12. The program maps the salaries of the filtered workers using the `map()` method.
13. The salaries are then summed up using the `reduce()` method, with an initial value of 0.0 and a lambda function for the summation operation.
14. Finally, the program prints the sum of the salaries for workers whose names start with 'M'.

In summary, the program reads worker data from a CSV file, allows the user to filter workers based on salary, and calculates the sum of salaries for workers whose names start with 'M'. The results are displayed to the user.
