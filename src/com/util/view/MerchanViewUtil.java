package com.util.view;

import java.util.ArrayList;

import com.vo.Merchandise;

public interface MerchanViewUtil {

	
	public ArrayList<Merchandise> showAllMerchanOnSale();
	
	
	public ArrayList<Merchandise> showAllMerchan();
	
	
	public ArrayList<Merchandise> showSelectedMerchan(String words);
	//�����㷨��wordsΪ�����Ĺؼ��֣�����������Merchandise�б�
	
	
}
