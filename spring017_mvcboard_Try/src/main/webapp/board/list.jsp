<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include  file="../inc/header.jsp" %>
<!--  END HEADER -->


<div class="container"   style="margin-top:5%; min-height:500px">
	<h3>MULTIBOARD</h3>
	<table  class="table table-striped">
		<caption>MULTIBOARD - MVC1</caption>
		<thead>
			<tr>
				<th scope="col">NO</th>
				<th scope="col">TITLE</th>
				<th scope="col">WRITER</th>
				<th scope="col">DATE</th>
				<th scope="col">HIT</th>
			</tr>
		</thead>
		<tbody>	
 			<c:set var="total"  value="${list.size()}"/>
 			<c:forEach  var="dto"  items="${list}"  varStatus="status">
				<tr>
					<td>${total-status.index}</td>
					<td><a href="detail.board?bno=${dto.bno}">${dto.btitle}</a></td>
					<td>${dto.bname}</td>
					<td>${dto.bdate}</td>
					<td>${dto.bhit}</td>
				</tr>
 			</c:forEach>
		</tbody>
	</table>
	<p class="text-right"><a href="write_view.board"   class="btn btn-danger">글쓰기</a></p>
</div>

<!-- END FOOTER -->
<%@ include  file="../inc/footer.jsp" %>