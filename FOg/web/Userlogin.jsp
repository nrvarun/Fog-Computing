<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="EN" lang="EN" dir="ltr">
<head profile="http://gmpg.org/xfn/11">
<title>My CLoud User Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<style type="text/css">
#apDiv1 {
	position:absolute;
	width:250px;
	height:131px;
	z-index:1001;
	left: 87px;
	top: 109px;
}
</style>
</head>
<body id="top">
<div class="wrapper col1">
  <div id="head">
    <h1><a href="#">MyCloud</a><img name="" src="images/demo/Untitled-4.png" width="129" height="103" alt="" /></h1>
    <div id="topnav">
      <ul>
        <li><a class="active" href="index.jsp">Home</a></li>
        <li><a href="register.jsp">Registration</a></li>
        <li><a href="#"> Login</a>
          <ul>
            <li><a href="Userlogin.jsp">User</a></li>
            <li><a href="Adminlogin.jsp">Admininstrator</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</div>
<div class="wrapper col2">
  <div id="breadcrumb">
    <ul>
      <li class="first"></li>
    </ul>
  </div>
</div>
<div class="wrapper col4">
  <div id="container">
    <div id="content">
      <h1>User Login 	</h1>
      <img  align="left" class="imgr" src="images/demo/LoginIcon.png" alt="" width="95" height="93" />
      <form id="form1" name="form1" method="get" action="user_check.jsp">
        <table width="200" height="94" border="0">
          <tr>
            <td width="35%"><strong>Username</strong></td>
            <td width="65%"><label for="un"></label>
            <input type="text" name="un" id="un" /></td>
          </tr>
          <tr>
            <td><strong>Password</strong></td>
            <td><input type="password" name="pw" id="pw" /></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td><input type="submit" name="submit" id="submit" value="Submit" />
            <input type="reset" name="reset" id="reset" value="Reset" /></td>
          </tr>
        </table>
      </form>
      <p>&nbsp;</p>
<div id="respond"> </div>
    </div>
    <div class="clear">
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
    </div>
  </div>
</div>
<div class="wrapper col5">
  <div id="footer">
    <div id="contactform">
      <h2>Contact Us Today !</h2>
      <p></p>
      <h2>Mail @ mycloudsite@gmail.com</h2>
      <h2>Contact : 1800-11-722</h2>
    </div>
    <!-- End Contact Form -->
    <div id="compdetails">
      <div id="officialdetails">
        <h2>Company Information !</h2>
        <ul>
          <li>Company Mycloudsite Ltd</li>
          <li>Registered in Combatore</li>
          <li>Company No. 722553 </li>
        </ul>
      </div>
      <div id="contactdetails">
        <h2>Our Contact Details !</h2>
        <ul>
          <li>MyCloudSite Ltd</li>
          <li>R S Puram</li>
          <li>Coimbatore</li>
          <li>641002</li>
          <li>Tel: 08754208698</li>
        </ul>
      </div>
      <div class="clear"></div>
    </div>
    <!-- End Company Details -->
    <div id="copyright">
      <p class="fl_left">Copyright &copy; 2014 - All Rights Reserved </p>
      <p class="fl_right"><br class="clear" />
      </p>
    </div>
    <div class="clear"></div>
  </div>
</div>
</body>
</html>
