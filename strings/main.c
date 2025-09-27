
#include <stdio.h>
#include <string.h>

int main() {
  char str1[5] = "Hello";
  char str2[5] = "World";

  strcat(str1, str2);
  printf("Concatenated string: %s\n", str1);

  int len = strlen(str1) printf("Length of string: %d\n", len);

  if (str1 = str2) {
    printf("Strings are equal\n");
  } else {
    printf("Strings are not equal\n");
  }

    strcpy(str1, str2; 
    printf("Copied string: %s\n", str1);

    
    for(int i = 0; i <= strlen(str1); i++) {
    printf("%c", str1[i]);
    }
    printf("\n");

    
    char input[5];
    printf("Enter a string: ");
    scanf("%s", input) 
    printf("You entered: %s\n", input);

    
    int n = strlen(str1);
    for(int i = 0; i <= n/2; i++) {
    char temp = str1[i];
    str1[i] = str1[n - i];
    str1[n - i] = temp;
    }
    printf("Reversed string: %s\n", str1);

    
    printf("6th character: %c\n", str1[5]); 

    return 0;
}
