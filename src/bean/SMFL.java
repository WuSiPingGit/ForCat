package bean;
/*
 * SMFL����SaveMassagerForLaod�ǵ�½ҳ�����ݴ洢���߼�����Ԫ��
 */
public class SMFL{
	public SMFL() {}
	/*
	 * ע������
	 */
	//�����ж��Ƿ���Լ���ע�᣻
	static public boolean checkGoOn = false;
    static public boolean checkGoOn1 = false;
	static public boolean checkGoOn2 = false;
	//�������롢����
	static public String saveCiper = "Ab12C23Z69T2";
	static public String saveReCiper="x";
	static public String saveName = "b";
	/*
	 * ��½����
	 */
	static public String laodCiper = "a";
	static public String laodCount="x";
	static public String MySQLlaodCiper = "b";
	static public String MySQLlaodCount="c";
	static public boolean checkCiperLength = false;//��鳤���Ƿ���ȷ
	static public boolean checkCountLength = false;
	static public boolean checkLaodOn = false;//�ж��Ƿ��˺�������ȷ
//	static String doMassager = "b";  //�Ƿ�Ϊ����Ա�����޸�
//	static public boolean checkdoMassager = false;//�ж��Ƿ�Ϊ����Ա
	/*
	 * �����ܱ����⡢�µ��˺š���������
	 */
	static public String forgetCiper = "δ֪�ҵ�";
	static public int newUserCount = 0;
	static public int hasFindCiper = 0;
	/*
	 * �޸�����
	 */
	static public String youAnswer = "a";
	static public String getQuestion = "";
	static public String getNumber ="";
	static public String getMySQLAnswer = "";
	static public boolean checkAnswerOn = false;//�ж��Ƿ���ȷ
}
