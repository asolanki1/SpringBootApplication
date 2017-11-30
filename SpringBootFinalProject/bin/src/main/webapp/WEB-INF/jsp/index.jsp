<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Course Scheduler App</title>
    <!-- Bootstrap -->
         <link href="bootstrap.min.css" rel="stylesheet">
    <style>
        .navbar{
            margin-bottom:0;
            border-radius:0;
        }
        .margin-left{
            margin-right: 5px;
        }
        .jumbotron{
            margin-bottom:0;
            border-radius:0;
        }

    </style>
</head>
<body>
<!--navbar satarts-->
<nav class="navbar  navbar-dark">
    <!-- navbar container starts -->
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-list"></span><bold> Course Scheduler</bold></a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="#">Features</a></li>
                <li><a href="#">About</a></li>
            </ul>

            <!-- sign in -->

            <!--inline sign in form---
              <form class="form-inline" class="navbar-form">
                 <div class="form-group mx-sm-3">
                   <label for="inputUsername" class="sr-only"></label>
                   <input type="text" class="form-control" id="inputPassword2" placeholder="Username">
                 </div>
                 <div class="form-group mx-sm-3">
                   <label for="inputPassword2" class="sr-only">Password</label>
                   <input type="password" class="form-control" id="inputPassword2" placeholder="Password">
                 </div>
                 <button type="submit" class="btn btn-primary">Confirm identity</button>
                 <button type="button" class="btn btn-primary navbar-btn pull-right col-sm-1 navbar-btn" data-target="#loginModal" data-toggle="modal">Sign in</button>
               </form>
             -->

            <button type="button" class="btn btn-primary navbar-btn pull-right col-sm-1 navbar-btn" data-target="#loginModal" data-toggle="modal">Sign in</button>

            <!-- sign in modal -->
            <div class="modal fade" data-kayboard="false" data-backdrop="static"  id="loginModal">
                <div class="modal-dialog modal-sm" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">x</button>
                            <h4>Login to Course Scheduler</h4>
                        </div>
                        <div class="modal-body">
                            <form method="post" action='' name="login_form">
                                <div class="form-group">
                                    <label for="signInUsername">Username:</label>
                                    <input type="text" class="form-control" name="signInUsername" id="signInUsername" placeholder="Username">
                                </div>
                                <div class="form-group">
                                    <label for="signInPassword">Password:</label>
                                    <input type="password" class="form-control" name="signInPassword" id="signInPassword" placeholder="Password">
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-primary" data-dismiss="modal">Close</button>
                            <button class="btn btn-primary">Sign in</button>
                        </div>
                    </div>
                </div>
            </div><!-- sign in modal ends-->


            <!-- signup-->
            <button type="button" class="btn btn-primary navbar-btn pull-right col-sm-1 navbar-btn margin-left" data-target="#signUpModal" data-toggle="modal">Sign Up</button>
            <!-- signup modal-->
            <div class="modal fade" data-kayboard="false" data-backdrop="static"  id="signUpModal">
                <div class="modal-dialog modal-sm" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">x</button>
                            <h4>Sign up to Course Scheduler</h4>
                        </div>
                        <div class="modal-body">
                            <form method="post" action='' name="login_form">
                                <div class="form-group">
                                    <label for="signUpUserName">Username:</label>
                                    <input type="text" class="form-control" name="signUpUserName" id="signUpUserName" placeholder="Username">
                                </div>
                                <div class="form-group">
                                    <label for="signUpEmail">Email:</label>
                                    <input type="email" class="form-control" name="signUpEmail" id="signUpEmail" placeholder="Email">
                                </div>
                                <div class="form-group">
                                    <label for="signUpPassword">Password:</label>
                                    <input type="password" class="form-control" name="signUpPassword" id="signUpPassword" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="signUpConfPassword">Confirm Password:</label>
                                    <input type="password" class="form-control" name="signUpConfPassword" id="signUpConfPassword" placeholder="Confirm Password">
                                </div>

                            </form>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-primary" data-dismiss="modal">Close</button>
                            <button class="btn btn-primary">Sign Up</button>
                        </div>
                    </div>
                </div>
            </div><!-- sign up modal ends -->

        </div>
    </div><!-- navbar container ends -->
</nav><!-- navbar ends -->


