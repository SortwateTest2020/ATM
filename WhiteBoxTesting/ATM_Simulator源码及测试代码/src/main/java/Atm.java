/*信1705-3 20173442 田昕可*/

import java.io.File;
import java.util.Scanner;



public class Atm {
  Scanner scan = new Scanner(System.in);
  class Account {

    private String accountID;
    private String accountname;
    private String operatedate;//时间
    private int operatetype;//操作
    private String accountpassword;//密码
    private int accountbalance;//余额
    private int amout;//流水金额

    public Account(String accid, String accna, String opeda, String password, int balance) {
      this.accountID = accid;
      this.accountname = accna;
      this.operatedate = opeda;
      this.accountpassword = password;
      this.accountbalance = balance;
    }

    public String getaccountID() {
      return accountID;
    }

    public String getaccountpassword() {
      return accountpassword;
    }

    public void setoperatetype(int opety) {
      operatetype = opety;
    }

    public void jiemian() {
      System.out
          .println("**************************************************************************");
      System.out
          .println("             欢迎" +
              accountID +
              "使用中国工商银行自助柜员系统                                ");
      System.out
          .println("**************************************************************************");
    }

    public void leave(){
      System.out
          .println("**************************************************************************");
      System.out
          .println("             再见" + accountID + "感谢使用中国工商银行自助柜员系统                                ");
      System.out
          .println("**************************************************************************");
    }

    public void caozuo() {
//      Scanner scan1 = new Scanner(System.in);
      int a=0;
      int b=0;
      int c=0;
      String s="";
      String s1="";
      String s2="";
      switch (operatetype) {
        case 1:
          System.out.println("请输入存款金额 : ");
          a = scan.nextInt();
          accountbalance += a;
          System.out.println("存取款操作完成");
          System.out.println("存款余额为 ：" + accountbalance);
          //差一个try语句;
          break;
        case 2:
          System.out.println("当前账户每日可支取2万");
          System.out.println("1.100");
          System.out.println("2.500");
          System.out.println("3.1000");
          System.out.println("4.1500");
          System.out.println("5.2000");
          System.out.println("6.5000");
          System.out.println("7.其他金额");
          b = scan.nextInt();
          switch (b) {
            case 1:
              accountbalance -= 100;
              break;
            case 2:
              accountbalance -= 500;
              break;
            case 3:
              accountbalance -= 1000;
              break;
            case 4:
              accountbalance -= 1500;
              break;
            case 5:
              accountbalance -= 2000;
              break;
            case 6:
              accountbalance -= 5000;
              break;
            case 7:
              System.out.println("输入金额 :");
              c = scan.nextInt();
              accountbalance -= c;
              break;
          }
          System.out.println("取取款操作完成");
          System.out.println("存款余额为 ：" + accountbalance);
          break;
        case 3:
          break;
        case 4:
          System.out.println("请输入修改后的密码");
          s1 = scan.nextLine();
          accountpassword = s1;//修改密码
          System.out.println("修改成功，当前密码为" + accountpassword);
        case 5:
          System.out.println("当前账户余额为：" + accountbalance);
      }

    }//六项操作

  }

