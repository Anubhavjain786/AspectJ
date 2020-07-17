
package customer;
public class Banking 
{  
String[] custName=new String[10];
int noOfAccounts=1000,i=0;
int[] accNo=new int[10];
double[] balance=new double[10];
public void CustopenNewAccount(String customerName, double openingBalance)
{
noOfAccounts++;
custName[i]=customerName;
accNo[i]=noOfAccounts;
balance[i] = openingBalance;
System.out.println(" Hii... "+custName[i]);
System.out.println(" Your account number : "+accNo[i++]);
}
public void CustCredit(int accNum,int amount)
{
if(accNum>noOfAccounts&&accNum<1000)
System.out.println(" Account Not Created.");
else
{
for(int j=0;j<noOfAccounts-1000;j++)
{
if(accNo[j]==accNum)
{
balance[j]+=amount;
System.out.println(" Amount Deposit : "+ amount );
break;
}
}
}
}
public void CustDebit(int accNum,int amount)
{
if(accNum>noOfAccounts&&accNum<1000)
System.out.println(" Account Not Created.");
else
{
for(int j=0;j<noOfAccounts-1000;j++)
{
if(accNo[j]==accNum)
{
if(balance[j]<amount)
System.out.println(" Insufficient Balance.");
else
{
balance[j]-=amount;
System.out.println(" Amount Remaining : "+ balance[j] );
}
break;
}
}
}
}
public void CustcheckBalance(int accNum)
{
if(accNum>noOfAccounts&&accNum<1000)
System.out.println(" Account Not Created.");
else
{
for(int j=0;j<noOfAccounts-1000;j++)
if(accNo[j]==accNum)
{
System.out.println(" Account balance : "+ balance[j] );
break;
}
}
}
}



