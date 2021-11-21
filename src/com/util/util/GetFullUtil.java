package com.util.util;

import com.vo.BuyerInfo;
import com.vo.Merchandise;
import com.vo.Orders;

/**
 * @author ������
 * ��ȡ�������ݵĽӿ�
 */
public interface GetFullUtil {

	/**
	 * ���ڻ�ȡ��������ƷMerchandise
	 * @param ��Ʒ��ϢMerchandise,��Ҫ����m_id
	 * @return �ɹ��򷵻ذ������������Ϣ��Merchandise,ʧ���򷵻�ԭ����
	 */
	public Merchandise getAllMerchan(Merchandise m);
	
	
	/**
	 * ���ڻ�ȡ�����Ķ���Orders
	 * @param ������ϢOrders,��Ҫ����o_id
	 * @return �ɹ��򷵻ذ������������Ϣ��Orders,ʧ���򷵻�ԭ����
	 */
	public Orders getAllOrders(Orders o);
	
	
	/**
	 * ���ڻ�ȡ���������Buyer
	 * @param �����ϢBuyerInfo,��Ҫ����b_act
	 * @return �ɹ��򷵻ذ������������Ϣ��BuyerInfo,ʧ���򷵻�ԭ����
	 */
	public BuyerInfo getAllBuyer(BuyerInfo bi); 
	
}
