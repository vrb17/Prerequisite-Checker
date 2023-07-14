# Prerequisite-Checker
The provided Java files collectively form a program related to check prerequisites in a course curriculum. 

A prerequisite checking system for course curriculum management is built, allowing users to check prerequisite relationships, determine 
required courses, and identify eligible courses for enrollment based on completed prerequisites.
- It takes three command-line arguments representing input and output files.

AdjList.java: 
- This file contains the main method and serves as the entry point for the program.
- It uses the hashmap class to read an adjacency list from the input file and print it to the output file.

hashmap.java: 
- This class represents a hashmap data structure used to store and manipulate the adjacency list.
- It reads an input file containing the adjacency list and builds a hashmap with course names as keys and their prerequisites as values.
- It provides methods to access and modify the hashmap.

NeedToTake.java: 
- This class determines the courses that a student needs to take based on their prerequisite dependencies.
- It reads an input file containing a course name and the number of prerequisite courses, and then the prerequisite course names.
- It uses the hashmap class to traverse the prerequisite graph and identifies the required courses that the student needs to take.

ValidPrereq.java: 
- This class determines if a course is a valid prerequisite for another course.
- It reads an input file containing two course names and uses the hashmap class to check if the first course is a valid prerequisite for the second course.
- The output is written to the specified output file, indicating whether the prerequisite relationship is valid or not.

Eligible.java: 
- This class determines the eligible courses for enrollment based on the completed prerequisite courses.
- It reads an input file containing the number of completed courses and the course names.
- It uses the hashmap class to traverse the prerequisite graph and identifies the eligible courses that the student can enroll in.






