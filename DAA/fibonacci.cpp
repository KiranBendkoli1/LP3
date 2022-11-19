// Write a program non-recursive and recursive program to calculate Fibonacci numbers and analyze their time and space complexity
#include <iostream>
using namespace std;

void recFibonacci(int n,int n1,int n2){
	int n3;  
    if(n>0){    
        n3 = n1 + n2;    
        n1 = n2;    
        n2 = n3;    
        cout<<n3<<"\t";    
        recFibonacci(n-1, n1, n2);    
    }    

}

void fibonacci(int n)
{
    int n1=0,n2=1,n3=0,count=0;
    cout << 0 << "\t" << 1 << "\t";
    while(count<n)
    {
        n3 = n1 + n2;
        cout << n3 << "\t";
        n1 = n2;
        n2 = n3;
        count++;
    }
    cout<<endl;
}
int main() {
    int n;
    cout << "Enter number of terms you want";
    cin >> n;
    cout << "--------------------------without recursion------------------------\n";
    fibonacci(n);
    cout << "\n\n----------------------------with recursion-------------------------\n";

    cout << 0 <<"\t" << 1 << "\t";
    recFibonacci(n,0,1);
    cout << endl;
    
    return 0;
}

/*

Enter number of terms you want 10
--------------------------without recursion------------------------
0       1       1       2       3       5       8       13      21      34      55      89


----------------------------with recursion-------------------------
0       1       1       2       3       5       8       13      21      34      55      89

*/
