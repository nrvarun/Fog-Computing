<%@ page import="java.sql.*, javax.sql.*, java.util.HashSet, java.util.ArrayList, java.util.Iterator, java.io.*;"%>
<%@ page import="java.sql.*,java.io.*"  %>
<%@ page import="java.util.*"%>
<%@page import="java.lang.*,java.text.SimpleDateFormat,java.util.*" %>
<%@ page import = "java.util.Date,java.text.SimpleDateFormat,java.text.ParseException"%>
<%@page import ="org.apache.poi.hwpf.HWPFDocument;"%>

<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body>
<%
String fname=null,type=null,docfpath=null;
String fid=(String)session.getAttribute("fid");	
docfpath=(String)session.getAttribute("fpath");			
String file = "C:\\project\\fileupload\\"+fname;
//String file = (String)session.getAttribute("fpath");
File txtfile = new File(file);
String dectxt="C:\\project\\decoys\\"+fname;
//String dectxt =dfpath; 
File decoy = new File(dectxt);
FileOutputStream fout = new FileOutputStream(decoy);
FileReader fileReader = new FileReader(txtfile);
BufferedReader bufferedReader = new BufferedReader(fileReader);
StringBuffer stringBuffer = new StringBuffer();
String data,mdata;
String line;
while ((line = bufferedReader.readLine()) != null) 
      {
       stringBuffer.append(line);
       stringBuffer.append("\n");
      }
	    fileReader.close();
	    System.out.println("Contents of file:");
            data=stringBuffer.toString();
	    System.out.println(data);
            mdata=data.replaceAll("a","m").replaceAll("b","n").replaceAll("c","o").replaceAll("d","p").replaceAll("f","r").replaceAll("g","s").replaceAll("h","t").replaceAll("i","o").replaceAll("j","w"). replaceAll("k","x").replaceAll("l","y") .replaceAll("m","z");
            byte[] contentInBytes = mdata.getBytes();
            fout.write(contentInBytes);
            fout.flush();
            fout.close();
  
//else if((type=="doc")||(type=="DOC")||(type=="docx")||(type=="DOCX"))
//       {
//        
//        File docfile = new File(docfpath);
//        FileInputStream fin = new FileInputStream(docfile);
//        HWPFDocument doc = new HWPFDocument(fin);
//        
//        doc.getRange().replaceText("a","m");
//        doc.getRange().replaceText("b","n");
//        doc.getRange().replaceText("c","o");
//        doc.getRange().replaceText("d","p");
//        doc.getRange().replaceText("e","q");
//        doc.getRange().replaceText("f","r");
//        doc.getRange().replaceText("g","s");
//        doc.getRange().replaceText("h","t");
//        doc.getRange().replaceText("i","u");
//        doc.getRange().replaceText("j","v");
//        doc.getRange().replaceText("k","w");
//        doc.getRange().replaceText("l","x");
//        doc.getRange().replaceText("m","y");
//        doc.getRange().replaceText("n","z");
//        
//        String dest = "C:\\project\\decoys\\"+fname;
//        File fdec =  new File(dest);
//        if(!fdec.exists())
//          {
//           fdec.createNewFile();
//          }
//        FileOutputStream fout = new FileOutputStream(dest);
//        doc.write(fout);
//        fout.close();
//        System.out.println("Success...");
//        fin.close();
//       }
response.sendRedirect("count1.jsp");
%>
</body>
</html>
