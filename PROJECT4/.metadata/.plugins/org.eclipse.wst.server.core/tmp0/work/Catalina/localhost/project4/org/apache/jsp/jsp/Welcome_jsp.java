/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-09-08 11:34:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.sunrays.project4.controller.ORSView;
import in.co.sunrays.project4.bean.*;
import in.co.sunrays.project4.controller.LoginCtl;
import in.co.sunrays.project4.*;
import in.co.sunrays.project4.bean.*;
import in.co.sunrays.project4.controller.ORSView;
import java.util.Calendar;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1550597436000L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1631100836499L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("in.co.sunrays.project4.bean");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("in.co.sunrays.project4");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.sunrays.project4.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.sunrays.project4.controller.ORSView");
    _jspx_imports_classes.add("java.util.Calendar");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"ErrorView.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>HEADER</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/css/jquery-ui.css\"></link>\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/jq/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/jq/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	var date = new Date();\r\n");
      out.write("	var first = date.getFullYear() - 17;\r\n");
      out.write("	var last = date.getFullYear() - 40;\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\"#datepicker\").datepicker({\r\n");
      out.write("			changeMonth : true,\r\n");
      out.write("			changeYear : true,\r\n");
      out.write("			changeDay : true,\r\n");
      out.write("			yearRange : \"-57:-18\",\r\n");
      out.write("			defaultDate : \"01/01/1962\"\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\"#datepickerfac\").datepicker({\r\n");
      out.write("			changeMonth : true,\r\n");
      out.write("			changeYear : true,\r\n");
      out.write("			changeDay : true,\r\n");
      out.write("			yearRange : \"-57:+0\",\r\n");
      out.write("			defaultDate : date.getDay()\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	function DisableSunday(date) {\r\n");
      out.write("		var day = date.getDay();\r\n");
      out.write("		if (day == 0) {\r\n");
      out.write("			return [ false ];\r\n");
      out.write("\r\n");
      out.write("		} else {\r\n");
      out.write("			return [ true ];\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	var dateToday = new Date();\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\"#datepicker1\").datepicker({\r\n");
      out.write("			changeMonth : true,\r\n");
      out.write("			changeYear : true,\r\n");
      out.write("			changeDay : true,\r\n");
      out.write("			//showWeekNumbers : true,\r\n");
      out.write("			//showMonthAfterYear : true,\r\n");
      out.write("			beforeShowDay : DisableSunday,\r\n");
      out.write("			yearRange : \"0:+10\",//\"2018:2029\",\r\n");
      out.write("\r\n");
      out.write("			//dateFormat : \"dd/mm/yy\",\r\n");
      out.write("			minDate : 0,/* dateToday.getDate() */\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	var dateToday = new Date();\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\"#datepicker2\").datepicker({\r\n");
      out.write("			changeMonth : true,\r\n");
      out.write("			changeYear : true,\r\n");
      out.write("			changeDay : true,\r\n");
      out.write("			//showWeekNumbers : true,\r\n");
      out.write("			//showMonthAfterYear : true,\r\n");
      out.write("			beforeShowDay : DisableSunday,\r\n");
      out.write("			yearRange : \"2018:2029\",\r\n");
      out.write("\r\n");
      out.write("		//dateFormat : \"dd/mm/yy\"\r\n");
      out.write("		//minDate : dateToday.getDate()\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function selectall(source) {\r\n");
      out.write("		checkboxes = document.getElementsByName('ids');\r\n");
      out.write("		for (var i = 0, n = checkboxes.length; i < n; i++) {\r\n");
      out.write("			checkboxes[i].checked = source.checked;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	function selectone(so) {\r\n");
      out.write("		checkboxes = document.getElementById('mainbox');\r\n");
      out.write("		unbox = document.getElementsByName('ids');\r\n");
      out.write("		var box = false;\r\n");
      out.write("		for (var i = 0, n = unbox.length; i < n; i++) {\r\n");
      out.write("			if (unbox[i].checked == true) {\r\n");
      out.write("				box = true;\r\n");
      out.write("			} else {\r\n");
      out.write("				box = false;\r\n");
      out.write("				break;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		checkboxes.checked = box;\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("select.form-control {\r\n");
      out.write("	height: 22px;\r\n");
      out.write("	width: 166px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".desc {\r\n");
      out.write("	POSITION: ABSOLUTE;\r\n");
      out.write("	TOP: 321px;\r\n");
      out.write("	LEFT: 804px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

		UserBean userBean = (UserBean) session.getAttribute("user");

		boolean userLoggedIn = userBean != null;

		String welcomeMsg = "";

		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg = "Hi, " + userBean.getFirstName() + "(" + role + ")";
		} else {
			welcomeMsg = "Hi, Guest";
		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<table width=\"100%\" style=\"margin-top: -1%\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td width=\"90%\"><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Welcome</font></b></a>&nbsp;<b>||</b>&nbsp; ");

 	if (userLoggedIn) {
 
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><b>Logout</b></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				");

					} else {
				
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><b><font size=\"4\">\r\n");
      out.write("							Login</font></b></a> ");

 	}
 
      out.write("\r\n");
      out.write("			<td rowspan=\"2\">\r\n");
      out.write("				<h1 align=\"Right\">\r\n");
      out.write("					<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/jsp/customLogo.png\" width=\"270\"\r\n");
      out.write("						height=\"90\">\r\n");
      out.write("				</h1>\r\n");
      out.write("			</td>\r\n");
      out.write("\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>\r\n");
      out.write("				<h3>\r\n");
      out.write("					");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");

			if (userLoggedIn) {
		
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			");

				if (userBean.getRoleId() == RoleBean.ADMIN) {
			
      out.write("\r\n");
      out.write("			<td colspan=\"2\"><a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">My Profile</font></b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><b><font size=\"4\">Change\r\n");
      out.write("							Password</font></b></a> | <a href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add User</font></b></a> | <a href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">User List</font></b></a> | <a href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add College</font></b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><b><font size=\"4\">College\r\n");
      out.write("							List</font></b></a> | <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add Student</font></b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><b><font size=\"4\">Student\r\n");
      out.write("							List</font></b></a> | <a href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add Course</font></b></a>| <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Course List</font></b></a>| <a href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add Subject</font> </b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"><b><font size=\"4\">Subject\r\n");
      out.write("							List </font></b></a>| <a href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><b><font size=\"4\">Add\r\n");
      out.write("							Role</font></b></a> | <a href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Role List</font></b></a> | <a href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add Time Table</font> </b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><b><font size=\"4\">Time\r\n");
      out.write("							Table List</font> </b></a> | <a href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add Faculty</font></b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><b><font size=\"4\">Faculty\r\n");
      out.write("							List </font></b></a>| <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add Marksheet</font></b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><b><font size=\"4\">Marksheet\r\n");
      out.write("							List</font></b></a> | <a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Get Marksheet</font></b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Marksheet Merit List</font></b> </a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\" target=\"blank\"><b><font\r\n");
      out.write("						size=\"4\">Java Doc</font></b></a> | ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.STUDENT) {
 
      out.write("\r\n");
      out.write("			<td colspan=\"2\"><a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">My Profile</font></b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><b><font size=\"4\">Change\r\n");
      out.write("							Password</font></b></a> | <a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Get Marksheet</font></b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Marksheet Merit List</font></b> </a> | ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.FACULTY) {
 
      out.write("\r\n");
      out.write("			<td colspan=\"2\"><a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">My Profile</font></b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><b><font size=\"4\">Change\r\n");
      out.write("							Password</font></b></a> | ");
      out.write(" <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><b><font size=\"4\">College\r\n");
      out.write("							List</font></b></a> | <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add Student</font></b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><b><font size=\"4\">Student\r\n");
      out.write("							List</font></b></a>| <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Course List</font></b></a>| <a href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Add Subject </font></b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"><b><font size=\"4\">Subject\r\n");
      out.write("							List</font> </b></a>| ");
      out.write(" <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Marksheet Merit List</font></b> </a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><b><font size=\"4\">Get\r\n");
      out.write("							Marksheet</font></b></a> ");
      out.write(' ');

 	
 
      out.write(' ');

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.COLLEGE) {
 
      out.write("\r\n");
      out.write("			<td colspan=\"2\">\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				<a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><b><font>My\r\n");
      out.write("							Profile</font></b></a>| <a href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><b><font>Change\r\n");
      out.write("							Password</font></b></a> | <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><b>Marksheet\r\n");
      out.write("						List</b></a> | ");
      out.write("\r\n");
      out.write("				<a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><b>Add Student</b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><b>Student List</b></a> | ");
      out.write(" <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><b>Add Faculty</b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><b>Faculty List </b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><b>Add Course</b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><b>Course List</b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><b>Add Subject </b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"><b>Subject List </b></a>| <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b><font>Marksheet\r\n");
      out.write("							Merit List</font></b> </a> | <a href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><b>Add\r\n");
      out.write("						Time Table </b></a>| <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><b>Time\r\n");
      out.write("						table List </b></a> ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.KIOSK) {
 
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			<td colspan=\"2\"><a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Get Marksheet</font></b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><b><font size=\"4\">My\r\n");
      out.write("							Profile</font></b></a>| <a href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Change Password</font></b></a> | <a\r\n");
      out.write("				href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><b><font\r\n");
      out.write("						size=\"4\">Marksheet Merit List</font></b> </a> | ");

 	}
 
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

			}
		
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("	<hr>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    <form action=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("       \r\n");
      out.write("                    <h1 align=\"Center\">\r\n");
      out.write("                        <font size=\"10px\" color=\"red\">Welcome to ORS </font>\r\n");
      out.write("                    </h1>\r\n");
      out.write("        \r\n");
      out.write("                    ");

                    UserBean beanUserBean = (UserBean) session.getAttribute("user");
                        if (beanUserBean != null) {
                            if (beanUserBean.getRoleId() == RoleBean.STUDENT) {
                    
      out.write("\r\n");
      out.write("        \r\n");
      out.write("                    <h2 align=\"Center\">\r\n");
      out.write("                         <a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Click here to see your\r\n");
      out.write("                            Marksheet </a>\r\n");
      out.write("                    </h2>\r\n");
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("                     ");

                            }
                        }
                     
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                </form>\r\n");
      out.write("       ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#footer {\r\n");
      out.write("	position: fixed;\r\n");
      out.write("	bottom: -12px;\r\n");
      out.write("	left: 0px;\r\n");
      out.write("	right: 0px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<div>\r\n");
      out.write("	<body>\r\n");
      out.write("		<center>\r\n");
      out.write("\r\n");
      out.write("			<h3 id=\"footer\">\r\n");
      out.write("				<hr>\r\n");
      out.write("				");

					Calendar c = Calendar.getInstance();
				
      out.write("\r\n");
      out.write("				Copyright &copy;\r\n");
      out.write("				");
      out.print(c.getWeekYear());
      out.write("\r\n");
      out.write("				Rays Technologies\r\n");
      out.write("\r\n");
      out.write("			</h3>\r\n");
      out.write("\r\n");
      out.write("		</center>\r\n");
      out.write("\r\n");
      out.write("	</body>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</html>");
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}