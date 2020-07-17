
package customer;
import java.util.Scanner;
public class Customer
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
Banking myBank = new Banking();
int ch;
do {
System.out.println("\n Press 1 to Open a new bank account.");
System.out.println(" Press 2 to Deposit to a bank account.");
System.out.println(" Press 3 to Withdraw to bank account.");
System.out.println(" Press 4 to Print short account information.");
System.out.println(" Press 5 to  Quit.");
System.out.print("\n Enter choice [1-5] : ");
ch = s.nextInt();
switch(ch) {
case 1: System.out.print(" Enter a customer name : ");
String cn = s.next();
System.out.print(" Enter a opening balance : ");
double d = s.nextDouble();
System.out.println("\n Account created.");
myBank.CustopenNewAccount(cn, d);
break;
case 2: System.out.print(" Enter a account number : ");
int an = s.nextInt();
System.out.print(" Enter a deposit amount : ");
int da = s.nextInt();
myBank.CustCredit(an, da);
break;
case 3: System.out.print(" Enter a account number : ");
int acn = s.nextInt();
System.out.print(" Enter a withdraw amount : ");
int wa = s.nextInt();
myBank.CustDebit(acn,wa);
break;
case 4: System.out.print(" Enter a account number : ");
int anum = s.nextInt();
myBank.CustcheckBalance(anum);
break;
case 5: System.exit(0);
break;
}
}while (true);
}
}

