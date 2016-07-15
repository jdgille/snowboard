<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp"%>

<div class="container">
    <div class="jumbotron">
        <h2>Stickman Snowboarding</h2>
    </div>
    <div class="col-lg-6 col-lg-offset-1">
        <form modelAttribute="addUser" action="/contact" method="post" cssClass="form-horizontal">
            <fieldset>
                <legend>Contact</legend>
                <hidden path="formId"/>
                <div class="form-group">
                    <label class="col-lg-3">First Name:</label>
                    <div class="col-lg-9">
                        <input path="firstName" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Last Name:</label>
                    <div class="col-lg-9">
                        <input path="lastName" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Email:</label>
                    <div class="col-lg-9">
                        <input path="email" class="form-control"/>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3">Comments:</label>
                    <div class="col-lg-9">
                        <textarea path="comments" name="comments" class="form-control" cols="25" rows="8"></textarea>
                        <br>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-2 col-lg-offset-3">
                        <button class="btn btn-primary">Send</button>
                    </div>
                    <div class="col-lg-2">
                        <button type="reset" class="btn cancel-color">Cancel</button>
                    </div>
                </div>
            </fieldset>
        </form>
    </div>
</div>

<%@include file="includes/footer.jsp" %>