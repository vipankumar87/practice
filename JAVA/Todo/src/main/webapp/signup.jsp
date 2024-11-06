<jsp:include page="parts/header.jsp"></jsp:include>
<jsp:include page="parts/navbar.jsp"></jsp:include>
<div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
    <div class="col-md-4">
        <h2 class="text-center mb-4">Sign Up</h2>
        <jsp:useBean id="user" class="com.rudra.beans.User" scope="session"></jsp:useBean>
        
        <form action="" method="GET">
        <jsp:getProperty property="firstname" name="user"/>
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" name="username" required value='<jsp:getProperty property="firstname" name="user"/>'>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Sign Up</button>
        </form>
    </div>
</div>
<jsp:include page="parts/footer.jsp"></jsp:include>