interface MessCustomer{
boolean DoCustAuth(String IDNO, String Password);
//Mess getMess();
int getDues();
String getMenu(int day, int time);
void giveFeedback(String feedback);
boolean applyLeave(int start,int month, int no_of_days);
String getMessInfo();
}

