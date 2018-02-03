#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <assert.h>
void insertionSort(int ar_size, int *  ar) {
    for(int i = 1; i < ar_size; i++){
        int k = ar[i];
        int c = i-1;
        while(ar[c]>k){
            ar[c+1] = ar[c];
            c--;
        }
        ar[c+1] = k;
        for(int i = 0; i < ar_size; i++)printf("%d\t",ar[i]);
        printf("\n");
    }
}
int main(void) {
   
   int _ar_size;
scanf("%d", &_ar_size);
int _ar[_ar_size], _ar_i;
for(_ar_i = 0; _ar_i < _ar_size; _ar_i++) { 
   scanf("%d", &_ar[_ar_i]); 
}

insertionSort(_ar_size, _ar);
   
   return 0;
}
