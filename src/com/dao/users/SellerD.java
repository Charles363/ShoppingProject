package com.dao.users;

import java.sql.SQLException;

import com.vo.SellerAccount;
import com.vo.SellerInfo;

/**
 * @author ������
 * ������ص��������ݿ�ӿ�
 */
public interface SellerD {

	/**
	 * ���ڼ���Ƿ���������������˺�
	 * @param �����˺�SellerAccount,��Ҫ����s_act,s_pwd,s_status
	 * @return �Ƿ���������˺�
	 * @throws SQLException
	 */
	public boolean selectAccount(SellerAccount sa)throws SQLException;
	
	
	/**
	 * ���ڼ���Ƿ���������������û���
	 * @param �����˺�SellerAccount,��Ҫ����s_act
	 * @return �Ƿ���������������û���
	 * @throws SQLException
	 */
	public boolean selectAct(SellerAccount sa)throws SQLException;
	
	
	/**
	 * �����޸������˺ŵ�����
	 * @param �����˺�SellerAccount,��Ҫ����s_act
	 * @param �ַ���pwd,�޸ĺ��������
	 * @return �޸��Ƿ�ɹ�
	 * @throws SQLException
	 */
	public boolean updatePwd(SellerAccount sa,String pwd)throws SQLException;
	
	
	/**
	 * ���ڼ���һ���µ������û��˺�
	 * @param �����˺�SellerAccount,��Ҫ����s_act,s_pwd
	 * @return ����Ƿ�ɹ�
	 * @throws SQLException
	 */
	public boolean insertAccount(SellerAccount sa)throws SQLException;
	
	
	/**
	 * ���ڼ���һ���µ������û���Ϣ
	 * @param ������ϢSellerInfo,��Ҫ����s_act,a_act
	 * @return ����Ƿ�ɹ�
	 * @throws SQLException
	 */
	public boolean insertInfo(SellerInfo si)throws SQLException;
	
	
}
