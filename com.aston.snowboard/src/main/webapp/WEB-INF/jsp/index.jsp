<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp"%>

<div class="container">
    <div class="jumbotron">
        <div class="col-lg-3 col-md-3 col-sm-4 photo-top">
        <img class="photo-border" src="../static/images/peak_8.jpg" height="160" width="160">
        </div>
        <h2>Stickman Snowboarding</h2>
        <h3>Snowboard Swap</h3>
    </div>
    <div class="container">
        <div>
            <h3>A place to connect riders to used snowboards, binding, boots, and clothes.</h3>
        </div>

        <div class="col-sm-4">
            <div class="col-sm-offset-1 col-md-offset-3 col-lg-offset-3">
                <h5>Have an account? Please Sign In.</h5>
                <h5>If not, <a href="/add_user">Sign up!</a></h5>
            </div>
            <form id="form" action="<c:url value='/login.do'/>" method="post">

                <c:if test="${not empty param.err}">
                    <div class="msg-container error">
                        <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
                    </div>
                </c:if>
                <c:if test="${not empty param.out}">
                    <div class="msg-container logout">
                        You've logged out successfully.
                    </div>
                </c:if>
                <c:if test="${not empty param.time}">
                    <div class="msg-container time">
                        You've been logged out due to inactivity.
                    </div>
                </c:if>

                <span class="text-white">Username:</span>
                <input type="text" name="username" value=""/>
                <br><br>
                <span class="text-white">Password:&nbsp</span>
                <input type="password" name="password" value=""/>

                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                <br/>
                <br/>
                <input value="Login" name="submit" type="submit" class="btn btn-default col-sm-offset-1 col-md-offset-3 col-lg-offset-2"/>
            </form>
        </div>
    </div>
</div>
<%@include file="includes/footer.jsp" %>
