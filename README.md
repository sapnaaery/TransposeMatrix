Transpose Matrix in Java
📌 Overview
This project demonstrates how to transpose a 2-dimensional matrix in Java.

Matrix transposition means converting the rows of a matrix into columns and the columns into rows.

For example:

Original Matrix:

10   4   12
5    10  30

Transposed Matrix:

10   5
4    10
12   30

🛠️ Technologies Used
Java

2D Arrays

Nested for loops

Arrays.deepToString()

📂 Class
day7
└── TransposeMatrix.java

🧠 How It Works
The program starts with the following 2D array:

int matrix[][] = {
    { 10, 4, 12 },
    { 5, 10, 30 }
};

The matrix contains:

2 rows

3 columns

The number of rows and columns is obtained using:

int rows = matrix.length;
int cols = matrix[0].length;

Since the original matrix has 2 × 3 dimensions, its transpose will have 3 × 2 dimensions.

A new matrix is created to store the transposed values:

int transposeMatrix[][] = new int[cols][rows];

The nested loops then copy each element to its transposed position:

transposeMatrix[j][i] = matrix[i][j];

Here, the row index i and column index j are swapped.

▶️ Example Output
Original Array
[[10, 4, 12], [5, 10, 30]]

Transposed Array
[[10, 5], [4, 10], [12, 30]]

🔍 Key Concept
The main concept demonstrated in this program is:

transposeMatrix[j][i] = matrix[i][j];

For example:

matrix[0][1] = 4

becomes:

transposeMatrix[1][0] = 4

This effectively changes rows into columns.

⏱️ Complexity
For a matrix containing R rows and C columns:

Time Complexity: O(R × C)

Space Complexity: O(R × C)

The additional space is required to create the transposed matrix.

🚀 How to Run
Make sure Java is installed on your system.

Save the file as:

TransposeMatrix.java

Compile the program:

javac TransposeMatrix.java

Run the program:

java TransposeMatrix

If you are running the class from the day7 package, compile and run it according to your project/package structure.

📚 Learning Objective
This example is useful for practicing:

2D arrays in Java

Matrix operations

Nested loops

Array dimensions

Accessing rows and columns

Creating a new array based on existing dimensions
