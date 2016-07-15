<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp" %>
<%@include file="../includes/subnav_snowboards.jsp" %>
<c:url value="/static/js/likeBoard.js" var="likeBoardJS"/>
<script src="${likeBoardJS}"></script>
<div class="container">
    <div class="jumbotron">
        <h2>Camber Snowboards</h2>
    </div>
    <div>
        <table class="col-lg-9 table table-striped">
            <tbody>
                <c:forEach var="snowboard" items="${snowboardList}">
                    <tr>
                        <td>
                            <a href="${snowboard.photo}" target="_blank"><img class="col-lg-1" src="${snowboard.photo}" height="100" width="60"></a>
                            <div class="row col-lg-11">
                                <div class="col-lg-8">
                                        ${snowboard.brandName}
                                </div>
                                <div class="col-lg-4">
                                    Cost: ${snowboard.cost}
                                </div>
                            </div>
                            <div class="row col-lg-11">
                                <div class="col-lg-8">
                                        ${snowboard.boardName}
                                </div>
                                <div class="col-lg-4">
                                    <a href="/purchase${snowboard.id}">Buy $$$$$</a>
                                </div>
                            </div>
                            <div class="row col-lg-11">
                                <div class="col-lg-2">
                                    Description:
                                </div>
                                <div class=" col-lg-6">
                                    <p>${snowboard.description}</p>
                                </div>
                                <div class="col-lg-4">
                                    <div class="badge">
                                        <span data-id="${snowboard.id}" class="likeCount">${snowboard.likeCount}</span>&nbsp;
                                        <span class="like glyphicon glyphicon-thumbs-up" style="color: #bcc2c6"></span>&nbsp;
                                    </div>
                                    <div class="badge">
                                        <span data-id="${snowboard.id}" class="dislikeCount">${snowboard.dislikeCount}</span>&nbsp;
                                        <span class="dislike glyphicon glyphicon-thumbs-down" style="color: #bcc2c6"></span>
                                    </div>
                                </div>
                            </div>
                        </td>
                    </tr>

                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<%@include file="../includes/footer.jsp" %>


