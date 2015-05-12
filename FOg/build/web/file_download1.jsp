<%@ page import="java.sql.*, javax.sql.*, java.util.HashSet, java.util.ArrayList, java.util.Iterator, java.io.*;"%>
<%@ page import="java.sql.*,java.io.*"  %>
<%@ page import="java.util.*"%>
<%@page import="java.lang.*,java.text.SimpleDateFormat,java.util.*" %>
<%@ page import = "java.util.Date,java.text.SimpleDateFormat,java.text.ParseException"%>
<%@page import ="org.apache.poi.hwpf.HWPFDocument;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body>
<%
String fname=null;
String type="";
String fid=(String)session.getAttribute("fid");	
String fpath="";
String dfpath=null;			
try
{
 Connection con=null;
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 con=DriverManager.getConnection("jdbc:odbc:DRIVER={SQL Server};Database=fogcomputing;Server=VARUN\\SQLEXPRESS","sa","varunnr");
 PreparedStatement ps=con.prepareStatement("select fname,fpath,dfpath from fileupload where fid ='"+fid+"' ");
 ResultSet rs=ps.executeQuery();
 if(rs.next())
   {
    fname=rs.getString("fname");
    dfpath=rs.getString("dfpath");
    session.setAttribute("fname",fname);
    session.setAttribute("dfpath",dfpath);
   }
 }
catch(Exception e)
     {
      out.println(e.getMessage());
     }
// type=fname.substring(fname.lastIndexOf(".")+1, fname.length());
//   %>
  <!--p><!%=type%></p>
//   <%
//   if(type.equalsIgnoreCase("txt"))
//     {
//      response.sendRedirect("file_download1_textfile.jsp");
//     }
//docfpath=(String)session.getAttribute("fpath");			
//String file = "C:\\project\\fileupload\\"+fname;
////String file = (String)session.getAttribute("fpath");
//File txtfile = new File(file);
//String dectxt="C:\\project\\decoys\\"+fname;
////String dectxt =dfpath; 
//File decoy = new File(dectxt);
//FileOutputStream fout = new FileOutputStream(decoy);
//FileReader fileReader = new FileReader(txtfile);
//BufferedReader bufferedReader = new BufferedReader(fileReader);
//StringBuffer stringBuffer = new StringBuffer();
//String data,mdata;
//String line;
//while ((line = bufferedReader.readLine()) != null) 
//      {
//       stringBuffer.append(line);
//       stringBuffer.append("\n");
//      }
//	    fileReader.close();
//	    System.out.println("Contents of file:");
//            data=stringBuffer.toString();
//	    System.out.println(data);
//            mdata=data.replaceAll("a","m").replaceAll("b","n").replaceAll("c","o").replaceAll("d","p").replaceAll("f","r").replaceAll("g","s").replaceAll("h","t").replaceAll("i","o").replaceAll("j","w"). replaceAll("k","x").replaceAll("l","y") .replaceAll("m","z");
//            byte[] contentInBytes = mdata.getBytes();
//            fout.write(contentInBytes);
//            fout.flush();
//            fout.close();
        String file = "C:\\project\\fileupload\\"+fname;
        File docfile = new File(file);
        FileInputStream fin = new FileInputStream(docfile);
        HWPFDocument doc = new HWPFDocument(fin);
        
        doc.getRange().replaceText("a","m");
        doc.getRange().replaceText("b","n");
        doc.getRange().replaceText("c","o");
        doc.getRange().replaceText("d","p");
        doc.getRange().replaceText("e","q");
        doc.getRange().replaceText("f","r");
        doc.getRange().replaceText("g","s");
        doc.getRange().replaceText("h","t");
        doc.getRange().replaceText("i","u");
        doc.getRange().replaceText("j","v");
        doc.getRange().replaceText("k","w");
        doc.getRange().replaceText("l","x");
        doc.getRange().replaceText("m","y");
        doc.getRange().replaceText("n","z");
        
        String dest = "C:\\project\\decoys\\"+fname;
        File fdec =  new File(dest);
        FileOutputStream fout = new FileOutputStream(fdec);
        doc.write(fout);
        fout.close();
        fin.close();
response.sendRedirect("count1.jsp");
%>
</body>
</html>