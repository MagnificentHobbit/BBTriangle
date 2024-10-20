
Equivalent Class Partitioning tests

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
