#include <iostream>
#include <cmath>

using namespace std;
int main(int argc, char const *argv[]) {

  long long int n;
  while(scanf("%lld",&n)&&n){
    double a;
    a=sqrt((n*n+n)/2);
    printf("%f\n",a);
  }
  return 0;
}
