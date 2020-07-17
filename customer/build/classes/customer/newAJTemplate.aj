package customer;
public aspect newAJTemplate
{
pointcutcall AspectCredit() : call(public void Cust*(..));
pointcutcall Aspectyo() : call(public void Custopen*(..));
after(): callAspectCredit()
{
System.out.println(" Account Updated Sucessfully...!!!");
}
before(): callAspectyo()
{
System.out.println(" Welcome...!!!");
}
}
