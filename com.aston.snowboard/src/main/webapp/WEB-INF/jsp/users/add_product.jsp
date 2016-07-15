<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp"%>
<%@include file="../includes/subnav_users.jsp" %>
<div class="container">
    <div class="jumbotron">
        <h2>Accounts</h2>
    </div>
    <div><h3>still need to make sure this product is connected to a certain user</h3></div>
    <div class="col-lg-6 col-lg-offset-1">
        <form:form modelAttribute="productVO" action="/users/product_list" method="post" cssClass="form-horizontal">
            <fieldset>
                <legend>New Product</legend>
                <div class="form-group">
                    <label class="col-lg-3">Brand Name:</label>
                    <div class="col-lg-9">
                        <form:input path="snowboard.brandName" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Board Name:</label>
                    <div class="col-lg-9">
                        <form:input path="snowboard.boardName" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Board Length:</label>
                    <div class="col-lg-9">
                        <form:input path="snowboard.length" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Board Type:</label>
                    <div class="col-lg-9">
                        <form:select path="snowboard.boardType" class="form-control">
                            <form:option value="-" label="Please Select"/>
                            <form:options/>
                        </form:select>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Cost:</label>
                    <div class="col-lg-9">
                        <form:input path="snowboard.cost" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Description:</label>
                    <div class="col-lg-9">
                        <form:textarea path="snowboard.description" class="form-control" cols="25" rows="8"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Photo:</label>
                    <div class="col-lg-9">
                        <form:input type="file" path="snowboard.photo" size="25"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-2 col-lg-offset-3">
                        <button class="btn btn-primary">Save</button>
                    </div>
                    <div class="col-lg-2">
                        <button type="reset" class="btn cancel-color">Cancel</button>
                    </div>
                </div>
            </fieldset>
        </form:form>
    </div>

</div>
<%@include file="../includes/footer.jsp" %>