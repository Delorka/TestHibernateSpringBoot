<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mama
  Date: 09.03.2018
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>${hello}</title>
  </head>
  <body>
  ${hello}

  <c:forEach var="rs" items="${resSet}">
    ${rs}
  </c:forEach>

  <br/>
  <br/>
  <c:forEach items="${allSet}" var="elem" varStatus="varStatus">
      <c:forEach items="${elem}" var="elemItem">
          ${elemItem}
      </c:forEach>
      <br/>
  </c:forEach>

  <br/>
  <br/>
  <c:forEach items="${list}" var="ls">
      ${ls.getCode()}
      ${ls.getName()}
      ${ls.getPassword()}
      <br/>
  </c:forEach>

  <br/>
  <br/>
  <jsp:text>Repository:</jsp:text>
  <c:forEach items="${people}" var="ps">
      ${ps.getCode()}
      ${ps.getName()}
      ${ps.getPassword()}
      <br/>
  </c:forEach>

 <%-- <br/>
  <br/>
  <jsp:text>Repository:</jsp:text>
  <c:forEach items="${testManyEntities}" var="ts">
      ${ts.getCode()}
      ${ts.getFam()}
      ${ts.getCodeTest()}
      <br/>
  </c:forEach>
--%>

  </tr>

  </body>
</html>
