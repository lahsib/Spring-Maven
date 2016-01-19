<%@include file="../header.jsp" %>
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
              <h3 class="box-title">Courses</h3>
                <div class="pull-right">
                <p>
                    <a href="${SITE_URL}/admin/courses/add" class="btn btn-primary btn-sm" title="Add Course">
                        <span class="glyphicon glyphicon-plus"></span>
                    </a>
                </p>
                </div>
            </div>
            <div class="box-body">
                <table class="table table-bordered table-striped table-hover">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Duration</th>
                <th>Fees</th>
                <th>Added Date</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
            <c:forEach var="course" items="${courses}">
                <tr>
                    <td>${course.id}</td>
                    <td>${course.name}</td>
                    <td>${course.duration} ${course.durationType}</td>
                    <td>${course.fees}</td>
                    <td>${course.addedDate}</td>
                    <td>${course.status}</td>
                    <td>
                        <a href="${SITE_URL}/admin/courses/edit/${course.id}" class="btn btn-success btn-sm" title="Edit Course">
                            <span class="glyphicon glyphicon-pencil"></span>
                        </a>
                        <a href="${SITE_URL}/admin/courses/delete/${course.id}" class="btn btn-danger btn-sm" title="Delete Course">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>    
                    </td>
                </tr>
            </c:forEach>
        </table>    
            </div><!-- /.box-body -->
           <!-- <div class="box-footer">
              Footer
            </div> /.box-footer-->
          </div><!-- /.box -->

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
<%@include file="../footer.jsp" %>