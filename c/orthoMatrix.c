// C program to check if the matrix is Orthogonal or not.

#include <stdio.h>
int main()
{
    int m, n, p, c, d, k, sum = 0;
    int matrix[10][10], transpose[10][10], product[10][10];

    printf("Enter the number of rows and columns of matrix\n");
    scanf("%d%d", &m, &n);
    printf("Enter the elements of matrix\n");

    for (c = 0; c < m; c++)
        for (d = 0; d < n; d++)
            scanf("%d", &matrix[c][d]);

    for (c = 0; c < m; c++)
        for (d = 0; d < n; d++)
            transpose[d][c] = matrix[c][d];

    for (c = 0; c < m; c++)
    {
        for (d = 0; d < n; d++)
        {
            for (k = 0; k < n; k++)
            {
                sum = sum + matrix[c][k] * transpose[k][d];
            }

            product[c][d] = sum;
            sum = 0;
        }
    }

    for (c = 0; c < m; c++)
    {
        for (d = 0; d < m; d++)
        {
            if (c == d)
            {
                if (product[c][d] != 1)
                    break;
            }
            else
            {
                if (product[c][d] != 0)
                    break;
            }
        }
        if (d != m)
            break;
    }
    if (c != m)
        printf("The matrix isn't orthogonal.\n");
    else
        printf("The matrix is orthogonal.\n");

    return 0;
}