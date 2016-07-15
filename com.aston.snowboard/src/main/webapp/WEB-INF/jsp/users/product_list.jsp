<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp"%>
<%@include file="../includes/subnav_users.jsp" %>

<div class="container">
    <div class="jumbotron">
        <h2>Accounts</h2>
    </div>
    <div class="col-sm-12">
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>ID</th>
                <th>Brand Name</th>
                <th>Board Name</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="snowboard" items="${snowboardList}">
                <tr>
                    <td>${snowboard.id}</td>
                    <td>${snowboard.brandName}</td>
                    <td>${snowboard.boardName}</td>
                    <td><a href="/users/edit_product/${snowboard.id}">Edit</a></td>
                    <td><a href="/users/delete_product/${snowboard.id}">Delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</div>

<%@include file="../includes/footer.jsp" %>