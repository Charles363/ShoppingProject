package com.dao.users;

import java.sql.SQLException;

import com.vo.AdminAccount;

/**
 * @author ������
 * ����Ա����������ݿ�ӿ�
 */
public interface AdminD {

	/**
	 * ���ڼ�����Ա�˺��Ƿ����
	 * @param ����Ա�˺�AdminAccount,��Ҫ����a_act,a_pwd.
	 * @return ���ݿ����Ƿ�����������Ա�˺�.
	 * @throws SQLException
	 */
	public boolean selectAccount(AdminAccount aa)throws SQLException;
	
	
	/**
	 * �����޸Ĺ���Ա�˺ŵ�����
	 * @param �����˺�AdminAccount,��Ҫ����a_act.
	 * @param �޸ĺ��������.
	 * @return �˴��޸��Ƿ�ɹ�.
	 * @throws SQLException
	 */
	public boolean updatePwd(AdminAccount aa,String pwd)throws SQLException;
	
}
