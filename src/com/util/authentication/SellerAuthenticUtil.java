package com.util.authentication;

import com.vo.SellerAccount;

/**
 * @author ������
 * ������֤���ܵĽӿ�
 */
public interface SellerAuthenticUtil {

	
	/**
	 * ���ڼ�鵱ǰ���û��Ƿ��ܹ�ͨ����¼��֤
	 * @param �����˺�SellerAccount,��Ҫ����s_act,s_pwd
	 * @return ���������˺ŷ���"buyer",����������˺ŷ���"seller",����������򷵻�null
	 */
	public String checkLogin(SellerAccount sa);
	
	
	/**
	 * �����޸������˺ŵ�����
	 * @param �����˺�SellerAccount,��Ҫ����s_act,s_pwd
	 * @param �ַ���new_pwd,�޸ĺ��������
	 * @return �޸��Ƿ�ɹ�
	 */
	public boolean changePwd(SellerAccount sa,String new_pwd);
	
}
