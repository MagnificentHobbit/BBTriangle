### Boundary Value Analysis (BVA)
Boundary Value Analysis is a software testing technique that focuses on testing the extreme boundaries of input ranges. By selecting test cases at the edge of input boundaries (both minimum and maximum values), BVA helps in identifying defects related to limit conditions. This technique is effective in discovering off-by-one errors and issues that occur at the boundary of valid input ranges.

| Inputs |  Min	 |  Máx  |
|--------|-------|-------|
| **Input1** |	 0	 | maxInt|
| **Input2** |   0	 | maxInt|
| **Input3** |	 0	 | maxInt|


### Equivalent Class Partitioning (ECP)
Equivalent Class Partitioning is a testing technique that divides input data into partitions or classes where each class is expected to exhibit similar behavior. Instead of testing all possible inputs, testers select representative values from each partition. This helps reduce the number of test cases while ensuring that each class of inputs is covered. Classes can be defined as valid or invalid, ensuring the application handles all types of inputs correctly.

|------------|---------------------|----------------------------------------------------------|----------------------------------------------------------|
|   ECP1         | Pre Conditions      | s1 > 0; s2 > 0; s3 > 0                                   | s1<=0 s2 <=0 s3 <= 0                                     |
| **Use Case**   | **Criteria**        | **Valid Class**                                          | **Invalid Class**                                        |
|------------|---------------------|----------------------------------------------------------|----------------------------------------------------------|
| Impossible | no of inputs         | = 3                                                      | != 3                                                     |
|            | type of inputs       | int                                                      | != int                                                   |
|            | input restrictions   | s1 < s2 + s3 or s2 < s3 + s1 or s3 < s1 + s2             | s1 > s2 + s3 or s2 > s3 + s1 or s3 > s1 + s2             |


/*
| ECP      | Pre Conditions             | Valid Class                                                 | Invalid Class                                     |
|----------|----------------------------|--------------------------------------------------------------|--------------------------------------------------|
| **ECP1** | s1 > 0; s2 > 0; s3 > 0     | s1 <= 0; s2 <= 0; s3 <= 0                                    |                                                  |
| **Use Case: Impossible**              |                                                              |                                                  |
| Criteria | Valid Class                | Invalid Class                                                |                                                  |
| no of inputs | = 3                    | != 3                                                         |                                                  |
| type of inputs | int                  | != int                                                       |                                                  |
| input restrictions | s1 < s2 + s3 or s2 < s3 + s1 or s3 < s1 + s2 | s1 > s2 + s3 or s2 > s3 + s1 or s3 > s1 + s2     |                                  |
| **ECP2** | s1 > 0; s2 > 0; s3 > 0     | s1 <= 0; s2 <= 0; s3 <= 0                                    |                                                  |
| **Use Case: Equilateral**             |                                                              |                                                  |
| Criteria | Valid Class                | Invalid Class                                                |                                                  |
| no of inputs | = 3                    | != 3                                                         |                                                  |
| type of inputs | int                  | != int                                                       |                                                  |
| input restrictions | s1 = s2 = s3     | s1 != s2 or s1 != s3 or s2 != s3                             |                                                  |
| **ECP3** | s1 > 0; s2 > 0; s3 > 0     | s1 <= 0; s2 <= 0; s3 <= 0                                    |                                                  |
| **Use Case: Isosceles**               |                                                              |                                                  |
| Criteria | Valid Class                | Invalid Class                                                |                                                  |
| no of inputs | = 3                    | != 3                                                         |                                                  |
| type of inputs | int                  | != int                                                       |                                                  |
| input restrictions | s1 = s2 or s1 = s3 or s2 = s3 | s1 != s2 and s1 != s3 and s2 != s3              |                                                  |
| **ECP4** | s1 > 0; s2 > 0; s3 > 0     | s1 <= 0; s2 <= 0; s3 <= 0                                    |                                                  |
| **Use Case: Right Angled**            |                                                              |                                                  |
| Criteria | Valid Class                | Invalid Class                                                |                                                  |
| no of inputs | = 3                    | != 3                                                         |                                                  |
| type of inputs | int                  | != int                                                       |                                                  |
| input restrictions | s1^2 = s2^2 + s3^2 or s2^2 = s1^2 + s3^2 or s3^2 = s1^2 + s2^2 | s1^2 != s2^2 + s3^2 and s2^2 != s1^2 + s3^2 and s3^2 != s1^2 + s2^2 |
| **ECP5** | s1 > 0; s2 > 0; s3 > 0     | s1 <= 0; s2 <= 0; s3 <= 0                                    |                                                  |
| **Use Case: Scalene**                 |                                                              |                                                  |
| Criteria | Valid Class                | Invalid Class                                                |                                                  |
| no of inputs | = 3                    | != 3                                                         |                                                  |
| type of inputs | int                  | != int                                                       |                                                  |
| input restrictions | s1 != s2; s1 != s3; s2 != s3 | s1 = s2 or s1 = s3 or s2 = s3                    |                                                  |
*/

