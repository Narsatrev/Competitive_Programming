#include <stdio.h>
#include <iostream>

using namespace std;
int main(){
  //h->height of well
  //u->distance snail can climb during the day
  //d->distance the snail slides down in the night
  //f->fatigue factor that is a percentage
  float h,u,d,f,dc,cu;
  int day;

  while(scanf("%f %f %f %f",&h,&u,&d,&f) && h){
    dc =0;
    day=0;
    cu=u*(f/100);

    while(1){
      day++;
      dc+=u;
      if(dc>h){
        printf("failure on day %d\n",day);
        break;
      }
      dc-=d;
      if(dc<0){
        printf("success on day %d\n",day);
        break;
      }
      u-=cu;
      if(u<0){
        u=0;
      }
    }
  }
}
