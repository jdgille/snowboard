<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp"%>
<%@include file="../includes/subnav_users.jsp" %>

<div class="container">
    <div class="jumbotron">
        <h2>Accounts</h2>
    </div>
    <div class="col-lg-6 col-lg-offset-1">
        <form:form modelAttribute="userVO" action="/users/edit_user" method="post" cssClass="form-horizontal">
            <fieldset>
                <form:hidden path="person.id"/>
                <form:hidden path="person.version"/>
                <legend>Edit Account</legend>
                <div class="form-group">
                    <label class="col-lg-3">User Name:</label>
                    <div class="col-lg-9">
                        <form:input path="person.userName" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">First Name:</label>
                    <div class="col-lg-9">
                        <form:input path="person.firstName" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Last Name:</label>
                    <div class="col-lg-9">
                        <form:input path="person.lastName" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Email:</label>
                    <div class="col-lg-9">
                        <form:input path="person.email" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                <label class="col-lg-3">Password:</label>
                <div class="col-lg-9">
                    <form:input type="password" path="password" class="form-control"/>
                    <br>
                    <br>
                </div>
            </div>
                <div class="form-group">
                    <table class="table table-striped table-hover">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>Address Type</th>
                            <th>Edit</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="address" items="${addressList}">
                            <tr>
                                <td>${address.id}</td>
                                <td>${address.addresstype}</td>
                                <td><a href="/users/edit_product/${address.id}">Edit</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="form-group">
                    <div class="col-lg-2 col-lg-offset-3">
                        <form:button class="btn btn-primary">Save</form:button>
                    </div>
                    <%--<div class="col-lg-2">--%>
                        <%--<form:button type="reset" class="btn cancel-color">Cancel</form:button>--%>
                    <%--</div>--%>
                </div>
            </fieldset>
        </form:form>
    </div>





</div>

<%@include file="../includes/footer.jsp" %>