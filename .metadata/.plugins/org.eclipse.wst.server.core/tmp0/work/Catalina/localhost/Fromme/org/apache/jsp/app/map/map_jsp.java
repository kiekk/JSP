/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-11-06 23:30:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/app/map/../main/src_forInclude.html", Long.valueOf(1604665015091L));
    _jspx_dependants.put("/app/map/../main/header_index.jsp", Long.valueOf(1604661046357L));
    _jspx_dependants.put("/app/map/../main/banner.jsp", Long.valueOf(1604661046349L));
    _jspx_dependants.put("/app/map/../main/footer.jsp", Long.valueOf(1604661046352L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko-KR\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t\t<title>FROmme - 내 손으로 만드는 특별한 순간</title>\r\n");
      out.write("\t\t");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<!-- template css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/css/components.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/css/icons.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/css/responsee.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/owl-carousel/owl.carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/owl-carousel/owl.theme.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/css/template-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/css/map.css\">\r\n");
      out.write("<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Playfair+Display&subset=latin,latin-ext'>\r\n");
      out.write("<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800&subset=latin,latin-ext'>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" >\r\n");
      out.write("\r\n");
      out.write("<!-- templete jquery -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/js/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- templete script -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/js/template-scripts.js\"></script>\r\n");
      out.write("<script \tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/owl-carousel/owl.carousel.js\"></script>\r\n");
      out.write("<script \tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets//js/responsee.js\"></script>\r\n");
      out.write("<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("<script>var contextPath = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";</script>");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/css/map.css\">\r\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Playfair+Display&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Playfair+Display&subset=latin,latin-ext'>\r\n");
      out.write("\t\t<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800&subset=latin,latin-ext'>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"size-1140\">\r\n");
      out.write("\t\t<!-- HEADER -->\r\n");
      out.write("\t\t<header role=\"banner\" class=\"position-absolute\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t<!-- Top Navigation -->\r\n");
      out.write("\t\t<nav\r\n");
      out.write("\t\t\tclass=\"background-transparent background-transparent-hightlight full-width sticky\">\r\n");
      out.write("\t\t\t<div class=\"s-12 l-2 header-logo\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/main/index.jsp\" class=\"logo\"> <!-- Logo White Version --> <img\r\n");
      out.write("\t\t\t\t\tclass=\"logo-white\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/img/logo.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t<!-- Logo Dark Version --> <img class=\"logo-dark\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/img/logo-dark.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"top-nav s-12 l-10\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"right chevron \">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/main/index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/classes/ClassesList.cls\">Class</a></li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/BoardList.bo?cat=1\">Board</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/BoardList.bo?cat=1\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/BoardList.bo?cat=2\">문의사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/BoardList.bo?cat=3\">Community</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/BoardList.bo?cat=3\">내작품자랑</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/BoardList.bo?cat=4\">중고거래</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../user/map.html\">Map</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../user/login.html\"><b>Login</b></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<!-- slide banner -->\r\n");
      out.write("\t\t<!-- MAIN -->\r\n");
      out.write("\t\t<main role=\"main\">\r\n");
      out.write("  \t\t\t<!-- Main Header -->\r\n");
      out.write("\t\t\t<header>\r\n");
      out.write("\t\t\t  ");
      out.write("\r\n");
      out.write("<div class=\"margin-top-70\">\r\n");
      out.write("\t<div class=\"carousel-default owl-carousel carousel-main carousel-nav-white background-dark text-center\">\r\n");
      out.write("\t\t<div class=\"item\">\r\n");
      out.write("    \t\t<div class=\"s-12\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/img/banner/event_mini_banner1.png\" alt=\"background-dark\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t<div class=\"s-12\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/img/banner/event_mini_banner1.png\" alt=\"background-dark\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t</main>\r\n");
      out.write("\t\t<div class=\"line\"></div>\r\n");
      out.write("\t\t<!-- MAIN -->\r\n");
      out.write("\t\t<main role=\"main\">\r\n");
      out.write("\t\t\t<!-- Content -->\r\n");
      out.write("\t\t\t<article style=\"width:80%; margin:0 auto;\">\r\n");
      out.write("\t\t\t\t<div class=\"map_header\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"map_text\">\r\n");
      out.write("\t\t\t\t\t\t주소를 입력해 보세요.<br/>검색하신 주소와 가까운 공방들을 찾아 드립니다.\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"map_search\">\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<form action=\"#\" method=\"GET\" name=\"searchMapForm\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"input_search\" type=\"text\" value=\"\" name=\"keyword\" placeholder=\"주소를 입력해 주세요.\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"btn_bbs btn_search\" type=\"button\" value=\"검색\" onclick=\"searchform()\"/>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"map_wrap\">\r\n");
      out.write("\t\t\t\t\t<div class=\"searchMapList\">\r\n");
      out.write("\t\t\t\t\t\t<p>공방 목록</p>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"map_list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방이름</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방주소</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방이름</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방주소</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방이름</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방주소</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방이름</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방주소</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방이름</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방주소</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방이름</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방주소</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방이름</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방주소</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방이름</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>공방주소</span>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pagination\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><span class=\"pagenum currentpage\" >1</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><span class=\"pagenum\" >2</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><span class=\"pagenum\" >3</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><span class=\"pagenum\" >4</span></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"map\"></div>\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:setZoomable(false)\" class=\"btn_map btn_false\">지도 확대/축소 끄기</a>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:setZoomable(true)\" class=\"btn_map btn_true clicked\">지도 확대/축소 켜기</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<div style=\"clear:both;\"></div>\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("\t\t</main>\r\n");
      out.write("  \t\t<div class=\"line\"></div>\r\n");
      out.write("\t\t<!-- FOOTER -->\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t  ");
      out.write("\r\n");
      out.write("      <!-- Main Footer -->\r\n");
      out.write("      <section class=\"background-white full-width\">\r\n");
      out.write("        <hr class=\"break margin-top-bottom-0\" style=\"border-color: rgba(199, 199, 199, 0.8);\">\r\n");
      out.write("        <!-- Logo img -->\r\n");
      out.write("        <div class=\"margin-top-20 margin-left-right-20\" style=\"width: 20%;\">\r\n");
      out.write("       <img class=\"logo-dark\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/img/logo-dark.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"margin-top-bottom-0\">\r\n");
      out.write("          <div class=\"s-6 l-6\">\r\n");
      out.write("            <div class=\"margin-top-10 text-size-16 padding\">\r\n");
      out.write("              <div class=\"\" style=\"font-family: GmarketSansMedium;\">크리에이터</div>\r\n");
      out.write("              <a href=\"#\" style=\"font-family: GmarketSansMedium;\" class=\"text-size-12\">공방 등록 문의</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"s-12 l-6\">\r\n");
      out.write("            <div class=\"margin-top-10 text-size-16 padding\">\r\n");
      out.write("              <div class=\"\" style=\"font-family: GmarketSansMedium;\">고객센터 010-000-0000</div>\r\n");
      out.write("              <a href=\"#\" style=\"font-family: GmarketSansMedium;\" class=\"text-size-12\">오전 10시 ~ 오후 6시 (주말, 공휴일 제외)</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("      </section>\r\n");
      out.write("      <hr class=\"break margin-top-bottom-0\" style=\"border-color: rgba(199, 199, 199, 0.8);\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Bottom Footer -->\r\n");
      out.write("      <section class=\"padding background-white full-width \">\r\n");
      out.write("        <div class=\"Footer__AgreementInner text-size-12\" style=\"font-family: GmarketSansMedium;\">\r\n");
      out.write("          <div class=\"center margin-bottom-10\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"s-12 l-12\">\r\n");
      out.write("              <a href=\"#\" target=\"_blank\" rel=\"noreferrer\" class=\"Footer__AgreementLink-1\">이용약관 |</a>\r\n");
      out.write("              <a href=\"#\" target=\"_blank\" rel=\"noreferrer\" class=\"Footer__AgreementLink-2\"><b>개인정보 처리방침 |</b></a>\r\n");
      out.write("              <a href=\"#\" target=\"_blank\" rel=\"noreferrer\" class=\"Footer__AgreementLink-3\">사업자 정보 확인 |</a>\r\n");
      out.write("              <a href=\"#\" target=\"_blank\" rel=\"noreferrer\" class=\"Footer__AgreementLink-4\">제휴/협력 문의</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("          <div>\r\n");
      out.write("            <p class=\"text-size-12\">\r\n");
      out.write("              (주) FROmme | 대표 홍길동 | 서울특별시 역삼동 통일로 10 세브란스빌딩 18층\r\n");
      out.write("              | 사업자등록번호 : 000-00-00000 |\r\n");
      out.write("              통신판매업신고 : 2020-서울강남-0000 |\r\n");
      out.write("              주식회사 FROmme는 전자상거래 등에서의 소비자보호에 관한 법률에 따른 통신판매업과 통신판매중개업을 영위하고 있습니다.\r\n");
      out.write("              주식회사 FROmme는 통신판매중개자로서 중개하는 통신판매에 관하여서는 통신판매의 당사자가 아니므로 어떠한 책임도 부담하지 아니합니다.\r\n");
      out.write("              created by Team Method\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"s-12 l-12\">\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("      </section>");
      out.write("\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=1a354b9eb9cb42ab99114924570a7b8d&libraries=services\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/assets/js/map.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction searchform(){\r\n");
      out.write("\t\t\tif(searchMapForm.keyword.value == \"\") {\r\n");
      out.write("\t\t\t\talert(\"주소를 입력해주세요.\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//searchMapForm.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\tvar mapContainer = document.getElementById('map'), // 지도를 표시할 div \r\n");
      out.write("\t\tmapOption = {\r\n");
      out.write("\t\t\tcenter : new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표\r\n");
      out.write("\t\t\tlevel : 5\r\n");
      out.write("\t\t// 지도의 확대 레벨\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t// 지도를 생성합니다    \r\n");
      out.write("\t\tvar map = new kakao.maps.Map(mapContainer, mapOption);\r\n");
      out.write("\t\t// 주소-좌표 변환 객체를 생성합니다\r\n");
      out.write("\t\tvar geocoder = new kakao.maps.services.Geocoder();\r\n");
      out.write("\t\tvar mapList = [ \r\n");
      out.write("\t\t\t\t{'name' : '일쁠루 비건베이킹랩','address' : '서울 강남구 봉은사로 461'}, \r\n");
      out.write("\t\t\t\t{'name' : '라탄벨라','address' : '서울 강남구 테헤란로83길 36 5층'}, \r\n");
      out.write("\t\t\t\t{'name' : '비옥크래프트','address' : '서울 강남구 삼성로119길 25 5층'}, \r\n");
      out.write("\t\t\t\t{'name' : '우든드로잉','address' : '서울 강남구 삼성로 554 예성빌딩'} \r\n");
      out.write("\t\t\t];\r\n");
      out.write("\t\tfunction gongbangMapMarker(name, address) {\r\n");
      out.write("\t\t\t// 주소로 좌표를 검색합니다\r\n");
      out.write("\t\t\tgeocoder.addressSearch(address,function(result, status) {\r\n");
      out.write("\t\t\t\t// 정상적으로 검색이 완료됐으면 \r\n");
      out.write("\t\t\t\tif (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\t\t\t\t\tvar coords = new kakao.maps.LatLng(\r\n");
      out.write("\t\t\t\t\t\t\tresult[0].y, result[0].x);\r\n");
      out.write("\t\t\t\t\t// 결과값으로 받은 위치를 마커로 표시합니다\r\n");
      out.write("\t\t\t\t\tvar marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t\t\t\t\tmap : map,\r\n");
      out.write("\t\t\t\t\t\tposition : coords\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t//console.log(\"name : \" + name + \" result[0].y : \" + result[0].y + \" result[0].x : \" + result[0].x);\r\n");
      out.write("\t\t\t\t\tvar url = \"<div style='padding:5px;z-index:1;font-size:14px;max-width:150px;overflow:hidden; text-overflow:ellipsis; white-space:nowrap;'>\" + name + \"<br/><a href=\\\"https://map.kakao.com/link/from/출발주소셋팅,37.50056323539089,127.03617340010295/to/\" + name + \",\" + result[0].y  + \",\" + result[0].x  + \"\\\" style=\\\"color:blue;font-size:12px;\\\" target=\\\"_blank\\\">길찾기</a></div>\";\r\n");
      out.write("\t\t\t\t\t//console.log(url);\r\n");
      out.write("\t\t\t\t\t// 인포윈도우로 장소에 대한 설명을 표시합니다\r\n");
      out.write("\t\t\t\t\tvar infowindow = new kakao.maps.InfoWindow({\r\n");
      out.write("\t\t\t\t\t\t\tcontent : url\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tinfowindow.open(map, marker);\r\n");
      out.write("\t\t\t\t\t// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다\r\n");
      out.write("\t\t\t\t\tmap.setCenter(coords);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* for(var i=0;i<mapList.length;i++){\r\n");
      out.write("\t\t\tgongbangMapMarker(mapList[i].name,mapList[i].address);\r\n");
      out.write("\t\t} */\r\n");
      out.write("\t\tfor(idx in mapList)\r\n");
      out.write("\t\t\tgongbangMapMarker(mapList[idx].name,mapList[idx].address);\r\n");
      out.write("\t</script>\r\n");
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
