<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSearchSOAPClassProxyid" scope="session" class="DefaultNamespace.SearchSOAPClassProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSearchSOAPClassProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSearchSOAPClassProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSearchSOAPClassProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        DefaultNamespace.SearchSOAPClass getSearchSOAPClass10mtemp = sampleSearchSOAPClassProxyid.getSearchSOAPClass();
if(getSearchSOAPClass10mtemp == null){
%>
<%=getSearchSOAPClass10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        DefaultNamespace.StudentData[] getStudentList15mtemp = sampleSearchSOAPClassProxyid.getStudentList();
if(getStudentList15mtemp == null){
%>
<%=getStudentList15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getStudentList15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getStudentList15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 18:
        gotMethod = true;
        String firstName_1id=  request.getParameter("firstName21");
            java.lang.String firstName_1idTemp = null;
        if(!firstName_1id.equals("")){
         firstName_1idTemp  = firstName_1id;
        }
        String lastName_2id=  request.getParameter("lastName23");
            java.lang.String lastName_2idTemp = null;
        if(!lastName_2id.equals("")){
         lastName_2idTemp  = lastName_2id;
        }
        String city_3id=  request.getParameter("city25");
            java.lang.String city_3idTemp = null;
        if(!city_3id.equals("")){
         city_3idTemp  = city_3id;
        }
        String state_4id=  request.getParameter("state27");
            java.lang.String state_4idTemp = null;
        if(!state_4id.equals("")){
         state_4idTemp  = state_4id;
        }
        DefaultNamespace.StudentData[] getCollectionOfSearchStrings18mtemp = sampleSearchSOAPClassProxyid.getCollectionOfSearchStrings(firstName_1idTemp,lastName_2idTemp,city_3idTemp,state_4idTemp);
if(getCollectionOfSearchStrings18mtemp == null){
%>
<%=getCollectionOfSearchStrings18mtemp %>
<%
}else{
        String tempreturnp19 = null;
        if(getCollectionOfSearchStrings18mtemp != null){
        java.util.List listreturnp19= java.util.Arrays.asList(getCollectionOfSearchStrings18mtemp);
        tempreturnp19 = listreturnp19.toString();
        }
        %>
        <%=tempreturnp19%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>