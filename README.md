Produce a Sales Report:

Algorithm:

1. Prompt input from user -- customer's number, custom's name, a sale amount, a taxt code;

2. Get input from the user -- Get customer's number, get customer's name, get a sale amount and get a tax code;

3. Apply the tax code to find the sales Tax;

4. Calculate the sales tax due to the sale;

5. Calculate the total amount by adding the sales tax to the sales amount;

6. Produce the report, Print customer's number, customer's name, a sale amount and sales tax and the total amount due;

7. Prompt the user -- "Would you like to continue?";

8. Get input from the user; 

9. Check for 3 things:

    a) Yes - y  - continue --- Re-prompt (Step 1)
    b) No - N - Quit
    c) Other - ... - Error Message
                                 Re-prompt (Step 7)


Pseudocode:

Initialize String response to Null, Initialize Int CustomerNumber to 0, Initialize String name to Null, Initialize sale to 0, 
Initialize Int TaxCode to 0, Initialize Double tax to 0,  Initialize Double total to 0;

Do
Prompt input "Customer's number:", then scan input and store the value as  Int Customer_Number ; 
Prompt input "Customer's name:", then scan input and store the value as  String name ; 
Prompt input "sales amount:", then scan input and store the value as Double sale; 
Prompt input "TaxCode:", then scan input and store the value as  Int TaxCode ; 

If the TaxCode is 0, tax = 0 ,  

If the TaxCode is 1, tax = 0.03*sales amount, total amount = sales amount + sales tax; 

If the TaxCode is 2, tax = 0.05*sales amount, total amount = sales amount + sales tax;

Print "Sales Report";

Print Customer number, name, sales amount, sales tax and the total amount; 

Prompt "Would you like to continue?", then scan input and store it as String response
              if response is "y"
             continue
             if response is not "y"  and not "n"
             print error message, and Promte again: "Would you like to continue?"


WHILE response is not "n"



IPO 

Input                                                               Processing                                                                                                         Output

Customer's number                             Receive Customer's number 

Customer's name                                  Receive Customer's name 

A sale amount                                          Receive A sale amount   

A tax code                                                   Receive A tax code
                                                                           Define tax rate using the taxcode
                                                                           Calculate tax using the tax rate
                                                                            Find the total by adding tax to the sale amount             Display Sales Report contains information:
                                                                                                                                                                                                   Customer's number, Customer's name, Sale amount, Tax and Total amount


response=Continue (y/n?)                 Receive response
                                                                            If response is y, loop back to step 1
                                                                            If response is n, quit
                                                                            If response is not y and is not n, prompt again                              



What control structures (sequence, selection and repetition) are required?
The solution consists of a combination of three constructs: sequence, selection and repetition

What variables are required?
What control structures (sequence, selection and repetition) are required?
What variables are required?


Testing Results 1:

Customer's number:
123
Customer's name:
grace
Sales amount:
99
TaxCode:
0

Sales Report
Customer Number:123
Customer Name:grace
Sales amount:99.0
Tax:0.0
Totoal amount:99.0
Would you like to continue? y/n
y

Customer's number:
567
Customer's name:
Alice
Sales amount:
10
TaxCode:
2

Sales Report
Customer Number:567
Customer Name:Alice
Sales amount:10.0
Tax:0.5
Totoal amount:10.5
Would you like to continue? y/n
n


Test Results 2:
Customer's number:
123
Customer's name:
Henry
Sales amount:
9
TaxCode:
1
Sales Report
Customer Number:123
Customer Name:Henry
Sales amount:9.0
Tax:0.27
Totoal amount:9.27
Would you like to continue? y/n
yes
Error Message: input should be y/n
Would you like to continue? y/n
y
Customer's number:
123456
Customer's name:
Austin
Sales amount:
1999
TaxCode:
2
Sales Report
Customer Number:123456
Customer Name:Austin
Sales amount:1999.0
Tax:99.95
Totoal amount:2098.95
Would you like to continue? y/n
n




 
