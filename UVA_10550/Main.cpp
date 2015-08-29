#include <stdio.h>
#include <iostream>
#include <cmath>
using namespace std;
int main(int argc, char const *argv[]) {
  int init,p1,p2,p3,tcomb;
  int tang;
  int aux,aux2;

  while(scanf("%d %d %d %d", &init,&p1,&p2,&p3) && (init || p1 || p2 || p3)){
    tang=360*3;//3 vueltas completas
    aux=init-p1; //clockwise
    if(aux<0){
      aux+=40;
    }
    aux2+=aux;
    aux=p2-p1;//counter-clockwise
    if(aux<0){
      aux+=40;
    }
    aux2+=aux;
    aux=p2-p3;//clockwise again
    if(aux<0){
      aux+=40;
    }
    aux2+=aux;
    tang+=aux2*9;
    printf("%d\n",tang);
    aux2=0;
  }
  return 0;
}
