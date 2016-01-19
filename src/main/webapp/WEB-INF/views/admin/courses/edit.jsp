<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Dashboard
            <small>it all starts here</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Dashboard</a></li>
            <li class="active">Blank page</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">

          <!-- Default box -->
          <div class="box">
            <div class="box-header with-border">
              <h3 class="box-title">Edit Courses</h3>
                
            </div>
            <div class="box-body">
               <form:form modelAttribute="Course" action="${SITE_URL}/admin/courses/save" method="post" role="form">
    <div class="form-group">
        <label>Name</label>
        <form:input path="name"  placeholder="Enter Name" required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Description</label>
        <form:textarea path="description" placeholder="Enter Description" required="required"  class="form-control"/>
    </div> 
    <div class="form-group">
        <label>Duration</label>
        <form:input path="duration" placeholder="Enter Duration" required="required"  class="form-control"/>
        <form:select path="durationType" required="required"  class="form-control">
            <option value="">Select Duration Type</option>
            <option value="days">Days</option>
            <option value="week">Weeks</option>
            <option value="month">Months</option>
            <option value="year">Years</option>
        </form:select>
    </div>  
    <div class="form-group">
        <label>Fees</label>
        <form:input path="fees" placeholder="Enter Fees" required="required"  class="form-control"/>
    </div> 
     <div class="checkbox">
        <label>
            <form:checkbox path="status" value="1"/> Status
        </label>
    </div>  
            <form:hidden path="id"/>
    <button type="submit" class="btn btn-success">Save</button>
    </form:form>     
            </div><!-- /.box-body -->
           <!-- <div class="box-footer">
              Footer
            </div> /.box-footer-->
          </div><!-- /.box -->

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
<%@include file="../footer.jsp" %>