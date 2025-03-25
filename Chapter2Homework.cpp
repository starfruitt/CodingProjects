

 /*****************************************\
 * Program to demonstrate a
 * simple cash register program  
 * written by Johannely Rodriguez   
 * 2/4/2025
\*****************************************/
 
#include <iostream>
#include <iomanip>
using namespace std;

int main()
{

  // declare and initialize the variables
  int quantity = 0;
  double price = 0, subtotal = 0;
  double tax = 0, total = 0;
  double amount_tendered = 0, change = 0;

  // prompt user and receive the data 
  cout << "please enter the item price:    ";
  cin >> price; 
  cout << "please enter the item quantity: ";
  cin >> quantity;

  // set the output manipulation values
  cout.setf(ios::fixed);
  cout.precision(2);

// alternate set  output manipulation values
// cout << fixed << setprecision(2);

  // process the input data and display the output 
  subtotal = price * quantity;
  cout << "\nsubtotal: \t$" << setw(10) << subtotal << endl;

  tax = subtotal * 0.05;
  cout << "\ntax:      \t$" << setw(10) << tax << endl;

  total = tax + subtotal;
  cout << "\ntotal:    \t$" << setw(10) << total << endl;
  cout << "please enter the amount tendered: " << endl;
  cin >> amount_tendered;
  change = amount_tendered - total;
  cout << "thank you, your change is " << change << endl;

  cout << "\n\n";
  cout << "press [Enter] to close this window\n";

  system("pause");
  return 0;

}

