<%@ tag body-content="empty"%>
<%@ tag import="java.util.Calendar"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%
	Calendar cal = Calendar.getInstance();
%>
<%= cal.get(Calendar.YEAR) %>년
<%= cal.get(Calendar.MONTH)+1 %>월
<%= cal.get(Calendar.DATE) %>일