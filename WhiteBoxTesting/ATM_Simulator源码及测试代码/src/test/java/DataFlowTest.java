import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DataFlowTest {

  String data = "";
  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());

  @Before
  public void setUp() throws Exception {
    System.setOut(new PrintStream(outContent));
    System.setIn(input);
  }

  @After
  public void tearDown() throws Exception {
    System.setOut(null);
    System.setIn(null);
  }


  @Test
  public void test101_var_i() {
    String data = "111\n20173402\n" +
        "20173442\n" +
        "12345\n"+
        "123456\n"+
        "6";
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
    System.setOut(new PrintStream(outContent));
    System.setIn(input);
    String[] a= {"1"};
    new Atm().main(a);
    assertEquals("**************************************************************************\n" +
        "                  欢迎使用中国工商银行自动柜员系统                                               \n" +
        "**************************************************************************\n" +
        "                      请输入您的账号\n" +
        "不是工行号,请重新输入\n" +
        "请输入您的账号\n" +
        "该账号不存在,请重新输入\n" +
        "请输入您的账号\n" +
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "                           请输入密码\n" +
        "                         请重新输入密码\n" +
        "密码正确\n" +
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "6.退出\n" +
        "请输入要实现的功能 ：\n"+
        "**************************************************************************\n" +
        "             再见20173442感谢使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n",outContent.toString());
  }


  @Test
  public void test102_var_j() {
    data = "20173442\n" +
        "123456\n"+
        "4\n"+"111111\n"+"6\n";
    input = new ByteArrayInputStream(data.getBytes());
    System.setIn(input);
    String[] a= {"1"};
    new Atm().main(a);
    assertEquals("**************************************************************************\n" +
            "                  欢迎使用中国工商银行自动柜员系统                                               \n" +
            "**************************************************************************\n" +
            "                      请输入您的账号\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "                           请输入密码\n" +"密码正确\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "6.退出\n" +
            "请输入要实现的功能 ：\n" +
            "请输入修改后的密码\n" +
            "修改成功，当前密码为\n" +
            "当前账户余额为：0\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "请输入要实现的功能 ：\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "请输入要实现的功能 ：\n"+"**************************************************************************\n" +
            "             再见20173442感谢使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n"
        ,outContent.toString());
  }

  @Test
  public void test103_var_b(){
    data = "111\r\n20173402\n" +
        "20173442\n" +
        "12345\n"+
        "123456\n"+
        "1\n"+
        "10105\n"+
        "2\n"+
        "1\n"+
        "2\n"+
        "2\n"+
        "2\n"+
        "3\n"+
        "2\n"+
        "4\n"+
        "2\n"+
        "5\n"+
        "2\n"+
        "6\n"+
        "2\n"+
        "7\n"+
        "5\n"+
        "6\n";
    input = new ByteArrayInputStream(data.getBytes());
    System.setIn(input);
    String[] a= {"1"};
    new Atm().main(a);
    assertEquals("**************************************************************************\n" +
        "                  欢迎使用中国工商银行自动柜员系统                                               \n" +
        "**************************************************************************\n" +
        "                      请输入您的账号\n" +
        "不是工行号,请重新输入\n" +
        "请输入您的账号\n" +
        "该账号不存在,请重新输入\n" +
        "请输入您的账号\n" +
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "                           请输入密码\n" +
        "                         请重新输入密码\n" +
        "密码正确\n" +
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "6.退出\n" +
        "请输入要实现的功能 ：\r\n请输入存款金额 : \n" +
        "存取款操作完成\n" +
        "存款余额为 ：10105\n" +
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "请输入要实现的功能 ：\n"+
        "当前账户每日可支取2万\n" +
        "1.100\n" +
        "2.500\n" +
        "3.1000\n" +
        "4.1500\n" +
        "5.2000\n" +
        "6.5000\n" +
        "7.其他金额\n" +
        "取取款操作完成\n" +
        "存款余额为 ：10005\n"+
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "请输入要实现的功能 ：\n"+
        "当前账户每日可支取2万\n" +
        "1.100\n" +
        "2.500\n" +
        "3.1000\n" +
        "4.1500\n" +
        "5.2000\n" +
        "6.5000\n" +
        "7.其他金额\n" +
        "取取款操作完成\n" +
        "存款余额为 ：9505\n"+
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "请输入要实现的功能 ：\n"+
        "当前账户每日可支取2万\n" +
        "1.100\n" +
        "2.500\n" +
        "3.1000\n" +
        "4.1500\n" +
        "5.2000\n" +
        "6.5000\n" +
        "7.其他金额\n" +
        "取取款操作完成\n" +
        "存款余额为 ：8505\n"+
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "请输入要实现的功能 ：\n"+
        "当前账户每日可支取2万\n" +
        "1.100\n" +
        "2.500\n" +
        "3.1000\n" +
        "4.1500\n" +
        "5.2000\n" +
        "6.5000\n" +
        "7.其他金额\n" +
        "取取款操作完成\n" +
        "存款余额为 ：7005\n"+
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "请输入要实现的功能 ：\n"+
        "当前账户每日可支取2万\n" +
        "1.100\n" +
        "2.500\n" +
        "3.1000\n" +
        "4.1500\n" +
        "5.2000\n" +
        "6.5000\n" +
        "7.其他金额\n" +
        "取取款操作完成\n" +
        "存款余额为 ：5005\n"+
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "请输入要实现的功能 ：\n"+
        "当前账户每日可支取2万\n" +
        "1.100\n" +
        "2.500\n" +
        "3.1000\n" +
        "4.1500\n" +
        "5.2000\n" +
        "6.5000\n" +
        "7.其他金额\n" +
        "取取款操作完成\n" +
        "存款余额为 ：5\n"+
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "请输入要实现的功能 ：\n"+
        "当前账户每日可支取2万\n" +
        "1.100\n" +
        "2.500\n" +
        "3.1000\n" +
        "4.1500\n" +
        "5.2000\n" +
        "6.5000\n" +
        "7.其他金额\n" +
        "输入金额 :\n"+
        "取取款操作完成\n" +
        "存款余额为 ：0\n"+
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "1.存款\n" +
        "2.取款\n" +
        "3.转账汇款\n" +
        "4.修改密码\n" +
        "5.查询余额\n" +
        "请输入要实现的功能 ：\n"+
        "**************************************************************************\n" +
        "             再见20173442感谢使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n",outContent.toString());
  }

  @Test
  public void test104_var_a(){
    String data = "20173442\n" +
        "123456\n"+
        "4\n"+
        "1234\n"+
        "6";
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
    System.setOut(new PrintStream(outContent));
    System.setIn(input);
    String[] a= {"1"};
    new Atm().main(a);
    assertEquals("**************************************************************************\n" +
            "                  欢迎使用中国工商银行自动柜员系统                                               \n" +
            "**************************************************************************\n" +
            "                      请输入您的账号\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "                           请输入密码\n" +
            "密码正确\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "6.退出\n" +
            "请输入要实现的功能 ：\n"+
            "请输入修改后的密码\n" +
            "修改成功，当前密码为\n" +
            "当前账户余额为：0\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "请输入要实现的功能 ：\n"+
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "请输入要实现的功能 ：\n"+
            "**************************************************************************\n" +
            "             再见20173442感谢使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n"
        ,outContent.toString());
    }

  @Test
  public void test105_var_id() {
    data = "20173442\n" +
        "123456\n"+
        "5\n"+"6\n";
    input = new ByteArrayInputStream(data.getBytes());
    System.setIn(input);
    String[] a= {"1"};
    new Atm().main(a);
    assertEquals("**************************************************************************\n" +
            "                  欢迎使用中国工商银行自动柜员系统                                               \n" +
            "**************************************************************************\n" +
            "                      请输入您的账号\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "                           请输入密码\n" +"密码正确\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "6.退出\n" +
            "请输入要实现的功能 ：\n"+"当前账户余额为：0\n"+
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +"请输入要实现的功能 ：\n"+"**************************************************************************\n" +
            "             再见20173442感谢使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n"
        ,outContent.toString());
  }

  @Test
  public void test106_var_password() {
    data = "111\r\n20173402\n" +
        "20173442\n" +
        "12345\n"+
        "11\n"+
        "1234\n"+
        "1\n";
    input = new ByteArrayInputStream(data.getBytes());
    System.setIn(input);
    String[] a= {"1"};
    new Atm().main(a);
    assertEquals("**************************************************************************\n" +
        "                  欢迎使用中国工商银行自动柜员系统                                               \n" +
        "**************************************************************************\n" +
        "                      请输入您的账号\n" +
        "不是工行号,请重新输入\n" +
        "请输入您的账号\n" +
        "该账号不存在,请重新输入\n" +
        "请输入您的账号\n"+
        "**************************************************************************\n" +
        "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
        "**************************************************************************\n" +
        "                           请输入密码\n" +
        "                         请重新输入密码\n" +
        "                         请重新输入密码\n" +
        "                         请重新输入密码\n" +
        "                      密码次数达到上限\n",outContent.toString());
  }

  @Test
  public void test107_var_accountbalence() {
    String data = "20173442\n" +
        "123456\n"+
        "3\n"+
        "00000001\n"+
        "100\n"+
        "6";
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
    System.setOut(new PrintStream(outContent));
    System.setIn(input);
    String[] a= {"1"};
    new Atm().main(a);
    assertEquals("**************************************************************************\n" +
            "                  欢迎使用中国工商银行自动柜员系统                                               \n" +
            "**************************************************************************\n" +
            "                      请输入您的账号\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "                           请输入密码\n" +
            "密码正确\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "6.退出\n" +
            "请输入要实现的功能 ：\n"+
            "请输入转账账户 :\n" +
            "请输入转账金额 :\n"+
            "余额不足，操作失败"+
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "请输入要实现的功能 ：\n"+
            "**************************************************************************\n" +
            "             再见20173442感谢使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n"
        ,outContent.toString());
  }

  @Test
  public void test107_var_accountpassword() {
    data = "20173442\n" +
        "123456\n"+
        "4\n"+"654321\n"+"6\n";
    input = new ByteArrayInputStream(data.getBytes());
    System.setIn(input);
    String[] a= {"1"};
    new Atm().main(a);
    assertEquals("**************************************************************************\n" +
            "                  欢迎使用中国工商银行自动柜员系统                                               \n" +
            "**************************************************************************\n" +
            "                      请输入您的账号\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "                           请输入密码\n" +"密码正确\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "6.退出\n" +
            "请输入要实现的功能 ：\n" +
            "请输入修改后的密码\n" +
            "修改成功，当前密码为\n" +
            "当前账户余额为：0\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "请输入要实现的功能 ：\n" +
            "**************************************************************************\n" +
            "             欢迎20173442使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n" +
            "1.存款\n" +
            "2.取款\n" +
            "3.转账汇款\n" +
            "4.修改密码\n" +
            "5.查询余额\n" +
            "请输入要实现的功能 ：\n"+"**************************************************************************\n" +
            "             再见20173442感谢使用中国工商银行自助柜员系统                                \n" +
            "**************************************************************************\n"
        ,outContent.toString());
  }



}