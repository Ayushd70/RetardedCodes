//C programming code for binary search using recursion 
#include <stdio.h>
 
int RecursiveBinarySearching(int arr[], int low, int high, int element)
{
      int middle;
      if(low > high)
      {
            return -1;
      }
      middle = (low + high) / 2;
      if(element > arr[middle])
      {
            RecursiveBinarySearching(arr, middle + 1, high, element);
      }
      else if(element < arr[middle])
      {
            RecursiveBinarySearching(arr, low, middle - 1, element);
      }
      else
      {
            return middle;
      }
}
 
int main()
{
      int count, element, limit, arr[50], position;
      printf("\nEnter the Limit of Elements in Array:\t");
      scanf("%d", &limit);
      printf("\nEnter %d Elements in Array: \n", limit);
      for(count = 0; count < limit; count++)
      {
            scanf("%d", &arr[count]);
      }
      printf("\nEnter Element To Search:\t");
      scanf("%d", &element);
      position = RecursiveBinarySearching(arr, 0, limit - 1, element);
      if(position == -1)
      {
            printf("\nElement %d Not Found\n", element);
      }
      else
      {
            printf("\nElement %d Found at Position %d\n", element, position + 1);
      }
      return 0;
}
