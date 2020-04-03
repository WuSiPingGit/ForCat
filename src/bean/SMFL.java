package bean;
/*
 * SMFL代表SaveMassagerForLaod是登陆页面数据存储与逻辑控制元件
 */
public class SMFL{
	public SMFL() {}
	/*
	 * 注册数据
	 */
	//三个判断是否可以继续注册；
	static public boolean checkGoOn = false;
    static public boolean checkGoOn1 = false;
	static public boolean checkGoOn2 = false;
	//保存密码、名字
	static public String saveCiper = "Ab12C23Z69T2";
	static public String saveReCiper="x";
	static public String saveName = "b";
	/*
	 * 登陆数据
	 */
	static public String laodCiper = "a";
	static public String laodCount="x";
	static public String MySQLlaodCiper = "b";
	static public String MySQLlaodCount="c";
	static public boolean checkCiperLength = false;//检查长度是否正确
	static public boolean checkCountLength = false;
	static public boolean checkLaodOn = false;//判断是否账号密码正确
//	static String doMassager = "b";  //是否为管理员；待修改
//	static public boolean checkdoMassager = false;//判断是否为管理员
	/*
	 * 他的密保问题、新的账号、他的密码
	 */
	static public String forgetCiper = "未知找到";
	static public int newUserCount = 0;
	static public int hasFindCiper = 0;
	/*
	 * 修改密码
	 */
	static public String youAnswer = "a";
	static public String getQuestion = "";
	static public String getNumber ="";
	static public String getMySQLAnswer = "";
	static public boolean checkAnswerOn = false;//判断是否正确
}