  public void main(String[] args) {
    // TODO Auto-generated method stub
    File file1 = new File("accountlist.txt");
    File file2 = new File("accountinformation.txt");
    int i=0;
    int j = -1;
    int t = 0;
    int b=0;
    String c="";
    System.out
        .println("**************************************************************************");
    System.out.println(
        "                  欢迎使用中国工商银行自动柜员系统                                               ");
    System.out
        .println("**************************************************************************");

    Account[] a = new Account[20];
    Account s1 = new Account("20173442", "田昕可", "2018-9-20", "123456", 0);
    Account s2 = new Account("00000001", "张", "2018-9-20", "123456", 0);
    Account s3 = new Account("00000002", "王", "2018-9-20", "123456", 0);
    Account s4 = new Account("00000003", "李", "2018-9-20", "123456", 0);
    Account s5 = new Account("00000004", "赵", "2018-9-20", "123456", 0);
    Account s6 = new Account("00000004", "周", "2018-9-20", "123456", 0);
    Account s7 = new Account("00000014", "魏", "2018-9-20", "123456", 0);
    Account s8 = new Account("00000024", "赵", "2018-9-20", "123456", 0);
    Account s9 = new Account("00000034", "周", "2018-9-20", "123456", 0);
    Account s10 = new Account("00000304", "钱", "2018-9-20", "123456", 0);
    Account s11 = new Account("00000404", "王", "2018-9-20", "123456", 0);
    Account s12 = new Account("00000504", "月", "2018-9-20", "123456", 0);
    Account s13 = new Account("00000604", "赵", "2018-9-20", "123456", 0);
    Account s14 = new Account("00000704", "董", "2018-9-20", "123456", 0);
    Account s15 = new Account("00000104", "钱", "2018-9-20", "123456", 0);
    Account s16 = new Account("00000904", "董", "2018-9-20", "123456", 0);
    Account s17 = new Account("00000804", "王", "2018-9-20", "123456", 0);
    Account s18 = new Account("00001804", "董", "2018-9-20", "123456", 0);
    Account s19 = new Account("00001805", "董", "2018-9-20", "123456", 0);
    Account s20 = new Account("00001806", "董", "2018-9-20", "123456", 0);

    a[0] = s1;
    a[1] = s2;
    a[2] = s3;
    a[3] = s4;
    a[4] = s5;
    a[5] = s6;
    a[6] = s7;
    a[7] = s8;
    a[8] = s9;
    a[9] = s10;
    a[10] = s11;
    a[11]=s12;
    a[12] = s13;
    a[13]=s14;
    a[14] = s15;
    a[15]=s16;
    a[16] = s17;
    a[17]=s18;
    a[18] = s19;
    a[19]=s20;
    System.out.println("                      请输入您的账号");

    String id="";
    String password="";
//    Scanner scan = new Scanner(System.in);
    id = scan.next();
    for (i = 0; i < 5; i++) {
      if (id.equals(a[i].getaccountID())) {
        j = i;
      }
    }
    while(id.length()!=8||j==-1)
    {
      if(id.length()!=8)
        System.out.println("不是工行号,请重新输入");
      else if(j==-1)
        System.out.println(
            "该账号不存在,请重新输入");
      System.out.println("请输入您的账号");
      id=scan.next();
      for (i = 0; i < 5; i++) {
        if (id.equals(a[i].getaccountID())) {
          j = i;
        }
      }
    }

    a[j].jiemian();
    System.out.println("                           请输入密码");
    password = scan.next();
    int num=0;
    while(!a[j].getaccountpassword().equals(password))
    {
      System.out.println("                         请重新输入密码");
      password = scan.next();
      num++;
      if(num==3){
        System.out.println("                      密码次数达到上限");
        return;
      }
    }
    System.out.println("密码正确");
    a[j].jiemian();
    System.out.println("1.存款");
    System.out.println("2.取款");
    System.out.println("3.转账汇款");
    System.out.println("4.修改密码");
    System.out.println("5.查询余额");
    System.out.println("6.退出");
    System.out.println("请输入要实现的功能 ：");
    b = scan.nextInt();
    while (b != 6) {
      a[j].setoperatetype(b);//将操作数字赋值给类成员
      if(b==3)
      {
        System.out.println("请输入转账账户 :");
        c=scan.next();
        int x=-1;
        for (i = 0; i < 5; i++) {
          if (c.equals(a[i].getaccountID())) {
            x = i;
          }
        }
        if(x==-1){
          System.out.println(
              "账户输入错误"
          );
          a[j].jiemian();
          System.out.println("1.存款");
          System.out.println("2.取款");
          System.out.println("3.转账汇款");
          System.out.println("4.修改密码");
          System.out.println("5.查询余额");
          System.out.println("请输入要实现的功能 ：");
          b = scan.nextInt();
          continue;
        }
        int money=0;
        System.out.println("请输入转账金额 :");
        money=scan.nextInt();
        a[j].accountbalance-=money;
        System.out.println("当前账户余额为：" + a[j].accountbalance);
      }
      a[j].caozuo();
      a[j].jiemian();
      System.out.println("1.存款");
      System.out.println("2.取款");
      System.out.println("3.转账汇款");
      System.out.println("4.修改密码");
      System.out.println("5.查询余额");
      System.out.println("请输入要实现的功能 ：");
      b = scan.nextInt();
    }

    a[j].leave();
  }
}