### Test Cases
A test case is a set of conditions or inputs designed to evaluate whether a system behaves as expected. Each test case typically includes specific inputs, execution conditions, and expected outcomes. Test cases help systematically validate the correctness, performance, or compliance of software with requirements.

| Test Case     | T.C. Id | Input1    | Input2    | Input3    | Execution Conditions | Expected Results              | Obtained Result | ECP  |
|---------------|---------|-----------|-----------|-----------|----------------------|-------------------------------|-----------------|------|
| **Impossible**| 1       | 1000      | 10        | 10        | N.A.                 | String: "impossible"           | "scalene"       | ECP1 |
|               | 2       | 10        | 10        | 1000      | N.A.                 | String: "impossible"           | "impossible"    |      |
|               | 3       | 10        | 1000      | 10        | N.A.                 | String: "impossible"           | "impossible"    |      |
|               | 4       | 10        | 1000      | 1000      | N.A.                 | String: "impossible"           | "impossible"    |      |
|               | 5       | 1000      | 10        | 1000      | N.A.                 | String: "impossible"           | "impossible"    |      |
|               | 6       | 1000      | 1000      | 10        | N.A.                 | String: "impossible"           | "impossible"    |      |
|               | 7       | 10        | 10        | 10        | N.A.                 | String: "impossible"           | "impossible"    |      |
|               | 8       | 1000      | 1000      | 1000      | N.A.                 | String: "impossible"           | "impossible"    |      |
| **Equilateral**| 9      | 5         | 5         | 5         | N.A.                 | String: "equilateral"          | "equilateral"   | ECP2 |
|               | 10      | 5         | 4         | 4         | N.A.                 | String: "isosceles"            | "scalene"       |      |
|               | 11      | -         | 4         | 4         | N.A.                 | IllegalArgumentException       | -               |      |
| **Isosceles** | 12      | 4         | 4         | 1         | N.A.                 | String: "isosceles"            | "isosceles"     | ECP3 |
|               | 13      | 1         | 4         | 4         | N.A.                 | String: "isosceles"            | "isosceles"     |      |
|               | 14      | 4         | 1         | 4         | N.A.                 | String: "isosceles"            | "isosceles"     |      |
| **Right Angled**| 15    | 5         | 4         | 3         | N.A.                 | String: "right-angled"         | "right-angled"  | ECP4 |
|               | 16      | 3         | 5         | 4         | N.A.                 | String: "right-angled"         | "scalene"       |      |
|               | 17      | 4         | 5         | 3         | N.A.                 | String: "right-angled"         | "right-angled"  |      |
| **Scalene**   | 18      | 2         | 3         | 4         | N.A.                 | String: "scalene"              | "scalene"       | ECP5 |
|               | 19      | 4         | 3         | 2         | N.A.                 | String: "scalene"              | "scalene"       |      |
|               | 20      | 3         | 4         | 2         | N.A.                 | String: "scalene"              | "scalene"       |      |
| **BVA**       | BVA1    | 0         | 0         | 0         | N.A.                 | Valid input                   | OK              | ECP6 |
|               | BVA2    | 1         | 0         | 0         | N.A.                 | Valid input                   | OK              |      |
|               | BVA3    | maxInt-1  | maxInt-1  | maxInt-1  | N.A.                 | Valid input                   | OK              |      |
|               | BVA4    | maxInt    | maxInt    | maxInt    | N.A.                 | Valid input                   | OK              |      |
|               | BVA5    | maxInt+1  | maxInt+1  | maxInt+1  | N.A.                 | Invalid input                 | OK              |      |
|               | BVA6    | 0         | maxInt    | 0         | N.A.                 | Valid input                   | OK              |      |
|               | BVA7    | 1         | maxInt-1  | 1         | N.A.                 | Valid input                   | OK              |      |
|               | BVA8    | maxInt-1  | 0         | maxInt-1  | N.A.                 | Valid input                   | OK              |      |
|               | BVA9    | 0         | 0         | maxInt    | N.A.                 | Valid input                   | OK              |      |
|               | BVA10   | 0         | maxInt+1  | 0         | N.A.                 | Invalid input                 | OK              |      |
|               | BVA11   | maxInt+1  | 1         | 1         | N.A.                 | Invalid input                 | OK              |      |
|               | BVA12   | -1        | 0         | 0         | N.A.                 | Invalid input                 | OK              |      |
|               | BVA13   | 0         | -1        | 0         | N.A.                 | Invalid input                 | OK              |      |
|               | BVA14   | 0         | 0         | -1        | N.A.                 | Invalid input                 | OK              |      |


