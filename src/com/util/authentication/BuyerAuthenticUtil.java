package com.util.authentication;

import com.vo.BuyerAccount;
import com.vo.BuyerAddress;
import com.vo.BuyerInfo;

/**
 * @author ������
 * �����֤���ܵĽӿ�
 */
public interface BuyerAuthenticUtil {
	
	/**
	 * �����޸���ҵ�����
	 * @param ����˺�BuyerAccount,��Ҫ����b_act,b_pwd
	 * @param �ַ���new_pwd,�޸ĺ��������
	 * @return �޸��Ƿ�ɹ�
	 */
	public boolean changePwd(BuyerAccount ba,String new_pwd);
	
	
	/**
	 * �����޸���ҵĸ�����Ϣ�͵�ַ��Ϣ
	 * @param �����ϢBuyerInfo,��Ҫ����b_act,b_tele
	 * @param ��ҵ�ַ��ϢBuyerAddress,��Ҫ����b_act,b_ads
	 * @return �ɹ��򷵻��޸ĺ��BuyerInfo,ʧ���򷵻�null
	 */
	public BuyerInfo changeInfo(BuyerInfo bi, BuyerAddress ba); 
	
	
	/**
	 * ������������˺�
	 * @param ����˺�BuyerAccount,��Ҫ����b_act,b_pwd
	 * @param �����ϢBuyerInfo,��Ҫ����b_act,b_tele
	 * @param ���ҵ�ַ��ϢBuyerAddress,��Ҫ����b_act,b_ads
	 * @return
	 */
	public BuyerInfo addBuyer(BuyerAccount ba,BuyerInfo bi, BuyerAddress bad);
	
}
