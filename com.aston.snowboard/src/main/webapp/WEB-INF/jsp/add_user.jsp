<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp"%>
<%@include file="includes/subnav_users.jsp" %>
<div class="container">
    <div class="jumbotron">
        <h2>Accounts</h2>
    </div>
    <div class="col-lg-6 col-lg-offset-1">
        <form:form modelAttribute="userVO" action="/add_user" method="post" cssClass="form-horizontal">
            <fieldset>
                <legend>New Account</legend>
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
                    <h4>&nbsp;&nbsp;&nbsp;Address:</h4><br>
                    <label class="col-lg-3">Address Type:</label>
                    <div class="col-lg-9">
                        <form:select path="address.addressType" class="form-control">
                            <form:option value="-" label="Please Select"/>
                            <form:options/>
                        </form:select>
                        <br>
                    </div>
                    <label class="col-lg-3">Street:</label>
                    <div class="col-lg-9">
                        <form:input path="address.street" class="form-control"/>
                        <br>
                    </div>
                    <label class="col-lg-3">City:</label>
                    <div class="col-lg-9">
                        <form:input path="address.city" class="form-control"/>
                        <br>
                    </div>
                    <label class="col-lg-3">State:</label>
                    <div class="col-lg-9">
                        <form:input path="address.state" class="form-control"/>
                        <br>
                    </div>
                    <label class="col-lg-3">Zipcode:</label>
                    <div class="col-lg-9">
                        <form:input path="address.zipCode" class="form-control"/>
                        <br>
                    </div>
                    <label class="col-lg-3">Country:</label>
                    <div class="col-lg-9">
                        <form:input path="address.country" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-2 col-lg-offset-3">
                        <form:button class="btn btn-primary">Save</form:button>
                    </div>
                    <div class="col-lg-2">
                        <form:button type="reset" class="btn cancel-color">Cancel</form:button>
                    </div>
                </div>
            </fieldset>
        </form:form>
    </div>


</div>


<%@include file="includes/footer.jsp" %>