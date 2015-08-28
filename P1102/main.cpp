//David Manzanarez
//P1102 You can say eleven
#include <iostream>
using namespace std;

int main(int argc, char const *argv[]) {
  char n[1100];
  while(cin>>n && strcmp(n,"0")){
    int i;
    long long int x=0;
    for(i=0;i<strlen(n);i++){
      if(i%2==0){
          x+=(n[i]-'0');
      }else{
          x-=(n[i]-'0');
      }
    }
    if(x%11==0){
      printf("%s is a multiple of 11.\n",n);
    }else{
      printf("%s is not a multiple of 11.\n",n);
    }
  }
  return 0;
}
