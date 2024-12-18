<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/index.jsp">MyWebApp</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="<%=request.getContextPath() %>/index.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/demo?page=about">About</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/demo?page=contact">Contact</a>
            </li>            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/demo?page=login">Login</a>
            </li>            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/demo?page=signup">SignUP</a>
            </li>
        </ul>
    </div>
</nav>