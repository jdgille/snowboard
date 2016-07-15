<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp"%>
<%@include file="../includes/subnav_users.jsp" %>

<div class="container">
    <div class="jumbotron">
        <h2>Accounts</h2>
    </div>
    <div class="col-lg-6 col-lg-offset-1">
        <form:form modelAttribute="snowboard" action="/users/update_product" method="post" cssClass="form-horizontal">
            <fieldset>
                <form:hidden path="id"/>
                <form:hidden path="version"/>
                <legend>Update Product</legend>
                <div class="form-group">
                    <label class="col-lg-3">Brand Name:</label>
                    <div class="col-lg-9">
                        <form:input path="brandName" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Board Name:</label>
                    <div class="col-lg-9">
                        <form:input path="boardName" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Board Length:</label>
                    <div class="col-lg-9">
                        <form:input path="length" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Board Type:</label>
                    <div class="col-lg-9">
                        <form:select path="boardType" class="form-control">
                            <form:option value="-" label="Please Select"/>
                            <form:options/>
                        </form:select>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Cost:</label>
                    <div class="col-lg-9">
                        <form:input path="cost" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Description:</label>
                    <div class="col-lg-9">
                        <form:textarea path="description" class="form-control" cols="25" rows="8"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Photo:</label>
                    <div class="col-lg-9">
                        <form:input type="file" path="photo" size="25"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-2 col-lg-offset-3">
                        <button class="btn btn-primary">Update</button>
                    </div>
                </div>
            </fieldset>
        </form:form>
    </div>





</div>
<%@include file="../includes/footer.jsp" %>
