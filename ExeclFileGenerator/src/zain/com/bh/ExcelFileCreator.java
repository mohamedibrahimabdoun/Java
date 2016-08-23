package zain.com.bh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.sql.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;




public class ExcelFileCreator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resultmsg="----";
		String mailresultmsg="";
		
		String SQL="SELECT BI.PAYMENT_ID,TI.AMT,BI.PAYING_SUBNO,BI.PAYING_CONTRACTNO,TI.CONTRACT_NO, " +
					" BI.CREATED_DATE,BI.PAYMENT_MODE,bi.udf2,TI.RECEIPT_NO,TI.STATUS,TI.UNIQUE_TRANSID " +
					" FROM ZAIN.ZBH_PAYMENT_TABS_INFO ti, ZAIN.ZBH_PAYMENT_BANK_INFO bi WHERE     TI.PAYMENT_ID = BI.PAYMENT_ID " +
					" AND BI.PAYMENT_TYPE = 'CONTRACTPAY' AND bi.status = 'Success' and ti.status='Success' AND TI.CONTRACT_NO IS NOT NULL " +
					" AND TI.CONTRACT_NO <> BI.PAYING_CONTRACTNO AND bi.CREATED_DATE >= SYSDATE - 10 ORDER BY BI.CREATED_DATE DESC " ;
					
		
		resultmsg=generateFile(SQL,"paymant.xls");
		System.out.println(resultmsg);
		//============================Send Created File==================
		
		/*
		 //Google Account information  
		 		smtp.gmail.com
				Use Authentication: Yes
				Port for TLS/STARTTLS: 587
				Port for SSL: 465
		 */
			String host = "mail.bh.zain.com";//"smtp.gmail.com";//
	        String port = "25";//"587";
	        String mailFrom = "Mohamed.Osman@bh.zain.com";//"mohamedibrahimabdoun@gmail.com";// 
	        String password = "zain";
	 
	        // message info
	        String mailTo = "Mohamed.Osman@bh.zain.com";
	        String subject = "New email with attachments";
	        String message = "I have some attachments for you.";
	 
	        // attachments
	        String[] attachFiles = new String[2];
	        attachFiles[0] = "C:/Users/Mohamed/workspace/ExeclFileGenerator/paymant.xls";
	        attachFiles[1] = "c:/IMAG0841.jpg";
	        
	        SendEmail sendmailobject=new SendEmail();
	 
	        try {
	        	mailresultmsg=sendmailobject.SendEmailWithAttachment(host, port, mailFrom, password, mailTo,
	                subject, message, attachFiles);
	            System.out.println(mailresultmsg);
	        } catch (Exception ex) {
	            System.out.println("Could not send email.");
	            ex.printStackTrace();
	        }
	}

	
	public static String generateFile(String SQL ,String fileName){
		String msg="";
		try{
			//String filename="c:/data.xls" ;
			HSSFWorkbook hwb=new HSSFWorkbook();
			HSSFSheet sheet =  hwb.createSheet("new sheet");

			HSSFRow rowhead=   sheet.createRow((short)0);
			rowhead.createCell((short) 0).setCellValue("PAYMENT_ID");
			rowhead.createCell((short) 1).setCellValue("AMT");
			rowhead.createCell((short) 2).setCellValue("PAYING_SUBNO");
			rowhead.createCell((short) 3).setCellValue("PAYING_CONTRACTNO");
			rowhead.createCell((short) 4).setCellValue("CREATED_DATE");
			rowhead.createCell((short) 5).setCellValue("PAYMENT_MODE");
			rowhead.createCell((short) 6).setCellValue("UDF2");
			rowhead.createCell((short) 7).setCellValue("RECEIPT_NO");
			rowhead.createCell((short) 8).setCellValue("STATUS");
			rowhead.createCell((short) 9).setCellValue("UNIQUE_TRANSID");


			/* My sql Connection
			 Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			*/
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@znprddb1.bh.zain.com:1521/orcl.bh.zain.com", "ZAIN","zain123");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(SQL);
			int i=1;
			while(rs.next()){
			HSSFRow row=   sheet.createRow((short)i);
			row.createCell((short) 0).setCellValue(rs.getString("PAYMENT_ID"));
			row.createCell((short) 1).setCellValue(rs.getDouble("AMT"));
			row.createCell((short) 2).setCellValue(rs.getInt("PAYING_SUBNO"));
			row.createCell((short) 3).setCellValue(rs.getString("PAYING_CONTRACTNO"));
			row.createCell((short) 4).setCellValue(rs.getDate("CREATED_DATE"));
			row.createCell((short) 5).setCellValue(rs.getString("PAYMENT_MODE"));
			row.createCell((short) 6).setCellValue(rs.getString("UDF2"));
			row.createCell((short) 7).setCellValue(rs.getString("RECEIPT_NO"));
			row.createCell((short) 8).setCellValue(rs.getString("STATUS"));
			row.createCell((short) 9).setCellValue(rs.getString("UNIQUE_TRANSID"));
			i++;
			}
			try{
			FileOutputStream fileOut =  new FileOutputStream(fileName);
			hwb.write(fileOut);
			fileOut.close();
			msg="Your excel file has been generated!";
			}catch (Exception x){
				msg=x.getMessage();
			}

			} catch ( Exception ex ) {
				msg=ex.getMessage();

			}

		return msg;
	}
	
}
