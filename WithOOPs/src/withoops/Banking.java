package withoops;

public class Banking 
{  
static Banking obj=new Banking(); 
String[] custName=new String[10];
int i=0;
int noOfAccounts=1000;
int[] accNo=new int[10];
double[] balance=new double[10];
public void openNewAccount(String customerName, double openingBalance)
{
noOfAccounts++;
custName[i]=customerName;
accNo[i]=noOfAccounts;
balance[i] = openingBalance;
obj.welcome();
System.out.println(" Hii... "+custName[i]);
System.out.println(" Your account number : "+accNo[i++]);
obj.withoutAspect();
}
public void Credit(int accNum,int amount)
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
obj.withoutAspect();
break;
}
}
}
}
public void Debit(int accNum,int amount)
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
obj.withoutAspect();
}
break;
}
}
}
}
public void checkBalance(int accNum)
{
if(accNum>noOfAccounts&&accNum<1000)
System.out.println(" Account Not Created.");
else
{
for(int j=0;j<noOfAccounts-1000;j++)
if(accNo[j]==accNum)
{
System.out.println(" Account balance : "+ balance[j] );
obj.withoutAspect();
break;
}
}
}
public void withoutAspect()
{
System.out.println(" Account Updated Sucessfully...!!!");
}
public void welcome()
{
System.out.println(" Welcome...!!!");
}
}
