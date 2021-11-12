package com.servlet.seller_releasegood;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.util.merchan.MerchandiseUI;
import com.util.merchan.MerchandiseUtil;
import com.util.seller.SellerUI;
import com.util.seller.SellerUtil;
import com.vo.MPicture;
import com.vo.Merchandise;



@WebServlet("/releasegoodServlet")
public class releasegoodServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String goodname = null;
		int goodprice = 0 ;
		int goodnum = 0 ;
		String goodgenre = request.getParameter("selectName");
		String goodinf = null;
		String fileName = null;
		HttpSession session=request.getSession();	
		//�ϴ�
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		try {
			if(isMultipart) {//�ж�ǰ̨��form�Ƿ���multipart������
				FileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);
				List<FileItem> items = upload.parseRequest(request);
				Iterator<FileItem> iter = items.iterator();
				while(iter.hasNext()) {
					FileItem item = iter.next();
					String itemName = item.getFieldName();
					//�ж�ǰ̨�ֶ�����ͨform���ֶλ��ǣ��ļ��ֶ�
					if(item.isFormField()) {
						if(itemName.equals("goodname")) {
							goodname = item.getString("utf-8");
						}else if(itemName.equals("goodprice")){
							goodprice = Integer.parseInt(item.getString());
						}else if(itemName.equals("goodinf")) {
							goodinf = item.getString("utf-8");
						}else if(itemName.equals("goodnum")) {
							goodnum = Integer.parseInt(item.getString());
						}
						}else {//�ļ��ϴ�
							//�ļ��� getFieldName�ǻ�ȡ��ͨ���ֶε�Nameֵ
							//getName������ȡ �ļ���
							fileName = (new File(item.getName())).getName();
							//��ȡ�ļ����ݲ��ϴ�
							//�����ļ�·����ָ���ϴ���λ��
							//String path = System.getProperty("user.dir").replace("bin", "webapps") + "wp/imgs";
							//System.out.println(path);
							String path = request.getSession().getServletContext().getRealPath("imgs");
							File file = new File(path,fileName);
							item.write(file);
				}
				}
				if(goodname.equals("")||goodinf.equals("")||goodprice<=0||goodnum<=0) {
					response.sendRedirect("management/seller_releasegood/releasegood_fail.jsp");
				}
				else{											   //********��Ҫ��д
			Merchandise m = new Merchandise(1,goodname,goodinf);   //����id����Ʒ���ƣ���Ʒ��Ϣ
			SellerUtil su = new SellerUI();						   //��ȡ��Ʒ��Ϣ����ȡͼƬ��Ϣ������ͼƬֻ��p_ads���ԣ���֪������᲻�����
			ArrayList<MPicture> am = new ArrayList<MPicture>();
			MPicture mp = new MPicture(fileName);				   //��������p_ads���Ե�mpicture
			am.add(mp);
			su.addMerchan(m, am, goodprice, goodnum, goodgenre);
			response.sendRedirect("management/seller_releasegood/releasegood_success.jsp");}
		}
		}catch (FileUploadException e) {
			e.printStackTrace();
			response.sendRedirect("management/seller_releasegood/releasegood_fail.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("management/seller_releasegood/releasegood_fail.jsp");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
