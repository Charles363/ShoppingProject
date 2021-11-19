package com.dao.users;

import java.sql.SQLException;
import java.util.ArrayList;

import com.vo.BuyerAccount;
import com.vo.BuyerAddress;
import com.vo.BuyerInfo;

/**
 * @author ������
 * �������������ݿ�ӿ�
 */
public interface BuyerD {

	/**
	 * ���ڼ������˺��Ƿ����
	 * @param ����˺�BuyerAccount,��Ҫ����b_act,b_pwd
	 * @return �Ƿ�����������˺�
	 * @throws SQLException
	 */
	public boolean selectAccount(BuyerAccount ba)throws SQLException;
	
	
	/**
	 * ���ڼ������û����Ƿ�ע��
	 * @param ����˺�BuyerAccount,��Ҫ����b_act
	 * @return �û����Ƿ�ע��
	 * @throws SQLException
	 */
	public boolean selectAct(BuyerAccount ba)throws SQLException;
	
	
	/**
	 * ���ڸ�������˺ŵ�������Ϣ
	 * @param ����˺�BuyerAccount,��Ҫ����b_act
	 * @param �ַ���pwd,������
	 * @return �޸��Ƿ�ɹ�
	 * @throws SQLException
	 */
	public boolean updatePwd(BuyerAccount ba,String pwd)throws SQLException;
	
	
	/**
	 * ����ȡ��ĳ����ҵ����е�ַ��Ϣ
	 * @param �����ϢBuyerInfo,��Ҫ����b_act
	 * @return �ɹ��򷵻صõ�������е�ַ��Ϣ��BuyerInfo,ʧ���򷵻�ԭ����
	 * @throws SQLException
	 */
	public BuyerInfo selectAddress(BuyerInfo bi)throws SQLException;
	
	
	/**
	 * ����ȡ��ĳ����ҵ��˺���Ϣ
	 * @param �����ϢBuyerInfo,��Ҫ����b_act
	 * @return �ɹ��򷵻صõ�����ʺ���Ϣ��BuyerInfo,ʧ���򷵻�ԭ����
	 * @throws SQLException
	 */
	public BuyerInfo selectAccount(BuyerInfo bi)throws SQLException;
	
	
	/**
	 * ���ڼ����µ�����˺���Ϣ
	 * @param ����˺�BuyerAccount,��Ҫ����b_act,b_pwd
	 * @return �����Ƿ�ɹ�
	 * @throws SQLException
	 */
	public boolean insertAccount(BuyerAccount ba)throws SQLException;
	
	
	/**
	 * ���ڼ����µ���Ҹ�����Ϣ
	 * @param �����ϢBuyerInfo,��Ҫ����b_act,b_tele
	 * @return �����Ƿ�ɹ�
	 * @throws SQLException
	 */
	public boolean insertInfo(BuyerInfo bi)throws SQLException;
	
	
	/**
	 * ���ڼ����µ���ҵ�ַ��Ϣ
	 * @param ��ҵ�ַBuyerAddress,��Ҫ����b_act,b_ads
	 * @return �ɹ��򷵻ذ���������BuyerAddress,ʧ���򷵻�ԭ����
	 * @throws SQLException
	 */
	public BuyerAddress insertAddress(BuyerAddress ba)throws SQLException; 
	
	
	/**
	 * ���ڻ�����е���Ҹ�����Ϣ
	 * @return �ɹ��򷵻ذ�����Ҹ�����ϢBuyerInfo������,ʧ���򷵻�һ��������
	 * @throws SQLException
	 */
	public ArrayList<BuyerInfo> selectAllInfo()throws SQLException;
	
	
	/**
	 * ���ڸ������Ҹ�����Ϣ������
	 * @param ��Ҹ�����ϢBuyerInfo,��Ҫ����b_act,b_tele
	 * @return �����Ƿ�ɹ�
	 * @throws SQLException
	 */
	public boolean updateInfo(BuyerInfo bi)throws SQLException;
	
	
	/**
	 * ���ڸ�����ҵĵ�ַ��Ϣ
	 * @param ��ҵ�ַ��ϢBuyerAddress,��Ҫ����b_act,b_ads
	 * @return �����Ƿ�ɹ�
	 * @throws SQLException
	 */
	public boolean updateAddress(BuyerAddress ba)throws SQLException;
	
}
