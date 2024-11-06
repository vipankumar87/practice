<jsp:include page="parts/header.jsp"></jsp:include>
<jsp:include page="parts/navbar.jsp"></jsp:include>
<div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
    <div class="col-md-4">
        <h2 class="text-center mb-4">Login</h2>
        <form action="<%=request.getContextPath() %>/login" method="POST">
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Login</button>
        </form>
    </div>
</div>
<jsp:include page="parts/footer.jsp"></jsp:include>