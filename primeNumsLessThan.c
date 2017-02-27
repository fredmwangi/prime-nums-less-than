#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

int main( ) {
  int number;
  int arraypos = 0;
  bool prime;
  int *primes;

  printf("Enter an integer: ");
  scanf("%d", &number);

  primes = (int *)malloc(number * sizeof(int));
  if (NULL == primes) {
  fprintf(stderr, "malloc failed\n");
  return(-1);
  }

  for (int i = 2; i < number; i++) {
    prime = true;
    for (int k = 2; k < i; k++) {
      if (i%k == 0) {
        prime = false;
        break;
      }
    }
    if (prime == true) {
      primes[arraypos] = i;
      arraypos++;
    }
  }

  for (int i = 0; i < number; i++) {
    if (primes[i] == 0) {
      break;
    }
    if (i == 0) {
      printf("%d" ,primes[i]);
    }
    else{
      printf(", %d" ,primes[i]);
    }
  }

  free((int*) primes);
  return 0;
}
