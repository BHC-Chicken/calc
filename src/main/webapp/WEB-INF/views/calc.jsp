<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%--<%--%>
<%--Object resultObject = request.getAttribute("result");--%>
<%--Integer result = resultObject instanceof  Integer ? (Integer) resultObject : null;--%>
<%--%>--%>
<%-- 이 파일이 JSP 파일임을 나타냄. java 언어를 사용하겠다는 선언으로 실제 클라이언트한테는 보이지않음. --%>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>계산기</title>
</head>
<body>
<%--<div>1부터 10까지의 합은?</div>--%>
<%--<%--%>
<%--int sum=0;--%>
<%--for(int i=1; i<11; i++) {--%>
<%--    sum += i;--%>
<%--}--%>
<%--%>--%>
<%--<h2><%= sum %></h2>--%>
<form method="post">
    <input name = "a" type="number" value="${calcVo == null ? 0 : calcVo.a}">
    <select name="op">
        <option value="add" ${calcVo.op.equals("add") ? "selected" : " "}>+</option>
        <option value="sub" ${calcVo.op.equals("sub") ? "selected" : " "}>-</option>
        <option value="mul" ${calcVo.op.equals("mul") ? "selected" : " "}>*</option>
        <option value="div" ${calcVo.op.equals("div") ? "selected" : " "}>/</option>
    </select>
    <input name = "b" type="number" value="${calcVo == null ? 0 : calcVo.b}">
    <input type="submit" value="계산">
</form>
<div>
    <% if (request.getAttribute("result")==null) { %>
    <a> 값을 입려갛고 계산 버튼을 클릭해주세요.</a>
    <% } else { %>
    <a>연산 결과는 "<b>${result}</b>" 입니다.</a>
    <% } %>

<%--    <% if (result==null) { %>--%>
<%--    <a> 값을 입려갛고 계산 버튼을 클릭해주세요.</a>--%>
<%--    <% } else { %>--%>
<%--    <a>연산 결과는 "<b><%=result%></b>" 입니다.</a>--%>
<%--    <% } %>--%>
</div>
</body>
</html>