<!-- jumbotron starts -->
<div class="jumbotron text-center">
    <div class="container">
        <h3>Welcome to Course Scheduler</h3>
        <p>One stop destination to all course activities</p>
    </div>
</div><!-- jumbotron ends -->


<div class="container"><!--container starts-->

    <!-- add course, activity button row starts -->
    <div class="row">

        <!-- add course -->
        <div class="container col-12 col-md-3">
            <button type="button" class="btn btn-success navbar-btn pull-left col-sm-12 navbar-btn" data-target="#addCourseModal" data-toggle="modal">Add course</button>
            <!-- add course modal-->
            <div class="modal fade" data-kayboard="false" data-backdrop="static"  id="addCourseModal">
                <div class="modal-dialog modal-default" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">x</button>
                            <h4>Add New Course</h4>
                        </div>
                        <div class="modal-body">
                            <form method="post" action='' name="add_course_form" >
                                <div class="form-group">
                                    <label for="newCourseName">Course Name:</label>
                                    <input type="text" class="form-control" name="newCourseName" id="newCourseName" placeholder="Course Name">
                                </div>
                                <div class="form-group">
                                    <label for="newCourseCode">Course Code:</label>
                                    <input type="text" class="form-control" name="newCourseCode" id="newCourseCode" placeholder="Course Code">
                                </div>
                                <div class="form-group">
                                    <label for="newCourseSemFall">Course Semester:</label>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input class="form-check-input" type="radio" name="newCourseSemFall" id="newCourseSemFall" value="option1">Fall
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input class="form-check-input" type="radio" name="newCourseSemSpring" id="newCourseSemSpring" value="option2">Spring
                                        </label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="taName">Teaching Assistant Name:</label>
                                    <input type="text" class="form-control" name="taName" id="taName" placeholder="Teaching Assistant Name">
                                </div>
                                <div class="form-group">
                                    <label for="taEmail">Teaching Assistant Email:</label>
                                    <input type="email" class="form-control" name="taEmail" id="taEmail" placeholder="Teaching Assistant Email">
                                </div>
                                <div class="form-group">
                                    <label for="taPhone">Teaching Assistant Contact # :</label>
                                    <input type="email" class="form-control" name="taPhone" id="taPhone" placeholder="Teaching Assistant Contact #">
                                </div>

                            </form>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-primary" data-dismiss="modal">Close</button>
                            <button class="btn btn-primary">Add Course</button>
                        </div>
                    </div>
                </div>
            </div><!-- add course modal ends -->
        </div> <!-- add course ends -->



        <!-- add activity -->
        <div class="container col-12 col-md-9">
            <button type="button" class="btn btn-success pull-right col-sm-3 navbar-btn" data-target=#addActivityModal data-toggle="modal">Add activity</button>

            <!-- add activity modal-->
            <div class="modal fade" data-kayboard="false" data-backdrop="static"  id="addActivityModal">
                <div class="modal-dialog modal-default" role="document">
                    <div class="modal-content">

                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">x</button>
                            <h4>Add New Activity</h4>
                        </div>

                        <div class="modal-body">
                            <form method="post" action='' name="add_activity_form">

                                <div class="form-group">
                                    <label for="activityName">Course Name</label>
                                    <input type="text" class="form-control" name="activityName" id="activityName" placeholder="Course Name">
                                </div>
                                <div class="form-group">
                                    <label for="activityCode">Course Code</label>
                                    <input type="text" class="form-control" name="activityCode" id="activityCode" placeholder="Course Code">
                                </div>
                                <div class="form-group">
                                    <label for="activityType">Activity Type</label>
                                    <input type="text" class="form-control" name="activityType" id="activityType" placeholder="Activity Type">
                                </div>
                                <div class="form-group">
                                    <label for="activityDate">Activity Date</label>
                                    <div class='input-group date' id='activityDate'>

                                        <input type='text' class="form-control" />
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="exampleFormControlFile1">Upload file</label>
                                    <input type="file" class="form-control-file" id="exampleFormControlFile1">
                                </div>


                            </form>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-primary" data-dismiss="modal">Close</button>
                            <button class="btn btn-primary">Add Activity</button>
                        </div>
                    </div>
                </div>
            </div><!-- add activity modal ends -->

        </div> <!-- add activity ends -->
    </div><!-- add course, activity button row ends -->


    <!-- left, right panel starts -->
    <div class="row">
        <!-- left sidebard starts -->
        <div class="col-12 col-md-3 sidebar-offcanvas" id="sidebar">
            <div class="list-group table-condensed" >
                <a href="#" class="list-group-item active">Course List</a>
                <a href="#" class="list-group-item">ITMD 515 - Adavnced Software Programming</a>
                <a href="#" class="list-group-item">ITMD 566 - Service Oriented Architectrue</a>
                <a href="#" class="list-group-item">CS 525 - Database Organization</a>
                <a href="#" class="list-group-item">CS 445 - Object Oriented Design and Programing</a>
            </div>
            <div>
                <button type="button" class="btn btn-primary btn-block">Activity Log</button>
            </div>
        </div><!-- left sidebard ends -->

        <!-- Right panel starts -->
        <div class="col-12 col-md-9 table-responsive">
            <table class="table table-striped table-bordered table-condensed">
                <thead>
                <tr>
                    <th class="col-xs-2 text-center">Date</th>
                    <th class="col-xs-6 text-center">Course Activity</th>
                    <th class="col-xs-2 text-center">Action</th>
                    <th class="col-xs-1 text-center">Status</th>
                    <th class="col-xs-1 text-center">Edit</th>
                    <th class="col-xs-1 text-center">Delete</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td class="col-xs-2 text-center">1 November</td>
                    <td class="col-xs-6 text-left">ITMD 515 - Assignment 2</td>
                    <td class="col-xs-2 text-center">Upload on BB</td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-ok"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-glyphicon glyphicon-pencil"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon glyphicon-trash"></span></td>
                </tr>
                <tr>
                    <td class="col-xs-2 text-center">1 November</td>
                    <td class="col-xs-6 text-left">ITMD 515 - Assignment 2</td>
                    <td class="col-xs-2 text-center">Upload on BB</td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-ok"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-glyphicon glyphicon-pencil"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon glyphicon-trash"></span></td>
                </tr>
                <tr>
                    <td class="col-xs-2 text-center">1 November</td>
                    <td class="col-xs-6 text-left">ITMD 515 - Assignment 2</td>
                    <td class="col-xs-2 text-center">Upload on BB</td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-ok"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-glyphicon glyphicon-pencil"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon glyphicon-trash"></span></td>
                </tr>
                <tr>
                    <td class="col-xs-2 text-center">16 November</td>
                    <td class="col-xs-6 text-left">ITMD 515 - Final Project</td>
                    <td class="col-xs-2 text-center">Grad on BB</td>
                    <td class="col-xs-1 text-center"><input type="checkbox" value=""></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-glyphicon glyphicon-pencil"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon glyphicon-trash"></span></td>
                </tr>
                <tr>
                    <td class="col-xs-2 text-center">16 November</td>
                    <td class="col-xs-6 text-left">ITMD 515 - Final Project</td>
                    <td class="col-xs-2 text-center">Grad on BB</td>
                    <td class="col-xs-1 text-center"><input type="checkbox" value=""></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-glyphicon glyphicon-pencil"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon glyphicon-trash"></span></td>
                </tr>
                <tr>
                    <td class="col-xs-2 text-center">16 November</td>
                    <td class="col-xs-6 text-left">ITMD 515 - Final Project</td>
                    <td class="col-xs-2 text-center">Grad on BB</td>
                    <td class="col-xs-1 text-center"><input type="checkbox" value=""></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-glyphicon glyphicon-pencil"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon glyphicon-trash"></span></td>
                </tr><tr>
                    <td class="col-xs-2 text-center">16 November</td>
                    <td class="col-xs-6 text-left">ITMD 515 - Final Project</td>
                    <td class="col-xs-2 text-center">Grad on BB</td>
                    <td class="col-xs-1 text-center"><input type="checkbox" value=""></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon-glyphicon glyphicon-pencil"></span></td>
                    <td class="col-xs-1 text-center"><span class="glyphicon glyphicon glyphicon-trash"></span></td>
                </tr>

                </tbody>
            </table>
        </div><!-- Right panel starts -->

    </div><!-- left, right panel starts -->


</div><!--container ends-->

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script scr="js/jquery-1.11.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</body>
</html>
