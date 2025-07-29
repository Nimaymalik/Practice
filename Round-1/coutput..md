C

#include <stdio.h>
int main() {
    int a = 10;
    printf("%d %d\n", a, a++);
    return 0;
}
What is the most likely output of this code?
A) 10 10
B) 11 10
C) 10 11
D) Undefined behavior

C

#include <stdio.h>
int main() {
    int x = 5;
    if (x++ > 5) {
        printf("Hello\n");
    } else {
        printf("Hi\n");
    }
    return 0;
}
What is the output of this code?
A) Hello
B) Hi
C) Hello\nHi
D) Compilation error

C

#include <stdio.h>
int main() {
    char str[] = "C Language";
    char *p = str;
    printf("%c\n", *(p + 2));
    return 0;
}
What is the output of this code?
A) C
B) L
C) Space
D) a

C

#include <stdio.h>
int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int *ptr = arr + 2;
    printf("%d\n", *ptr);
    return 0;
}
What is the output of this code?
A) 10
B) 20
C) 30
D) 40

C

#include <stdio.h>
int main() {
    int i = 0;
    for (i = 0; i < 3; i++) {
        printf("%d ", i);
    }
    return 0;
}
What is the output of this code?
A) 0 1 2
B) 1 2 3
C) 0 1 2 3
D) 1 2

C

#include <stdio.h>
int main() {
    int a = 5, b = 10;
    printf("%d\n", a > b ? a : b);
    return 0;
}
What is the output of this code?
A) 5
B) 10
C) 0
D) Compiler error

C

#include <stdio.h>
void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
}
int main() {
    int a = 10, b = 20;
    swap(a, b);
    printf("a = %d, b = %d\n", a, b);
    return 0;
}
What is the output of this code?
A) a = 20, b = 10
B) a = 10, b = 20
C) a = 0, b = 0
D) Runtime error

C

#include <stdio.h>
int main() {
    float f = 3.14;
    int i = (int)f;
    printf("%d\n", i);
    return 0;
}
What is the output of this code?
A) 3.14
B) 3
C) 4
D) Compiler error

C

#include <stdio.h>
int main() {
    int x = 2;
    switch (x) {
        case 1: printf("One");
        case 2: printf("Two");
        case 3: printf("Three");
        default: printf("Default");
    }
    printf("\n");
    return 0;
}
What is the output of this code?
A) Two
B) TwoThreeDefault
C) OneTwoThreeDefault
D) Default

C

#include <stdio.h>
int main() {
    printf("%d\n", sizeof(int)); // Assuming int is 4 bytes
    return 0;
}
What is the output of this code (assuming int is 4 bytes)?
A) 2
B) 4
C) 8
D) Depends on the system

C

#include <stdio.h>
int main() {
    char ch = 'A';
    printf("%d\n", ch);
    return 0;
}
What is the output of this code (assuming ASCII)?
A) A
B) 65
C) 0
D) Compiler error

C

#include <stdio.h>
int main() {
    int a = 10;
    printf("%d\n", a++ + ++a);
    return 0;
}
What is the most likely output of this code (considering typical compiler behavior, though undefined behavior exists)?
A) 20
B) 21
C) 22
D) Undefined behavior

C

#include <stdio.h>
int main() {
    int arr[5];
    printf("%d\n", arr[5]); // Accessing out of bounds
    return 0;
}
What is the output of this code?
A) 0
B) A garbage value
C) Compilation error
D) Runtime error / Segmentation Fault (depends on OS/compiler)

C

#include <stdio.h>
int main() {
    int i = 0;
    while (i < 3) {
        printf("%d ", i);
        i++;
    }
    return 0;
}
What is the output of this code?
A) 0 1 2
B) 1 2 3
C) 0 1 2 3
D) Infinite loop

C

#include <stdio.h>
#define MAX 10
int main() {
    printf("%d\n", MAX * 2 + 5);
    return 0;
}
What is the output of this code?
A) 25
B) 30
C) 15
D) Compiler error

C

#include <stdio.h>
int main() {
    int a = 10, b = 2;
    printf("%d\n", a / b);
    return 0;
}
What is the output of this code?
A) 5.0
B) 5
C) 2
D) 10

C

#include <stdio.h>
int main() {
    int x = 1, y = 2, z = 3;
    printf("%d\n", x < y && y < z);
    return 0;
}
What is the output of this code?
A) 1
B) 0
C) True
D) False

C

#include <stdio.h>
int main() {
    char *s = "Hello";
    printf("%s\n", s + 1);
    return 0;
}
What is the output of this code?
A) Hello
B) H
C) ello
D) Compiler error

C

#include <stdio.h>
int main() {
    int i;
    for (i = 0; i < 5; i++) {
        if (i == 2) continue;
        printf("%d ", i);
    }
    return 0;
}
What is the output of this code?
A) 0 1 2 3 4
B) 0 1 3 4
C) 0 1 2
D) 3 4

C

#include <stdio.h>
int main() {
    int arr[3] = {1, 2, 3};
    int *ptr = arr;
    printf("%d %d\n", *(ptr++), *ptr);
    return 0;
}
What is the most likely output of this code?
A) 1 2
B) 2 1
C) 1 1
D) Undefined behavior