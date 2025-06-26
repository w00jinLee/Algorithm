#include <stdio.h>

int main(void) {
  int e,m,s;
  scanf("%d %d %d", &e,&m,&s);
  int i = 1;
  while(1){
    if(((i-e)%15==0) && ((i-m)%28==0) && ((i-s)%19==0))
      break;
    i++;
  }
  printf("%d", i);
}